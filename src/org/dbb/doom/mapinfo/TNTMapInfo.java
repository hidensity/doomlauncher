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
 * TNTMapInfo.java
 *
 * MapInfo for Final DOOM: TNT - Evilution.
 *
 * Created by: dennis 2015/10/19
 */

package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.TreeMap;

public class TNTMapInfo extends MapInfo {

    /**
     * Final DOOM: TNT - Evilution map names.
     */
    private static final TreeMap<String, String> mapNames;
    static {
        mapNames = new TreeMap<>();
        mapNames.put("MAP01", "Level 1: System Control");
        mapNames.put("MAP02", "Level 2: Human BBQ");
        mapNames.put("MAP03", "Level 3: Power Control");
        mapNames.put("MAP04", "Level 4: Wormhole");
        mapNames.put("MAP05", "Level 5: Hanger");
        mapNames.put("MAP06", "Level 6: Open Season");
        mapNames.put("MAP07", "Level 7: Prison");
        mapNames.put("MAP08", "Level 8: Metal");
        mapNames.put("MAP09", "Level 9: Stronghold");
        mapNames.put("MAP10", "Level 10: Redemption");
        mapNames.put("MAP11", "Level 11: Storage Facility");
        mapNames.put("MAP12", "Level 12: Crater");
        mapNames.put("MAP13", "Level 13: Nukage Processing");
        mapNames.put("MAP14", "Level 14: Steel Works");
        mapNames.put("MAP15", "Level 15: Dead Zone");
        mapNames.put("MAP16", "Level 16: Deepest Reaches");
        mapNames.put("MAP17", "Level 17: Processing Area");
        mapNames.put("MAP18", "Level 18: Mill");
        mapNames.put("MAP19", "Level 19: Shipping/Respawning");
        mapNames.put("MAP20", "Level 20: Central Processing");
        mapNames.put("MAP21", "Level 21: Administration Center");
        mapNames.put("MAP22", "Level 22: Habitat");
        mapNames.put("MAP23", "Level 23: Lunar Mining Project");
        mapNames.put("MAP24", "Level 24: Quarry");
        mapNames.put("MAP25", "Level 25: Baron's Den");
        mapNames.put("MAP26", "Level 26: Ballistyx");
        mapNames.put("MAP27", "Level 27: Mount Pain");
        mapNames.put("MAP28", "Level 28: Heck");
        mapNames.put("MAP29", "Level 29: River Styx");
        mapNames.put("MAP30", "Level 30: Last Call");
        mapNames.put("MAP31", "Level 31: Pharaoh");
        mapNames.put("MAP32", "Level 32: Caribbean");
    }

    /**
     * Creates MapInfo object for Final DOOM: TNT - Evilution.
     */
    public TNTMapInfo() {
        super(fromNameMap(mapNames));
    }
}
