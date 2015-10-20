package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.HashMap;

/**
 * MapInfo for Strife: Quest for the Sigil.
 *
 * Created by dennis on 20.10.15.
 */
public class StrifeMapInfo extends MapInfo {

    /**
     * Strife: Quest for the Sigil map names.
     */
    private static final HashMap<String, String> mapNames;
    static {
        mapNames = new HashMap<>();
        mapNames.put("MAP01", "AREA 01: Sanctuary");
        mapNames.put("MAP02", "AREA 02: Town");
        mapNames.put("MAP03", "AREA 03: Front Base");
        mapNames.put("MAP04", "AREA 04: Power Station");
        mapNames.put("MAP05", "AREA 05: Prison");
        mapNames.put("MAP06", "AREA 06: Sewers");
        mapNames.put("MAP07", "AREA 07: Castle");
        mapNames.put("MAP08", "AREA 08: Audience Chamber");
        mapNames.put("MAP09", "AREA 09: Castle: Programmer's Keep");
        mapNames.put("MAP10", "AREA 10: New Front Base");
        mapNames.put("MAP11", "AREA 11: Borderlands");
        mapNames.put("MAP12", "AREA 12: The Temple of the Oracle");
        mapNames.put("MAP13", "AREA 13: Catacombs");
        mapNames.put("MAP14", "AREA 14: Mines");
        mapNames.put("MAP15", "AREA 15: Fortress: Administration");
        mapNames.put("MAP16", "AREA 16: Fortress: Bishop's Tower");
        mapNames.put("MAP17", "AREA 17: Fortress: The Baily");
        mapNames.put("MAP18", "AREA 18: Fortress: Stores");
        mapNames.put("MAP19", "AREA 19: Fortress: Security Complex");
        mapNames.put("MAP20", "AREA 20: Factory: Receiving");
        mapNames.put("MAP21", "AREA 21: Factory: Manufacturing");
        mapNames.put("MAP22", "AREA 22: Factory: Forge");
        mapNames.put("MAP23", "AREA 23: Order Commons");
        mapNames.put("MAP24", "AREA 24: Factory: Conversion Chapel");
        mapNames.put("MAP25", "AREA 25: Catacombs: Ruined Temple");
        mapNames.put("MAP26", "AREA 26: Proving Grounds");
        mapNames.put("MAP27", "AREA 27: The Lab");
        mapNames.put("MAP28", "AREA 28: Alien Ship");
        mapNames.put("MAP29", "AREA 29: Entity's Lair");
        mapNames.put("MAP30", "AREA 30: Abandoned Front Base");
        mapNames.put("MAP31", "AREA 31: Training Facility");
        mapNames.put("MAP32", "AREA 01: Sanctuary");
        mapNames.put("MAP33", "AREA 02: Town");
        mapNames.put("MAP34", "AREA 03: Movement Base");
    }

    /**
     * Creates MapInfo object for Strife: Quest for the Sigil.
     */
    public StrifeMapInfo() {
        super(StrifeMapInfo.mapNames);
    }
}
