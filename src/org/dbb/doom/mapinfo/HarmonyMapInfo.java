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
 * HarmonyMapInfo.java
 *
 * MapInfo for Harmony.
 *
 * Created by: dennis 2015/10/20
 */

package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.TreeMap;

public class HarmonyMapInfo extends MapInfo {

    /**
     * Harmony map names.
     */
    private static final TreeMap<String, String> mapNames;
    static {
        mapNames = new TreeMap<>();
        mapNames.put("MAP01", "Level 1: Abduction");
        mapNames.put("MAP02", "Level 2: Harm's Way");
        mapNames.put("MAP03", "Level 3: Operation Rescue");
        mapNames.put("MAP04", "Level 4: Megalopolis");
        mapNames.put("MAP05", "Level 5: The Hospital");
        mapNames.put("MAP06", "Level 6: The Weapons Factory");
        mapNames.put("MAP07", "Level 7: The Underwater Lab");
        mapNames.put("MAP08", "Level 8: Airstrip One");
        mapNames.put("MAP09", "Level 9: The Launch Base");
        mapNames.put("MAP10", "Level 10: The Radioactive Zone");
        mapNames.put("MAP11", "Level 11: Echidna");
    }

    /**
     * Creates MapInfo object for Harmony.
     */
    public HarmonyMapInfo() {
        super(fromNameMap(mapNames));
    }
}
