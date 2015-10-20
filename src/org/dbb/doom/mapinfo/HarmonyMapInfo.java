package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.HashMap;

/**
 * MapInfo for Harmony.
 *
 * Created by dennis on 20.10.15.
 */
public class HarmonyMapInfo extends MapInfo {

    /**
     * Harmony map names.
     */
    private static final HashMap<String, String> mapNames;
    static {
        mapNames = new HashMap<>();
        mapNames.put("MAP01", "Level 01: Abduction");
        mapNames.put("MAP02", "Level 02: Harm's Way");
        mapNames.put("MAP03", "Level 03: Operation Rescue");
        mapNames.put("MAP04", "Level 04: Megalopolis");
        mapNames.put("MAP05", "Level 05: The Hospital");
        mapNames.put("MAP06", "Level 06: The Weapons Factory");
        mapNames.put("MAP07", "Level 07: The Underwater Lab");
        mapNames.put("MAP08", "Level 08: Airstrip One");
        mapNames.put("MAP09", "Level 09: The Launch Base");
        mapNames.put("MAP10", "Level 10: The Radioactive Zone");
        mapNames.put("MAP11", "Level 11: Echidna");
    }

    /**
     * Creates MapInfo object for Harmony.
     */
    public HarmonyMapInfo() {
        super(HarmonyMapInfo.mapNames);
    }
}
