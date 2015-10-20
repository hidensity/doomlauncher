package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.HashMap;

/**
 * MapInfo for Chex(R) Quest 3.
 *
 * Created by dennis on 20.10.15.
 */
public class Chex3MapInfo extends MapInfo {

    /**
     * Chex(R) Quest 3 map names.
     */
    private static final HashMap<String, String> mapNames;
    static {
        mapNames = new HashMap<>();
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
        super(Chex3MapInfo.mapNames);
    }
}
