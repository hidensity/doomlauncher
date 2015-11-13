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
 * WADLump.java
 *
 * WAD's lump definition.
 *
 * Created by: dennis 2015/10/16
 */

package org.dbb.doom;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class WADLump {

    /**
     * Gets the size of the lump's header in bytes.
     */
    public static int SIZE_OF = 16;             // (2x 4 bytes + 8 bytes)

    /**
     * Predefined lump names, needed to identify a map in
     * original DOOM/Heretic/Hexen format.
     */
    public static final List<String> ORG_MAP_LUMPS;
    static {
        ORG_MAP_LUMPS = new ArrayList<>();
        ORG_MAP_LUMPS.add("THINGS");
        ORG_MAP_LUMPS.add("LINEDEFS");
        ORG_MAP_LUMPS.add("SIDEDEFS");
        ORG_MAP_LUMPS.add("VERTEXES");
        ORG_MAP_LUMPS.add("SEGS");
        ORG_MAP_LUMPS.add("SSECTORS");
        ORG_MAP_LUMPS.add("NODES");
        ORG_MAP_LUMPS.add("SECTORS");
        ORG_MAP_LUMPS.add("REJECT");
        ORG_MAP_LUMPS.add("BLOCKMAP");
    }

    /**
     * Predefined lump names for UDMF maps.
     */
    public static final String UDMF_MAP_START = "TEXTMAP";
    public static final String UDMF_MAP_END = "ENDMAP";

    /**
     * Lump's position in the WAD file.
     */
    private long filePos;

    /**
     * Lump's size.
     */
    private int size;

    /**
     * Lump's name (max. 8 bytes).
     */
    private String name;

    /**
     * Lump's data.
     */
    private byte[] lumpData;

    /**
     * Create a new WADLump instance.
     * @param filePos Lump's position in the WAD file.
     * @param size Lump's size.
     * @param name Lump's name (max. 8 bytes).
     * @throws IllegalArgumentException if any parameter is invalid.
     */
    public WADLump(long filePos, int size, String name) {
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
        this.lumpData = null;
    }

    /**
     * Gets the lump's position within the WAD.
     * @return long
     */
    public long getFilePos() {
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

    /**
     * Reads the lump's data.
     * @param fc FileChannel, used for reading.
     * @return byte[]
     */
    public byte[] getLumpData(FileChannel fc) throws Exception {
        if (null == this.lumpData) {
            // Position the file pointer and read lump data to buffer.
            ByteBuffer buffer = ByteBuffer.allocate(this.size);
            long pos = fc.position();
            fc.position(this.filePos);
            fc.read(buffer);

            this.lumpData = buffer.array();
            // Restore original file pointer.
            if (pos >= 0) {
                fc.position(pos);
            }
        }

        return this.lumpData;
    }
}
