package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.HashMap;

/**
 * MapInfo for DOOM2.
 *
 * Created by dennis on 19.10.15.
 */
public class Doom2MapInfo extends MapInfo {

    /**
     * DOOM2 map names.
     */
    private static final HashMap<String, String> mapNames;
    static {
        mapNames = new HashMap<>();
        mapNames.put("MAP01", "Level 1: Entryway");
        mapNames.put("MAP02", "Level 2: Underhalls");
        mapNames.put("MAP03", "Level 3: The Gantlet");
        mapNames.put("MAP04", "Level 4: The Focus");
        mapNames.put("MAP05", "Level 5: The Waste Tunnels");
        mapNames.put("MAP06", "Level 6: The Crusher");
        mapNames.put("MAP07", "Level 7: Dead Simple");
        mapNames.put("MAP08", "Level 8: Tricks and Traps");
        mapNames.put("MAP09", "Level 9: The Pit");
        mapNames.put("MAP10", "Level 10: Refueling Base");
        mapNames.put("MAP11", "Level 11: 'o' Of Destruction");
        mapNames.put("MAP12", "Level 12: The Factory");
        mapNames.put("MAP13", "Level 13: Downtown");
        mapNames.put("MAP14", "Level 14: The Inmost Dens");
        mapNames.put("MAP15", "Level 15: Industrial Zone");
        mapNames.put("MAP16", "Level 16: Suburbs");
        mapNames.put("MAP17", "Level 17: Tenements");
        mapNames.put("MAP18", "Level 18: The Courtyard");
        mapNames.put("MAP19", "Level 19: The Citadel");
        mapNames.put("MAP20", "Level 20: Gotcha!");
        mapNames.put("MAP21", "Level 21: Nirvana");
        mapNames.put("MAP22", "Level 22: The Catacombs");
        mapNames.put("MAP23", "Level 23: Barrels 'o Fun");
        mapNames.put("MAP24", "Level 24: The Chasm");
        mapNames.put("MAP25", "Level 25: Bloodfalls");
        mapNames.put("MAP26", "Level 26: The Abandoned Mines");
        mapNames.put("MAP27", "Level 27: Monster Condo");
        mapNames.put("MAP28", "Level 28: The Spirit World");
        mapNames.put("MAP29", "Level 29: The Living End");
        mapNames.put("MAP30", "Level 30: Icon of Sin");
        mapNames.put("MAP31", "Level 31: Wolfenstein");
        mapNames.put("MAP32", "Level 32: Grosse");
    }

    /**
     * Creates MapInfo object for DOOM2.
     */
    public Doom2MapInfo() {
        super(MapInfo.fromNameMap(mapNames));
    }
}
