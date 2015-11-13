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
 * WADHeader.java
 *
 * Header of a WAD file.
 *
 * Created by: dennis 2015/10/16
 */

package org.dbb.doom;

public class WADHeader {

    /**
     * Gets the size of the header in bytes.
     */
    public static int SIZE_OF = 12;             // (3x 4 bytes)

    /**
     * File type constant for IWAD files (magic number).
     */
    public static String TYPE_IWAD = "IWAD";

    /**
     * File type constant for PWAD files (magic number).
     */
    public static String TYPE_PWAD = "PWAD";

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
