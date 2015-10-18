package org.dbb.doom;

/**
 * WAD's lump definition.
 *
 * Created by dbarzen on 16.10.15.
 */
public class WADLump {

    /**
     * Gets the size of the lump's header in bytes.
     */
    public static int SIZE_OF = 16;             // (2x 4 bytes + 8 bytes)

    /**
     * Lump's position in the WAD file.
     */
    private int filePos;

    /**
     * Lump's size.
     */
    private int size;

    /**
     * Lump's name (max. 8 bytes).
     */
    private String name;

    /**
     * Create a new WADLump instance.
     * @param filePos Lump's position in the WAD file.
     * @param size Lump's size.
     * @param name Lump's name (max. 8 bytes).
     * @throws IllegalArgumentException if any parameter is invalid.
     */
    public WADLump(int filePos, int size, String name) {
        String error =
                (filePos < 0) ? "File position" :
                        (size < 0) ? "Size" : null;
        if (null != error) {
            throw new IllegalArgumentException(error + " needs to be a positive integer value.");
        }

        if (name.length() > 8) {
            throw new IllegalArgumentException("Lump name must not be longer than 8 characters (" + name + ").");
        }

        this.filePos = filePos;
        this.size = size;
        this.name = name;
    }

    /**
     * Gets the lump's position within the WAD.
     * @return int
     */
    public int getFilePos() {
        return this.filePos;
    }

    /**
     * Gets the lump's size in bytes.
     * @return int
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Gets the lump's name (trimmed and upper-cased).
     * @return String
     */
    public String getName() {
        return this.name.trim().toUpperCase();
    }

    /**
     * Gets the lump's name.
     * @return String
     */
    public String getNameRaw() {
        return this.name;
    }
}
