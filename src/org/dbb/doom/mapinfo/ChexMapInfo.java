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
 * ChexMapInfo.java
 *
 * MapInfo for Chex(R) Quest.
 *
 * Created by: dennis 2015/10/20
 */

package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.TreeMap;

public class ChexMapInfo extends MapInfo {

    /**
     * Chex(R) Quest map names.
     */
    private static final TreeMap<String, String> mapNames;
    static {
        mapNames = new TreeMap<>();
        mapNames.put("E1M1", "E1M1: Landing Zone");
        mapNames.put("E1M2", "E1M2: Storage Facility");
        mapNames.put("E1M3", "E1M3: Experimental Lab");
        mapNames.put("E1M4", "E1M4: Arboretum");
        mapNames.put("E1M5", "E1M5: Caverns of Bazoik");
        mapNames.put("E1M6", "E1M6: [no name]");
        mapNames.put("E1M7", "E1M7: [no name]");
        mapNames.put("E1M8", "E1M8: [no name]");
        mapNames.put("E1M9", "E1M9: [no name]");
        mapNames.put("E2M1", "E2M1: [no name]");
        mapNames.put("E2M2", "E2M2: [no name]");
        mapNames.put("E2M3", "E2M3: [no name]");
        mapNames.put("E2M4", "E2M4: [no name]");
        mapNames.put("E2M5", "E2M5: [no name]");
        mapNames.put("E2M6", "E2M6: [no name]");
        mapNames.put("E2M7", "E2M7: [no name]");
        mapNames.put("E2M8", "E2M8: [no name]");
        mapNames.put("E2M9", "E2M9: [no name]");
        mapNames.put("E3M1", "E3M1: [no name]");
        mapNames.put("E3M2", "E3M2: [no name]");
        mapNames.put("E3M3", "E3M3: [no name]");
        mapNames.put("E3M4", "E3M4: [no name]");
        mapNames.put("E3M5", "E3M5: [no name]");
        mapNames.put("E3M6", "E3M6: [no name]");
        mapNames.put("E3M7", "E3M7: [no name]");
        mapNames.put("E3M8", "E3M8: [no name]");
        mapNames.put("E3M9", "E3M9: [no name]");
        mapNames.put("E4M1", "E4M1: [no name]");
        mapNames.put("E4M2", "E4M2: [no name]");
        mapNames.put("E4M3", "E4M3: [no name]");
        mapNames.put("E4M4", "E4M4: [no name]");
        mapNames.put("E4M5", "E4M5: [no name]");
        mapNames.put("E4M6", "E4M6: [no name]");
        mapNames.put("E4M7", "E4M7: [no name]");
        mapNames.put("E4M8", "E4M8: [no name]");
        mapNames.put("E4M9", "E4M9: [no name]");
    }

    /**
     * Creates MapInfo object for Chex(R) Quest.
     */
    public ChexMapInfo() {
        super(MapInfo.fromNameMap(mapNames));
    }
}
