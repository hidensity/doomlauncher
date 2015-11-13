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
 * DoomSharewareIWADInfo.java
 *
 * IWAD information for DOOM Shareware.
 *
 * Created by: dennis 2015/10/19
 */

package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.MapInfo;
import org.dbb.doom.mapinfo.DoomMapInfo;

import java.util.ArrayList;
import java.util.List;

public class DoomSharewareIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as DOOM Shareware.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("E1M1");
    }

    /**
     * Creates an IWADInfo instance for DOOM Shareware.
     */
    public DoomSharewareIWADInfo() {
        super();
        setName("DOOM Shareware");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_COMPATSHORTTEX | GameCompatibility.GI_SHAREWARE);
        setMapInfo(new MapInfo(new DoomMapInfo().getMapEntries("E1M\\d")));
        setMustContain(DoomSharewareIWADInfo.mustContain);
    }
}
