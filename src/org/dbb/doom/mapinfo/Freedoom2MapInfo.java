package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.HashMap;

/**
 * MapInfo for Freedoom Phase 2.
 *
 * Created by dennis on 19.10.15.
 */
public class Freedoom2MapInfo extends MapInfo {

    /**
     * Freedoom Phase 2 map names.
     */
    private static final HashMap<String, String> mapNames;
    static {
        mapNames = new HashMap<>();
        mapNames.put("MAP01", "Map 01: [no name]");
        mapNames.put("MAP02", "Map 02: [no name]");
        mapNames.put("MAP03", "Map 03: [no name]");
        mapNames.put("MAP04", "Map 04: [no name]");
        mapNames.put("MAP05", "Map 05: [no name]");
        mapNames.put("MAP06", "Map 06: [no name]");
        mapNames.put("MAP07", "Map 07: Outer Storage Warehouse");
        mapNames.put("MAP08", "Map 08: [no name]");
        mapNames.put("MAP09", "Map 09: Mine HM09");
        mapNames.put("MAP10", "Map 10: [no name]");
        mapNames.put("MAP11", "Map 11: [no name]");
        mapNames.put("MAP12", "Map 12: [no name]");
        mapNames.put("MAP13", "Map 13: Return To Earth");
        mapNames.put("MAP14", "Map 14: [no name]");
        mapNames.put("MAP15", "Map 15: [no name]");
        mapNames.put("MAP16", "Map 16: [no name]");
        mapNames.put("MAP17", "Map 17: [no name]");
        mapNames.put("MAP18", "Map 18: [no name]");
        mapNames.put("MAP19", "Map 19: Castle");
        mapNames.put("MAP20", "Map 20: [no name]");
        mapNames.put("MAP21", "Map 21: [no name]");
        mapNames.put("MAP22", "Map 22: [no name]");
        mapNames.put("MAP23", "Map 23: [no name]");
        mapNames.put("MAP24", "Map 24: Tertiary Loading Bay");
        mapNames.put("MAP25", "Map 25: [no name]");
        mapNames.put("MAP26", "Map 26: [no name]");
        mapNames.put("MAP27", "Map 27: [no name]");
        mapNames.put("MAP28", "Map 28: [no name]");
        mapNames.put("MAP29", "Map 29: [no name]");
        mapNames.put("MAP30", "Map 30: [no name]");
        mapNames.put("MAP31", "Map 31: [no name]");
        mapNames.put("MAP32", "Map 32: [no name]");
    }

    /**
     * Creates MapInfo object for Freedoom Phase 2.
     */
    public Freedoom2MapInfo() {
        super(Freedoom2MapInfo.mapNames);
    }
}
