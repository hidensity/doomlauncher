package org.dbb.doom;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

/**
 * Class containing a WAD file's map information.
 *
 * Created by dennis on 19.10.15.
 */
public class MapInfo {

    /**
     * MAPINFO lump name.
     */
    public static final String LUMP_MAPINFO = "MAPINFO";

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
     * @param fc FileChannel object, used to read data.
     * @return MapInfo object.
     * @throws IllegalArgumentException if lump does not contain valid MAPINFO data.
     */
    public static MapInfo fromLump(WADLump lump, FileChannel fc) throws Exception {
        HashMap<String, String> mapNames = new HashMap<>();

        // Data to parse.
        byte[] lumpData;

        // Try to retrieve the lump's data and split into single lines.
        lumpData = lump.getLumpData(fc);
        String[] mapinfo = new String(lumpData).split("\\r?\\n");

        // The following RegEx pattern will find valid
        // map definitions within a "MAPINFO" lump.
        // ^\s*map\s+([^\s]*)\s+(lookup\s+|name\s+)?"(.*)"
        // map E1M1 lookup "HUSTR_E1M1"     <- match
        // map E1M1 name "$HUSTR_E1M1"      <- match
        // map MAP01 "entryway"             <- match
        //    map MAP07 "dead simple"       <- match
        // ;map E1M2 lookup "HUSTR_E1M2"    <- no match
        // #map MAP01 "entryway"            <- no match

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
