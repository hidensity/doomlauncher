package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.TreeMap;

/**
 * MapInfo for Harmony.
 *
 * Created by dennis on 20.10.15.
 */
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
