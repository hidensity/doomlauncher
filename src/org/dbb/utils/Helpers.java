package org.dbb.utils;

/**
 * Helper methods.
 *
 * Created by dbarzen on 16.10.15.
 */
public class Helpers {

    /**
     * Converts a byte array to a little-endian int.
     * @param bytes Array of bytes.
     * @return int
     */
    public static int byteArrayToLittleEndianInt(byte[] bytes) {
        return bytes[0] & 0xFF |
                (bytes[1] & 0xFF) << 8 |
                (bytes[2] & 0xFF) << 16 |
                (bytes[3] & 0xFF) << 24;
    }

    /**
     * Converts a little-endian integer into a byte array.
     * @param number Integer to convert.
     * @return byte[]
     */
    public static byte[] littleEndianIntToByteArray(int number) {
        return new byte[]{
                (byte) (number & 0xFF),
                (byte) ((number >> 8) & 0xFF),
                (byte) ((number >> 16) & 0xFF),
                (byte) ((number >> 24) & 0xFF),
        };
    }

    /**
     * Converts a byte array to a big-endian int.
     * @param bytes Array of bytes.
     * @return int
     */
    public static int byteArrayToBigEndianInt(byte[] bytes) {
        return bytes[3] & 0xFF |
                (bytes[2] & 0xFF) << 8 |
                (bytes[1] & 0xFF) << 16 |
                (bytes[0] & 0xFF) << 24;
    }

    /**
     * Converts a big-endian integer into a byte array.
     * @param number Integer to convert.
     * @return byte[]
     */
    public static byte[] bigEndianIntToByteArray(int number) {
        return new byte[]{
                (byte) ((number >> 24) & 0xFF),
                (byte) ((number >> 16) & 0xFF),
                (byte) ((number >> 8) & 0xFF),
                (byte) (number & 0xFF),
        };
    }
}
