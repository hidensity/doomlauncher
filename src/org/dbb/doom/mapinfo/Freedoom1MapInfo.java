package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.TreeMap;

/**
 * MapInfo for Freedoom Phase 1.
 *
 * Created by dennis on 19.10.15.
 */
public class Freedoom1MapInfo extends MapInfo {

    /**
     * Freedoom Phase 1 map names.
     */
    private static final TreeMap<String, String> mapNames;
    static {
        mapNames = new TreeMap<>();
        mapNames.put("E1M1", "C1M1: Starport");
        mapNames.put("E1M2", "C1M2: Communications Center");
        mapNames.put("E1M3", "C1M3: Waste Disposal");
        mapNames.put("E1M4", "C1M4: Supply Depot");
        mapNames.put("E1M5", "C1M5: Control Center");
        mapNames.put("E1M6", "C1M6: Training Center");
        mapNames.put("E1M7", "C1M7: Research Lab");
        mapNames.put("E1M8", "C1M8: Quarry");
        mapNames.put("E1M9", "C1M9: Armory");
        mapNames.put("E2M1", "C2M1: Ruins");
        mapNames.put("E2M2", "C2M2: Power Plant");
        mapNames.put("E2M3", "C2M3: [no name]");
        mapNames.put("E2M4", "C2M4: Sample Holding Center");
        mapNames.put("E2M5", "C2M5: Fortress 31");
        mapNames.put("E2M6", "C2M6: [no name]");
        mapNames.put("E2M7", "C2M7: [no name]");
        mapNames.put("E2M8", "C2M8: Containment Center");
        mapNames.put("E2M9", "C2M9: [no name]");
        mapNames.put("E3M1", "C3M1: Land of the Lost");
        mapNames.put("E3M2", "C3M2: Infernal Caverns");
        mapNames.put("E3M3", "C3M3: [no name]");
        mapNames.put("E3M4", "C3M4: [no name]");
        mapNames.put("E3M5", "C3M5: [no name]");
        mapNames.put("E3M6", "C3M6: Ingenous Intrusion");
        mapNames.put("E3M7", "C3M7: [no name]");
        mapNames.put("E3M8", "C3M8: The Lair");
        mapNames.put("E3M9", "C3M9: [no name]");
        mapNames.put("E4M1", "C4M1: Maintenance Area");
        mapNames.put("E4M2", "C4M2: Research Complex");
        mapNames.put("E4M3", "C4M3: Central Computing");
        mapNames.put("E4M4", "C4M4: Hydroponic Facility");
        mapNames.put("E4M5", "C4M5: Engineering Station");
        mapNames.put("E4M6", "C4M6: Command Center");
        mapNames.put("E4M7", "C4M7: Waste Treatment");
        mapNames.put("E4M8", "C4M8: Launch Bay");
        mapNames.put("E4M9", "C4M9: Operations");
    }

    /**
     * Creates MapInfo object for Freedoom Phase 1.
     */
    public Freedoom1MapInfo() {
        fromNameMap(Freedoom1MapInfo.mapNames);
    }
}
