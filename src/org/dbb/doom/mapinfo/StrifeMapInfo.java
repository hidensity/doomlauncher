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
 * StrifeMapInfo.java
 *
 * MapInfo for Strife: Quest for the Sigil.
 *
 * Created by: dennis 2015/10/20
 */

package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.TreeMap;

public class StrifeMapInfo extends MapInfo {

    /**
     * Strife: Quest for the Sigil map names.
     */
    private static final TreeMap<String, String> mapNames;
    static {
        mapNames = new TreeMap<>();
        mapNames.put("MAP01", "AREA 1: Sanctuary");
        mapNames.put("MAP02", "AREA 2: Town");
        mapNames.put("MAP03", "AREA 3: Front Base");
        mapNames.put("MAP04", "AREA 4: Power Station");
        mapNames.put("MAP05", "AREA 5: Prison");
        mapNames.put("MAP06", "AREA 6: Sewers");
        mapNames.put("MAP07", "AREA 7: Castle");
        mapNames.put("MAP08", "AREA 8: Audience Chamber");
        mapNames.put("MAP09", "AREA 9: Castle: Programmer's Keep");
        mapNames.put("MAP10", "AREA 10: New Front Base");
        mapNames.put("MAP11", "AREA 11: Borderlands");
        mapNames.put("MAP12", "AREA 12: The Temple of the Oracle");
        mapNames.put("MAP13", "AREA 13: Catacombs");
        mapNames.put("MAP14", "AREA 14: Mines");
        mapNames.put("MAP15", "AREA 15: Fortress: Administration");
        mapNames.put("MAP16", "AREA 16: Fortress: Bishop's Tower");
        mapNames.put("MAP17", "AREA 17: Fortress: The Baily");
        mapNames.put("MAP18", "AREA 18: Fortress: Stores");
        mapNames.put("MAP19", "AREA 19: Fortress: Security Complex");
        mapNames.put("MAP20", "AREA 20: Factory: Receiving");
        mapNames.put("MAP21", "AREA 21: Factory: Manufacturing");
        mapNames.put("MAP22", "AREA 22: Factory: Forge");
        mapNames.put("MAP23", "AREA 23: Order Commons");
        mapNames.put("MAP24", "AREA 24: Factory: Conversion Chapel");
        mapNames.put("MAP25", "AREA 25: Catacombs: Ruined Temple");
        mapNames.put("MAP26", "AREA 26: Proving Grounds");
        mapNames.put("MAP27", "AREA 27: The Lab");
        mapNames.put("MAP28", "AREA 28: Alien Ship");
        mapNames.put("MAP29", "AREA 29: Entity's Lair");
        mapNames.put("MAP30", "AREA 30: Abandoned Front Base");
        mapNames.put("MAP31", "AREA 31: Training Facility");
        mapNames.put("MAP32", "AREA 01: Sanctuary");
        mapNames.put("MAP33", "AREA 02: Town");
        mapNames.put("MAP34", "AREA 03: Movement Base");
    }

    /**
     * Creates MapInfo object for Strife: Quest for the Sigil.
     */
    public StrifeMapInfo() {
        super(fromNameMap(mapNames));
    }
}
