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
 * Doom2BfgIWADInfo.java
 *
 * IWAD information for DOOM2: BFG Edition.
 *
 * Created by: dennis 2015/10/19
 */

package org.dbb.doom.wadinfo;

import org.dbb.doom.*;
import org.dbb.doom.mapinfo.Doom2MapInfo;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.List;

public class Doom2BfgIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as DOOM2 BFG.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP01");
        mustContain.add("DMENUPIC");
        mustContain.add("M_ACPT");
        mustContain.add("M_CAN");
        mustContain.add("M_EXITO");
        mustContain.add("M_CHG");
    }

    /**
     * Creates an IWADInfo instance for DOOM2: BFG Edition.
     */
    public Doom2BfgIWADInfo() {
        super();
        setName("DOOM2: BFG Edition");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_COMPATSHORTTEX);

        // Replace and add map names, different from DOOM2.
        TreeMap<String, MapInfoEntry> mapNames = new TreeMap<>(new Doom2MapInfo().getMapEntries());
        mapNames.replace("MAP31", new MapInfoEntry("MAP31", "Level 31: IDKFA", false));     // Wolfenstein 3D censorship.
        mapNames.replace("MAP32", new MapInfoEntry("MAP32", "Level 32: Keen", false));
        mapNames.put("MAP33", new MapInfoEntry("MAP33", "Level 33: Betray", false));

        setMapInfo(new MapInfo(mapNames));
        setMustContain(Doom2BfgIWADInfo.mustContain);
    }
}
