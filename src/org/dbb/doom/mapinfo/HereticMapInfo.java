package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.TreeMap;

/**
 * MapInfo for Heretic.
 *
 * Created by dennis on 20.10.15.
 */
public class HereticMapInfo extends MapInfo {

    /**
     * Heretic map names.
     */
    private static final TreeMap<String, String> mapNames;
    static {
        mapNames = new TreeMap<>();
        mapNames.put("E1M1", "E1M1: The Docks");
        mapNames.put("E1M2", "E1M2: The Dungeon");
        mapNames.put("E1M3", "E1M3: The Gatehouse");
        mapNames.put("E1M4", "E1M4: The Guard Tower");
        mapNames.put("E1M5", "E1M5: The Citadel");
        mapNames.put("E1M6", "E1M6: The Cathedral");
        mapNames.put("E1M7", "E1M7: The Crypts");
        mapNames.put("E1M8", "E1M8: Hell's Maw");
        mapNames.put("E1M9", "E1M9: The Graveyard");
        mapNames.put("E2M1", "E2M1: The Crater");
        mapNames.put("E2M2", "E2M2: The Lava Pits");
        mapNames.put("E2M3", "E2M3: The River of Fire");
        mapNames.put("E2M4", "E2M4: The Ice Grotto");
        mapNames.put("E2M5", "E2M5: The Catacombs");
        mapNames.put("E2M6", "E2M6: The Labyrinth");
        mapNames.put("E2M7", "E2M7: The Great Hall");
        mapNames.put("E2M8", "E2M8: The Portals of Chaos");
        mapNames.put("E2M9", "E2M9: The Glacier");
        mapNames.put("E3M1", "E3M1: The Storehouse");
        mapNames.put("E3M2", "E3M2: The Cesspool");
        mapNames.put("E3M3", "E3M3: The Confluence");
        mapNames.put("E3M4", "E3M4: The Azure Fortress");
        mapNames.put("E3M5", "E3M5: The Ophidian Lair");
        mapNames.put("E3M6", "E3M6: The Halls of Fear");
        mapNames.put("E3M7", "E3M7: The Chasm");
        mapNames.put("E3M8", "E3M8: D'Sparil's Keep");
        mapNames.put("E3M9", "E3M9: The Aquifer");
        mapNames.put("E4M1", "E4M1: Catafalque");
        mapNames.put("E4M2", "E4M2: Blockhouse");
        mapNames.put("E4M3", "E4M3: Ambulatory");
        mapNames.put("E4M4", "E4M4: Sepulcher");
        mapNames.put("E4M5", "E4M5: Great Stair");
        mapNames.put("E4M6", "E4M6: Halls of the Apostate");
        mapNames.put("E4M7", "E4M7: Ramparts of Perdition");
        mapNames.put("E4M8", "E4M8: Shattered Bridge");
        mapNames.put("E4M9", "E4M9: Mausoleum");
        mapNames.put("E5M1", "E5M1: Ochre Cliffs");
        mapNames.put("E5M2", "E5M2: Rapids");
        mapNames.put("E5M3", "E5M3: Quay");
        mapNames.put("E5M4", "E5M4: Courtyard");
        mapNames.put("E5M5", "E5M5: Hydratyr");
        mapNames.put("E5M6", "E5M6: Colonnade");
        mapNames.put("E5M7", "E5M7: Foetid Manse");
        mapNames.put("E5M8", "E5M8: Field of Judgement");
        mapNames.put("E5M9", "E5M9: Skein of D'Sparil");
        mapNames.put("E6M1", "E6M1: Raven's Lair");
        mapNames.put("E6M2", "E6M2: The Water Shrine");
        mapNames.put("E6M3", "E6M3: American's Legacy");
    }

    /**
     * Creates MapInfo object for Heretic.
     */
    public HereticMapInfo() {
        super(fromNameMap(mapNames));
    }
}
