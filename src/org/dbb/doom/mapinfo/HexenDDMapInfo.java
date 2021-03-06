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
 * HexenDDMapInfo.java
 *
 * MapInfo for Hexen DD.
 *
 * Created by: dennis 2015/10/20
 */

package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.TreeMap;

public class HexenDDMapInfo extends MapInfo {

    /**
     * Hexen DD map names.
     */
    private static final TreeMap<String, String> mapNames;
    static {
        mapNames = new TreeMap<>();
        mapNames.put("MAP41", "Level 1.1: Ruined Village");
        mapNames.put("MAP42", "Level 1.2: Blight");
        mapNames.put("MAP43", "Level 1.3: Sump");
        mapNames.put("MAP44", "Level 1.4: Catacomb");
        mapNames.put("MAP45", "Level 1.5: Badlands");
        mapNames.put("MAP46", "Level 1.6: Brackenwood");
        mapNames.put("MAP47", "Level 1.7: Pyre");
        mapNames.put("MAP48", "Level 2.1: Constable's Gate");
        mapNames.put("MAP49", "Level 2.2: Treasury");
        mapNames.put("MAP50", "Level 2-3: Market Place");
        mapNames.put("MAP51", "Level 2.4: Locus Requiescat");
        mapNames.put("MAP52", "Level 2.5: Ordeal");
        mapNames.put("MAP53", "Level 2.6: Armory");
        mapNames.put("MAP54", "Level 3.1: Nave");
        mapNames.put("MAP55", "Level 3.2: Chantry");
        mapNames.put("MAP56", "Level 3.3: Abattoir");
        mapNames.put("MAP57", "Level 3.4: Dark Watch");
        mapNames.put("MAP58", "Level 3.5: Cloaca");
        mapNames.put("MAP59", "Level 3.6: Ice Hold");
        mapNames.put("MAP60", "Level 3.7: Dark Citadel");
        mapNames.put("MAP33", "Level 4.1: Transit");
        mapNames.put("MAP34", "Level 4.2: Over 'n' Under");
        mapNames.put("MAP35", "Level 4.3: Deathfog");
        mapNames.put("MAP36", "Level 4.4: Castle of Pain");
        mapNames.put("MAP37", "Level 4.5: Sewer Pit");
        mapNames.put("MAP38", "Level 4.6: The Rose");
    }

    /**
     * Creates MapInfo object for Hexen DD.
     */
    public HexenDDMapInfo() {
        super(fromNameMap(mapNames));
    }
}
