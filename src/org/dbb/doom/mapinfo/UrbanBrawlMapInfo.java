package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.HashMap;

/**
 * MapInfo for Action Doom 2: Urban Brawl.
 *
 * Created by dennis on 20.10.15.
 */
public class UrbanBrawlMapInfo extends MapInfo {

    /**
     * Action Doom 2: Urban Brawl map names.
     */
    private static final HashMap<String, String> mapNames;
    static {
        mapNames = new HashMap<>();
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
        super(UrbanBrawlMapInfo.mapNames);
    }
}
