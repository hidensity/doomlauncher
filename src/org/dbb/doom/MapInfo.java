package org.dbb.doom;

import java.util.HashMap;
import java.util.Map;

/**
 * Class containing a WAD file's map information.
 *
 * Created by dennis on 19.10.15.
 */
public class MapInfo {

    /**
     * Map containing the single map's name.
     */
    private Map<String, String> mapNames;

    /**
     * Creates a new MapInfo instance.
     * @param mapNames Map containing the single map's name.
     */
    public MapInfo(Map<String, String> mapNames) {
        this.mapNames = mapNames;
    }

    /**
     * Creates a new MapInfo instance by parsing a lump containing map information data.
     * @param lump WADLump containing map information.
     * @return MapInfo object.
     * @throws IllegalArgumentException if lump does not contain valid MAPINFO data.
     */
    public static MapInfo fromLump(WADLump lump) throws Exception {
        HashMap<String, String> mapNames = new HashMap<>();

        return new MapInfo(mapNames);
    }

    /**
     * Gets the map, containing the single map's name.
     * @return Map
     */
    public Map<String, String> getMapNames() {
        return this.mapNames;
    }

    /**
     * Gets a sub-set of the map names, filtered by a regular expression on the map keys.
     * @param regex String containing a regular expression.
     * @return Map
     */
    public Map<String, String> getMapNames(String regex) {
        HashMap<String, String> mapNames = new HashMap<>();

        // Add matching keys to map.
        this.mapNames.keySet().stream().filter(key ->
                key.matches(regex)).forEach(key ->
                    mapNames.put(key, this.mapNames.get(key)
                )
        );

        return mapNames;
    }
}
