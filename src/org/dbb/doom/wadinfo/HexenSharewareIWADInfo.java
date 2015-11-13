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
 * HexenSharewareIWADInfo.java
 *
 * IWAD information for Hexen: Demo Version.
 *
 * Created by: dennis 2015/10/20
 */

package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.MapInfo;
import org.dbb.doom.mapinfo.HexenMapInfo;

import java.util.ArrayList;
import java.util.List;

public class HexenSharewareIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Hexen: Demo Version.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("TITLE");
        mustContain.add("MAP01");
        mustContain.add("WINNOWR");
    }

    /**
     * Creates an IWADInfo instance for Hexen: Demo Version.
     */
    public HexenSharewareIWADInfo() {
        super();
        setName("Hexen: Demo Version");
        setGameType(GameType.HEXEN);
        setCompatibility(GameCompatibility.GI_SHAREWARE);
        setMapInfo(new MapInfo(new HexenMapInfo().getMapEntries("MAP0[1-4]")));
        setMustContain(HexenSharewareIWADInfo.mustContain);
    }
}
