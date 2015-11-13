/*******************************************************************************
 * Copyright (c) 2015 HiDensity. All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 * *****************************************************************************
 *
 * Helpers.java
 *
 * Helper methods.
 *
 * Created by: dennis 2015/10/16
 */

package org.dbb.utils;

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
