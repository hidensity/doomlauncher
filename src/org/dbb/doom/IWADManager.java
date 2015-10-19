package org.dbb.doom;

import org.dbb.doom.wadinfo.*;
import org.dbb.utils.Helpers;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * IWAD Manager
 * Class to retrieve an IWAD's information.
 *
 * Created by dennis on 16.10.15.
 */
public class IWADManager {

    /**
     * Predefined IWAD configurations.
     */
    public static final List<IWADInfo> PREDEFINED_IWAD;
    static {
        PREDEFINED_IWAD = new ArrayList<>();
        // IMPORTANT:
        // The order of these predefined IWADs absolutely needs to be kept!!!
        // They must be sorted in identification order (easiest to recognize first).
        PREDEFINED_IWAD.add(new FreeDMIWADInfo());                  // FreeDM
        PREDEFINED_IWAD.add(new Freedoom2IWADInfo());               // Freedoom - Phase 2
        PREDEFINED_IWAD.add(new Freedoom1IWADInfo());               // Freedoom - Phase 1
        PREDEFINED_IWAD.add(new FreedoomDemoIWADInfo());            // Freedoom Demo
        PREDEFINED_IWAD.add(new DoomBfgIWADInfo());                 // DOOM: BFG Edition
        PREDEFINED_IWAD.add(new UltimateDoomIWADInfo());            // The Ultimate DOOM
        PREDEFINED_IWAD.add(new DoomIWADInfo());                    // DOOM (Registered)
        PREDEFINED_IWAD.add(new DoomSharewareIWADInfo());           // DOOM Shareware
        PREDEFINED_IWAD.add(new TNTIWADInfo());                     // Final DOOM: TNT - Evilution
        PREDEFINED_IWAD.add(new PlutoniaIWADInfo());                // Final DOOM: Plutonia Experiment
        PREDEFINED_IWAD.add(new Doom2BfgIWADInfo());                // DOOM 2: BFG Edition
        PREDEFINED_IWAD.add(new Doom2IWADInfo());                   // DOOM 2
    }

    /**
     * File name of the IWADManager file.
     */
    private String filename;

    /**
     * File handler.
     */
    private File file;

    /**
     * Access to the WAD file itself.
     */
    private RandomAccessFile wad;

    /**
     * File length in byte.
     */
    private long fileSize;

    /**
     * IWAD information.
     */
    private IWADInfo iwadInfo;

    /**
     * File channel to read WAD data.
     */
    private FileChannel fc;

    /**
     * WAD file's header.
     */
    private WADHeader header;

    /**
     * Number of lumps in the WAD.
     */
    private int numLumps;

    /**
     * Position of the directory.
     */
    private int infoTableOffset;

    /**
     * Is file formatted in little- or big-endian?
     * By default we assume little-endian.
     */
    private boolean bigEndian = false;

    /**
     * List of lumps in the WAD.
     */
    private List<WADLump> lumps;

    /**
     * List with found lump names.
     */
    private List<String> lumpNames;

    /**
     * Creates a new IWADManager object.
     * @param filename Name of the IWADManager file to use.
     * @throws IllegalArgumentException if an invalid IWAD file has been specified.
     * @throws IOException if file could not be read or is a directory.
     */
    public IWADManager(String filename) throws Exception {
        if (null == filename) {
            throw new IllegalArgumentException("IWAD file name must not be null.");
        }

        // Check if file exists.
        this.file = new File(filename);
        this.filename = this.file.getCanonicalPath();
        if (!this.file.exists() || this.file.isDirectory()) {
            throw new IOException("The specified IWAD was not found or is a directory (" + filename + ").");
        }

        // Open the file.
        openIWAD();

        // Read WAD files header.
        this.header = readWADHeader();

        // Get WAD's endianess.
        this.bigEndian = isBigEndian();

        // Check the file.
        if (!isIWAD()) {
            throw new IllegalArgumentException("Specified file is not a valid IWAD.");
        }

        // Get the lumps from WAD.
        this.lumps = readWADLumps();

        // Get the game information for this IWAD.
        this.iwadInfo = parseIWADInfo();
        if (null == this.iwadInfo) {
            throw new IllegalArgumentException("For the specified file, no IWAD definition could be retrieved.");
        }

        // Close the WAD file.
        closeWAD();
    }

    /**
     * Gets the IWAD information.
     * @return IWADInfo
     */
    public IWADInfo getIWADInfo() {
        return this.iwadInfo;
    }

    /**
     * Gets the IWAD's file name.
     * @return String
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * Opens the IWADManager file for reading.
     * @throws IllegalArgumentException if file length is < 12.
     * @throws IOException if file could not be read.
     */
    private void openIWAD() throws Exception {
        this.fileSize = this.file.length();
        if (this.fileSize < WADHeader.SIZE_OF) {
            throw new IllegalArgumentException("Invalid IWAD specified. " +
                    "File does not even contain header information.");
        }

        try {
            this.wad = new RandomAccessFile(this.file, "r");
            this.fc = this.wad.getChannel();
        } catch (Exception e) {
            throw new IOException("IWAD file could not be read.", e);
        }
    }

    /**
     * Closes the WAD file.
     * @throws Exception if any error occurred.
     */
    public void closeWAD() throws Exception {
        this.wad.close();
    }

    /**
     * Checks, whether the current WAD file information has big-endianess.
     * @return boolean
     */
    private boolean isBigEndian() {
        // Check to see if the little endian interpretation is valid.
        // This should be sufficient to detect big-endian WADs.
        if ((this.infoTableOffset + this.numLumps * WADLump.SIZE_OF) > this.fileSize) {
            this.numLumps = Helpers.byteArrayToBigEndianInt(this.header.getNumLumps());
            this.infoTableOffset = Helpers.byteArrayToBigEndianInt(this.header.getInfoTableOffset());
            return true;
        }

        return false;
    }

    /**
     * Checks, whether it is an IWAD file.
     * @return boolean
     */
    private boolean isIWAD() throws IOException {
        // Check magic number.
        return (null != this.header &&
                null != this.header.getMagicNumber() &&
                (
                        new String(this.header.getMagicNumber()).equals(WADHeader.TYPE_IWAD) ||
                        // In some cases, e.g. DOOM2 BFG, the original WAD file has PWAD as magic
                        // number.
                        new String(this.header.getMagicNumber()).equals(WADHeader.TYPE_PWAD)
                )
        );
    }

    /**
     * Reads the WAD files header.
     * @return WADHeader object.
     * @throws IOException in case the file could not be read.
     */
    private WADHeader readWADHeader() throws IOException {
        // Read the first 12 bytes from the WAD file.
        ByteBuffer buffer = ByteBuffer.allocate(WADHeader.SIZE_OF);
        this.fc.position(0);
        this.fc.read(buffer);

        byte[] bytes = buffer.array();
        byte[] magic = Arrays.copyOfRange(bytes, 0, 4);
        byte[] numLumps = Arrays.copyOfRange(bytes, 4, 8);
        byte[] tableOffset = Arrays.copyOfRange(bytes, 8, 12);

        // We assume that the WAD's endianess is little-endian.
        this.numLumps = Helpers.byteArrayToLittleEndianInt(numLumps);
        this.infoTableOffset = Helpers.byteArrayToLittleEndianInt(tableOffset);

        return new WADHeader(magic, numLumps, tableOffset);
    }

    /**
     * Gets a List of lumps from the WAD file.
     * @return List<WADLump>
     * @throws IOException
     */
    private List<WADLump> readWADLumps() throws IOException {
        // Read the lumps from WAD file to buffer.
        ByteBuffer buffer = ByteBuffer.allocate(this.numLumps * WADLump.SIZE_OF);
        try {
            this.fc.position(this.infoTableOffset);
            this.fc.read(buffer);
            byte[] bytes = buffer.array();

            // Let's fill the lump list.
            List<WADLump> lumps = new ArrayList<>();
            this.lumpNames = new ArrayList<>();

            for (int i = 0; i < this.numLumps; i++) {
                int offset = i * WADLump.SIZE_OF;
                byte[] position = Arrays.copyOfRange(bytes, offset, offset + 4);
                byte[] size = Arrays.copyOfRange(bytes, offset + 4, offset + 8);
                byte[] name = Arrays.copyOfRange(bytes, offset + 8, offset + 16);
                WADLump wl = new WADLump(
                        this.bigEndian ?
                            Helpers.byteArrayToBigEndianInt(position) : Helpers.byteArrayToLittleEndianInt(position),
                        this.bigEndian ?
                                Helpers.byteArrayToBigEndianInt(size) : Helpers.byteArrayToLittleEndianInt(size),
                        new String(name));
                lumps.add(wl);
                lumpNames.add(wl.getName());
            }

            return lumps;
        } catch (Exception e) {
            throw new IOException("Lumps could not be retrieved from WAD file.", e);
        }
    }

    /**
     * Parses a WAD file and gets the behind game information.
     * @return String
     */
    private IWADInfo parseIWADInfo() throws Exception {
        IWADInfo iwi = null;

        // Check, whether the IWAD contains an "IWADINFO" lump.
        for (int i = this.numLumps - 1; i >= 0; i--) {
            if (this.lumps.get(i).getName().equals(IWADInfo.IWADINFO)) {
                iwi = IWADInfo.fromLump(this.lumps.get(i), this.fc);
            }
        }

        // IWAD file does not contain an IWADINFO lump. Try to find out
        // what IWAD file we are using.
        for (IWADInfo info : PREDEFINED_IWAD) {
            if (null == iwi &&
                this.lumpNames.containsAll(info.getMustContain())) {
                iwi = info;
            }
        }

        if (null != iwi) {
            iwi.setLumps(this.lumpNames);
        }

        return iwi;
    }
}
