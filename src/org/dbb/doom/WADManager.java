package org.dbb.doom;

import org.dbb.doom.exceptions.InvalidWADException;
import org.dbb.utils.Helpers;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * WAD Manager
 * Class to retrieve a WAD's information.
 *
 * Created by dennis on 21.10.15.
 */
public class WADManager {

    /**
     * File name of the WADManager file.
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
     * File channel to read WAD data.
     */
    protected FileChannel fc;

    /**
     * WAD file's header.
     */
    private WADHeader header;

    /**
     * Number of lumps in the WAD.
     */
    protected int numLumps;

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
    protected List<WADLump> lumps;

    /**
     * List with found lump names.
     */
    protected List<String> lumpNames;

    /**
     * Creates a new WADManager object.
     * @param filename Name of the WADManager file to use.
     * @throws InvalidWADException if an invalid WAD file has been specified.
     * @throws IOException if file could not be read or is a directory.
     * @throws IllegalArgumentException if a specified argument has been illegal.
     */
    public WADManager(String filename) throws Exception {
        this.filename = filename;
        if (null == filename) {
            throw new IllegalArgumentException("WAD file name must not be null.");
        }

        // Check if file exists.
        this.file = new File(filename);
        this.filename = this.file.getCanonicalPath();
        if (!this.file.exists() || this.file.isDirectory()) {
            throw new IOException("The specified WAD was not found or is a directory (" + filename + ").");
        }

        // Open the file.
        openWAD();

        // Read WAD files header.
        this.header = readWADHeader();

        // Get WAD's endianess.
        this.bigEndian = isBigEndian();

        // Check the file.
        if (!isValidWAD()) {
            throw new InvalidWADException("Specified file is not a valid WAD.");
        }

        // Get the lumps from WAD.
        this.lumps = readWADLumps();
    }

    /**
     * Gets the WAD's file name.
     * @return String
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * Opens the WADManager file for reading.
     * @throws InvalidWADException if file length is < 12.
     * @throws IOException if file could not be read.
     */
    private void openWAD() throws Exception {
        this.fileSize = this.file.length();
        if (this.fileSize < WADHeader.SIZE_OF) {
            throw new InvalidWADException("Invalid WAD specified. " +
                    "File does not even contain header information.");
        }

        try {
            this.wad = new RandomAccessFile(this.file, "r");
            this.fc = this.wad.getChannel();
        } catch (Exception e) {
            throw new IOException("WAD file could not be read.", e);
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
     * Checks, whether it is a valid WAD file.
     * @return boolean
     */
    private boolean isValidWAD() throws IOException {
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

}
