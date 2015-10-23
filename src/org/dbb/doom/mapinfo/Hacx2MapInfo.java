package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.TreeMap;

/**
 * MapInfo for Hacx 2.0.
 *
 * Created by dennis on 20.10.15.
 */
public class Hacx2MapInfo extends MapInfo {

    /**
     * Hacx 2.0 map names.
     */
    private static final TreeMap<String, String> mapNames;
    static {
        mapNames = new TreeMap<>();
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
        mapNames.put("MAP13", "Level 13: Catacombs");
        mapNames.put("MAP14", "Level 14: Notre Damned");
        mapNames.put("MAP15", "Level 15: Twilight of ENK's");
        mapNames.put("MAP16", "Level 16: Protean Cybex");
        mapNames.put("MAP17", "Level 17: Dune City");
        mapNames.put("MAP18", "Level 18: River of Blood");
        mapNames.put("MAP19", "Level 19: Valley of the Dead");
        mapNames.put("MAP20", "Level 20: Artificial Annihilation");
        mapNames.put("MAP21", "Level 21: CryoZine");
        mapNames.put("MAP22", "Level 22: Pentagon Syndrome");
        mapNames.put("MAP23", "Level 23: Capitol Punishment");
        mapNames.put("MAP24", "Level 24: The War Rooms");
        mapNames.put("MAP25", "Level 25: Intruder Alert!");
        mapNames.put("MAP26", "Level 26: The Darkness");
        mapNames.put("MAP27", "Level 27: 'Trode Wars");
        mapNames.put("MAP28", "Level 28: Bizarro");
        mapNames.put("MAP29", "Level 29: Reality Bytes");
        mapNames.put("MAP30", "Level 30: Twitch n' Kill");
        mapNames.put("MAP31", "Level 31: Subspace Arcadum");
        mapNames.put("MAP32", "Level 32: Dessicant Room");
        mapNames.put("MAP33", "Level 33: Future Perfect");
        mapNames.put("MAP34", "Level 34: GenEmp Lobby");
        mapNames.put("MAP35", "Level 35: Cybernetic Junction");
    }

    /**
     * Creates MapInfo object for Hacx 2.0.
     */
    public Hacx2MapInfo() {
        super(fromNameMap(mapNames));
    }
}
