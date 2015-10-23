package org.dbb.doom.mapinfo;

import org.dbb.doom.MapInfo;

import java.util.TreeMap;

/**
 * MapInfo for Hexen.
 *
 * Created by dennis on 20.10.15.
 */
public class HexenMapInfo extends MapInfo {

    /**
     * Hexen map names.
     */
    private static final TreeMap<String, String> mapNames;
    static {
        mapNames = new TreeMap<>();
        mapNames.put("MAP01", "Level 1.1: Winnowing Hall");
        mapNames.put("MAP02", "Level 1.2: Seven Portals");
        mapNames.put("MAP03", "Level 1.3: Guardian of Ice");
        mapNames.put("MAP04", "Level 1.4: Guardian of Fire");
        mapNames.put("MAP05", "Level 1.5: Guardian of Steel");
        mapNames.put("MAP06", "Level 1.6: Bright Crucible");
        mapNames.put("MAP13", "Level 2.1: Shadow Wood");
        mapNames.put("MAP08", "Level 2.2: Darkmere");
        mapNames.put("MAP09", "Level 2.3: Caves of Circe");
        mapNames.put("MAP10", "Level 2.4: Wastelands");
        mapNames.put("MAP11", "Level 2.5: Sacred Grove");
        mapNames.put("MAP12", "Level 2.6: Hypostyle");
        mapNames.put("MAP27", "Level 3.1: Heresiarch's Seminary");
        mapNames.put("MAP28", "Level 3.2: Dragon Chapel");
        mapNames.put("MAP30", "Level 3.3: Griffin Chapel");
        mapNames.put("MAP31", "Level 3.4: Deathwind Chapel");
        mapNames.put("MAP32", "Level 3.5: Orchards of Lamentations");
        mapNames.put("MAP33", "Level 3.6: Silent Refectory");
        mapNames.put("MAP34", "Level 3.7: Wolf Chapel");
        mapNames.put("MAP21", "Level 4.1: Forsaken Outpost");
        mapNames.put("MAP22", "Level 4.2: Castle of Greif");
        mapNames.put("MAP23", "Level 4.3: Gibbet");
        mapNames.put("MAP24", "Level 4.4: Effluvium");
        mapNames.put("MAP25", "Level 4.5: Dungeons");
        mapNames.put("MAP26", "Level 4.6: Desolate Garden");
        mapNames.put("MAP35", "Level 5.1: Necropolis");
        mapNames.put("MAP36", "Level 5.2: Zedek's Tomb");
        mapNames.put("MAP37", "Level 5.3: Menelkir's Tomb");
        mapNames.put("MAP38", "Level 5.4: Traductus' Tomb");
        mapNames.put("MAP39", "Level 5.5: Vivarium");
        mapNames.put("MAP40", "Level 5.6: Dark Crucible");
    }

    /**
     * Creates MapInfo object for Hexen.
     */
    public HexenMapInfo() {
        super(fromNameMap(mapNames));
    }
}
