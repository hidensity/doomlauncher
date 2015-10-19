package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.HashMap;

/**
 * MapInfo for DOOM2.
 *
 * Created by dbarzen on 19.10.15.
 */
public class Doom2MapInfo extends MapInfo {

    /**
     * DOOM2 map names.
     */
    private static final HashMap<String, String> mapNames;
    static {
        mapNames = new HashMap<>();
        mapNames.put("MAP01", "Entryway");
        mapNames.put("MAP02", "Underhalls");
        mapNames.put("MAP03", "The Gantlet");
        mapNames.put("MAP04", "The Focus");
        mapNames.put("MAP05", "The Waste Tunnels");
        mapNames.put("MAP06", "The Crusher");
        mapNames.put("MAP07", "Dead Simple");
        mapNames.put("MAP08", "Tricks And Traps");
        mapNames.put("MAP09", "The Pit");
        mapNames.put("MAP10", "Refueling Base");
        mapNames.put("MAP11", "'o' Of Destruction");
        mapNames.put("MAP12", "The Factory");
        mapNames.put("MAP13", "Downtown");
        mapNames.put("MAP14", "The Inmost Dens");
        mapNames.put("MAP15", "Industrial Zone");
        mapNames.put("MAP16", "Suburbs");
        mapNames.put("MAP17", "Tenements");
        mapNames.put("MAP18", "The Courtyard");
        mapNames.put("MAP19", "The Citadel");
        mapNames.put("MAP20", "Gotcha!");
        mapNames.put("MAP21", "Nirvana");
        mapNames.put("MAP22", "The Catacombs");
        mapNames.put("MAP23", "Barrels 'o Fun");
        mapNames.put("MAP24", "The Chasm");
        mapNames.put("MAP25", "Bloodfalls");
        mapNames.put("MAP26", "The Abandoned Mines");
        mapNames.put("MAP27", "Monster Condo");
        mapNames.put("MAP28", "The Spirit World");
        mapNames.put("MAP29", "The Living End");
        mapNames.put("MAP30", "Icon Of Sin");
        mapNames.put("MAP31", "Wolfenstein");
        mapNames.put("MAP32", "Grosse");
    }

    /**
     * Creates MapInfo object for DOOM2.
     */
    public Doom2MapInfo() {
        super(Doom2MapInfo.mapNames);
    }
}
