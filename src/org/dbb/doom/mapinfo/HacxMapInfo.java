package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.HashMap;

/**
 * MapInfo for Hacx: Twitch'n Kill.
 *
 * Created by dennis on 20.10.15.
 */
public class HacxMapInfo extends MapInfo {

    /**
     * Hacx: Twitch'n Kill map names.
     */
    private static final HashMap<String, String> mapNames;
    static {
        mapNames = new HashMap<>();
        mapNames.put("MAP01", "Level 1: GenEmp Corp.");
        mapNames.put("MAP02", "Level 2: Tunnel Town");
        mapNames.put("MAP03", "Level 3: Lava Annex");
        mapNames.put("MAP04", "Level 4: Alcatraz");
        mapNames.put("MAP05", "Level 5: Cyber Circus");
        mapNames.put("MAP06", "Level 6: Digi-Ota");
        mapNames.put("MAP07", "Level 7: The Great Wall");
        mapNames.put("MAP08", "Level 8: Garden of Delights");
        mapNames.put("MAP09", "Level 9: Hidden Fortress");
        mapNames.put("MAP10", "Level 10: Anarchist Dream");
        mapNames.put("MAP11", "Level 11: Notus Us!");
        mapNames.put("MAP12", "Level 12: Gothik Gauntlet");
        mapNames.put("MAP13", "Level 13: The Sewers");
        mapNames.put("MAP14", "Level 14: 'Trode Wars");
        mapNames.put("MAP15", "Level 15: Twilight of Enk's");
        mapNames.put("MAP16", "Level 16: Protean Cybex");
        mapNames.put("MAP17", "Level 17: River of Blood");
        mapNames.put("MAP18", "Level 18: Bizarro");
        mapNames.put("MAP19", "Level 19: The War Rooms");
        mapNames.put("MAP20", "Level 20: Intruder Alert!");
        mapNames.put("MAP31", "Level 31: Desiccant Room");
    }

    /**
     * Creates MapInfo object for Hacx: Twitch'n Kill.
     */
    public HacxMapInfo() {
        super(HacxMapInfo.mapNames);
    }
}
