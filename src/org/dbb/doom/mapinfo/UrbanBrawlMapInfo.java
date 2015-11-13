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
 * UrbanBrawlMapInfo.java
 *
 * MapInfo for Action Doom 2: Urban Brawl.
 *
 * Created by: dennis 2015/10/20
 */

package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.TreeMap;

public class UrbanBrawlMapInfo extends MapInfo {

    /**
     * Action Doom 2: Urban Brawl map names.
     */
    private static final TreeMap<String, String> mapNames;
    static {
        mapNames = new TreeMap<>();
        mapNames.put("MAP01", "Level 1: Streets of Rage: It's time for Action");
        mapNames.put("MAP02", "Level 2: Action Bridge: The Manhattan Project");
        mapNames.put("MAP03", "Level 3: Segue: Say, That's a Nice Car");
        mapNames.put("MAP04", "Level 4: Action Subway: Follow the Bad Dudes");
        mapNames.put("MAP05", "Level 5: Downtown: Neo Manhattan");
        mapNames.put("MAP06", "Level 6: Phylex: Rising to the Challenge");
        mapNames.put("MAP07", "Level 7: Phylex: Top Floor");
        mapNames.put("MAP08", "Level 8: Backwoods: Over the River and Through the Woods...");
        mapNames.put("MAP09", "Level 9: Abandoned Places: The Splatterhouse");
        mapNames.put("MAP10", "Level 10: Crisp's Office: Final Fight");
    }

    /**
     * Creates MapInfo object for Action Doom 2: Urban Brawl.
     */
    public UrbanBrawlMapInfo() {
        super(fromNameMap(mapNames));
    }
}
