package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.HashMap;

/**
 * MapInfo for Final DOOM: The Plutonia Experiment.
 *
 * Created by dennis on 19.10.15.
 */
public class PlutoniaMapInfo extends MapInfo {

    /**
     * Final DOOM: The Plutonia Experiment map names.
     */
    private static final HashMap<String, String> mapNames;
    static {
        mapNames = new HashMap<>();
        mapNames.put("MAP01", "Level 01: Congo");
        mapNames.put("MAP02", "Level 02: Well of Souls");
        mapNames.put("MAP03", "Level 03: Aztec");
        mapNames.put("MAP04", "Level 04: Caged");
        mapNames.put("MAP05", "Level 05: Ghost Town");
        mapNames.put("MAP06", "Level 06: Baron's Lair");
        mapNames.put("MAP07", "Level 07: Caughtyard");
        mapNames.put("MAP08", "Level 08: Realm");
        mapNames.put("MAP09", "Level 09: Abattoire");
        mapNames.put("MAP10", "Level 10: Onslaught");
        mapNames.put("MAP11", "Level 11: Haunted");
        mapNames.put("MAP12", "Level 12: Speed");
        mapNames.put("MAP13", "Level 13: The Crypt");
        mapNames.put("MAP14", "Level 14: Genesis");
        mapNames.put("MAP15", "Level 15: The Twilight");
        mapNames.put("MAP16", "Level 16: The Omen");
        mapNames.put("MAP17", "Level 17: Compound");
        mapNames.put("MAP18", "Level 18: Neurosphere");
        mapNames.put("MAP19", "Level 19: NME");
        mapNames.put("MAP20", "Level 20: The Death Domain");
        mapNames.put("MAP21", "Level 21: Slayer");
        mapNames.put("MAP22", "Level 22: Impossible Mission");
        mapNames.put("MAP23", "Level 23: Tombstone");
        mapNames.put("MAP24", "Level 24: The Final Frontier");
        mapNames.put("MAP25", "Level 25: The Temple of Darkness");
        mapNames.put("MAP26", "Level 26: Bunker");
        mapNames.put("MAP27", "Level 27: Anti-Christ");
        mapNames.put("MAP28", "Level 28: The Sewers");
        mapNames.put("MAP29", "Level 29: Odyssey of Noises");
        mapNames.put("MAP30", "Level 30: The Gateway to Hell");
        mapNames.put("MAP31", "Level 31: Cyberden");
        mapNames.put("MAP32", "Level 32: Go 2 It");
    }

    /**
     * Creates MapInfo object for Final DOOM: The Plutonia Experiment.
     */
    public PlutoniaMapInfo() {
        super(PlutoniaMapInfo.mapNames);
    }
}
