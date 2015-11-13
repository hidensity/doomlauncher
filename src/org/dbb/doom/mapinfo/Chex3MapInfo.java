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
 * Chex3MapInfo.java
 *
 * MapInfo for Chex(R) Quest 3.
 *
 * Created by: dennis 2015/10/20
 */

package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.TreeMap;

public class Chex3MapInfo extends MapInfo {

    /**
     * Chex(R) Quest 3 map names.
     */
    private static final TreeMap<String, String> mapNames;
    static {
        mapNames = new TreeMap<>();
        mapNames.put("E1M1", "E1M1: Landing Zone");
        mapNames.put("E1M2", "E1M2: Storage Facility");
        mapNames.put("E1M3", "E1M3: Laboratory");
        mapNames.put("E1M4", "E1M4: Arboretum");
        mapNames.put("E1M5", "E1M5: Caverns of Bazoik");
        mapNames.put("E2M1", "E2M1: Spaceport");
        mapNames.put("E2M2", "E2M2: Cinema");
        mapNames.put("E2M3", "E2M3: Chex Museum");
        mapNames.put("E2M4", "E2M4: City Streets");
        mapNames.put("E2M5", "E2M5: Sewer System");
        mapNames.put("E3M1", "E3M1: Central Command");
        mapNames.put("E3M2", "E3M2: United Cereals");
        mapNames.put("E3M3", "E3M3: Villa Chex");
        mapNames.put("E3M4", "E3M4: Provincial Park");
        mapNames.put("E3M5", "E3M5: Meteor Spaceship");
    }

    /**
     * Creates MapInfo object for Chex(R) Quest 3.
     */
    public Chex3MapInfo() {
        super(MapInfo.fromNameMap(mapNames));
    }
}
