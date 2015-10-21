package org.dbb.doom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * ZipManager
 * Class to retrieve a ZIP file's information, that is
 * used to act as a WAD container.
 *
 * Note: In this class we are talking about ZIP and/or
 * containers. On the filesystem they are usually .pk3
 * files. But technically they are plain ZIP files.
 *
 * Created by dennis on 21.10.15.
 */
public class ZipManager {

    /**
     * Namespace for map definitions.
     */
    public final static String NS_MAPS = "maps/";

    /**
     * Different namespaces, that can definitely be ignored.
     */
    public final static String NS_ACS = "acs/";                 // ACS libraries.
    public final static String NS_COLORMAPS = "colormaps/";     // BOOM colormaps.
    public final static String NS_FLATS = "flats/";             // Flats.
    public final static String NS_GRAPHICS = "graphics/";       // Special graphics.
    public final static String NS_HIRES = "hires/";             // High-resolution textures.
    public final static String NS_MUSIC = "music/";             // All data, used as music.
    public final static String NS_PATCHES = "patches/";         // Patches.
    public final static String NS_SOUNDS = "sounds/";           // Sound files, referenced in SNDINFO.
    public final static String NS_SPRITES = "sprites/";         // Sprites.
    public final static String NS_TEXTURES = "textures/";       // Textures.
    public final static String NS_VOICES = "voices/";           // Strife dialog sounds.
    public final static String NS_VOXELS = "voxels/";           // Voxel objects.

    /**
     * ZIP file name.
     */
    private String filename;

    /**
     * File handler.
     */
    private File file;

    /**
     * Stream to read from ZIP file.
     */
    private ZipInputStream zis;

    /**
     * ZIp file's content.
     */
    private Map<String, byte[]> fileEntries;

    /**
     * List of WAD files.
     */
    private List<WADManager> wadFiles;

    /**
     * Creates a new ZipManager object.
     * @param filename Name of the ZipManager's instance file to use.
     * @throws IllegalArgumentException if an invalid Zip container has been specified.
     * @throws IOException if the file could not be read or is a directory.
     */
    public ZipManager(String filename) throws Exception {
        this.filename = filename;
        if (null == filename) {
            throw new IllegalArgumentException("Container file must not be null.");
        }

        // Check if the file exists.
        this.file = new File(filename);
        this.filename = this.file.getCanonicalPath();
        if (!this.file.exists() || this.file.isDirectory()) {
            throw new IOException("The specified container file was not found or is a directory (" + filename + ").");
        }

        this.fileEntries = new HashMap<>();

        openZip();

        // Process the ZIP file, extract maps.
        extractMaps();
    }

    /**
     * Gets the container's file name.
     * @return String
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * Closes the ZIP file.
     * @throws Exception if any error occurred.
     */
    public void closeZip() throws Exception {
        if (null != this.zis) {
            this.zis.close();
        }
    }

    /**
     * Destroys the ZipManager instance.
     */
    public void destroy() {
        try {
            closeZip();
        } catch (Exception e) {
            // Intentionally left empty.
        } finally {
            this.filename = null;
            this.file = null;
            this.zis = null;
            this.fileEntries = null;
            this.wadFiles.forEach(WADManager::destroy);
            this.wadFiles = null;
        }
    }

    /**
     * Opens the container file.
     */
    private void openZip() throws Exception {
        try {
            // Get the ZIP file content.
            ZipInputStream zis = new ZipInputStream(new FileInputStream(this.filename));
            ZipEntry ze = zis.getNextEntry();
            while (ze != null) {
                // Check if file is in global namespace (ZIP file's root, or
                // in map namespace (NS_MAPS), or another namespace, that
                // is user-chosen. Ignore sprites, textures, sounds, etc.
                String name = ze.getName();
                if (name.toLowerCase().startsWith(NS_ACS) ||
                        name.toLowerCase().startsWith(NS_COLORMAPS) ||
                        name.toLowerCase().startsWith(NS_FLATS) ||
                        name.toLowerCase().startsWith(NS_GRAPHICS) ||
                        name.toLowerCase().startsWith(NS_HIRES) ||
                        name.toLowerCase().startsWith(NS_MUSIC) ||
                        name.toLowerCase().startsWith(NS_PATCHES) ||
                        name.toLowerCase().startsWith(NS_SOUNDS) ||
                        name.toLowerCase().startsWith(NS_SPRITES) ||
                        name.toLowerCase().startsWith(NS_TEXTURES) ||
                        name.toLowerCase().startsWith(NS_VOICES) ||
                        name.toLowerCase().startsWith(NS_VOXELS)) {
                    // Skip this ZIP entry.
                    ze = zis.getNextEntry();
                    continue;
                }
                // Found ZIP entry is a map, or a root entry, or comes from a
                // user defined namespace.
                // Extract the file to memory.
                byte[] data = new byte[65536];
                ByteBuffer buffer = ByteBuffer.allocate((int) ze.getSize());
                int len;
                int written = 0;
                while ((len = zis.read(data)) > 0) {
                    buffer.put(data, written * data.length, len);
                }
                this.fileEntries.put(name, buffer.array());
                ze = zis.getNextEntry();
            }
            zis.closeEntry();
        } catch (Exception e) {
            throw new IOException("Container file could not be read.", e);
        }
    }

    /**
     * Extract map information from the ZIP file to WADManager objects.
     * @throws Exception
     */
    private void extractMaps() throws Exception {
        this.wadFiles = new ArrayList<>();
        for (String key : this.fileEntries.keySet()) {
            if (key.toLowerCase().startsWith(ZipManager.NS_MAPS) &&
                key.length() > ZipManager.NS_MAPS.length()) {
                this.wadFiles.add(new WADManager(key, this.fileEntries.get(key)));
            }
        }
    }
}
