package org.dbb.doom;

/**
 * Header of a WAD file.
 *
 * Created by dbarzen on 16.10.15.
 */
public class WADHeader {

    /**
     * Gets the size of the header in bytes.
     */
    public static int SIZE_OF = 12;             // (3x 4 bytes)

    /**
     * File type constant (magic number).
     */
    public static String TYPE_IWAD = "IWAD";

    /**
     * Magic number.
     */
    private byte[] magic;

    /**
     * Number of lumps.
     */
    private byte[] numLumps;

    /**
     * Pointer to the directory position.
     */
    private byte[] infoTableOffset;

    /**
     * Creates a new WADHeader instance.
     * @param magic Magic number.
     * @param numLumps Number of lumps.
     * @param infoTableOffset Directory offset.
     * @throws IllegalArgumentException if any parameter is not an array of length 4.
     */
    public WADHeader(byte[] magic, byte[] numLumps, byte[] infoTableOffset) throws IllegalArgumentException {
        String error =
                (magic.length != 4) ? "Magic number" :
                        (numLumps.length != 4) ? "Number of lumps" :
                                (infoTableOffset.length != 4) ? "Info table's offset" : null;
        if (null != error) {
            throw new IllegalArgumentException(error + " needs to be an array of 4 bytes.");
        }

        this.magic = magic;
        this.numLumps = numLumps;
        this.infoTableOffset = infoTableOffset;
    }

    /**
     * Gets the magic number.
     * @return byte[]
     */
    public byte[] getMagicNumber() {
        return this.magic;
    }

    /**
     * Gets the number of lumps.
     * @return byte[]
     */
    public byte[] getNumLumps() {
        return this.numLumps;
    }

    /**
     * Gets the directory position.
     * @return int
     */
    public byte[] getInfoTableOffset() {
        return this.infoTableOffset;
    }
}
