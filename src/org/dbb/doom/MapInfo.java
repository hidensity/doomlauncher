package org.dbb.doom;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEParsingException;

import java.nio.channels.FileChannel;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
     * Placeholder for unknown map name.
     */
    public static final String MAP_NAME_UNKNOWN = "[no name]";

    /**
     * Map containing the single map's name.
     */
    protected Map<String, MapInfoEntry> mapEntries;

    protected MapInfo() {
        this.mapEntries = new TreeMap<>();
    }

    /**
     * Creates a new MapInfo instance.
     * @param mapEntries Map containing the single map's entries.
     */
    public MapInfo(Map<String, MapInfoEntry> mapEntries) {
        this.mapEntries = new TreeMap<>();

        for (String key : mapEntries.keySet()) {
            this.mapEntries.put(key, new MapInfoEntry(key, mapEntries.get(key).getMapName(), false));
        }
    }

    /**
     * Creates a set of MapInfoEntry instances from a map, containing map keys and names.
     * @param mapNames Map
     * @return MapInfo instance.
     */
    public static Map<String, MapInfoEntry> fromNameMap(Map<String, String> mapNames) {
        TreeMap<String, MapInfoEntry> entries = new TreeMap<>();
        for (String key : mapNames.keySet()) {
            entries.put(key, new MapInfoEntry(key, mapNames.get(key), false));
        }

        return entries;
    }

    /**
     * Creates a new MapInfo instance by parsing a lump containing map information data.
     * @param lump WADLump containing map information.
     * @param fc FileChannel object, used to read data.
     * @return MapInfo object.
     * @throws IllegalArgumentException if lump does not contain valid MAPINFO data.
     */
    public static MapInfo fromLump(WADLump lump, FileChannel fc) throws Exception {
        TreeMap<String, MapInfoEntry> mapEntries = new TreeMap<>();

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

        // Set up the RexEx matcher.
        String regEx = "^\\s*map\\s+([^\\s]*)\\s+(lookup\\s+|name\\s+)?\"(.*)\"";
        Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        for (String line : mapinfo) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find() && matcher.groupCount() == 3) {
                // Extract the map's key.
                String key = matcher.group(1);
                // Extract, whether to lookup the name in an
                // external language definition
                boolean externalDefinition = (null != matcher.group(2));
                // Get map's name, or language key.
                String name = matcher.group(3);

                // Save map entry.
                mapEntries.put(key, new MapInfoEntry(key, name, externalDefinition));
            }
        }

        return new MapInfo(mapEntries);
    }

    /**
     * Gets the map, containing the single map's name.
     * @return Map
     */
    public Map<String, MapInfoEntry> getMapEntries() {
        return this.mapEntries;
    }

    /**
     * Gets a sub-set of the map names, filtered by a regular expression on the map keys.
     * @param regex String containing a regular expression.
     * @return Map
     */
    public Map<String, MapInfoEntry> getMapEntries(String regex) {
        TreeMap<String, MapInfoEntry> mapNames = new TreeMap<>();

        // Add matching keys to map.
        for (String key : mapEntries.keySet()) {
            if (key.matches(regex)) {
                mapNames.put(key, mapEntries.get(key));
            }
        }

        return mapNames;
    }

    /**
     * Merges this MapInfo object with another one.
     * @param info MapInfo to overwrite similar information with.
     * @return MapInfo
     */
    public MapInfo mergeWith(MapInfo info) {
        // If object, to merge with, contains a key, the current
        // instance contains, overwrite the information.
        this.mapEntries.keySet().stream().filter(key ->
                info.getMapEntries().containsKey(key) &&
                        null != info.getMapEntries().get(key) &&
                        !info.getMapEntries().get(key).getMapName().equals(MapInfo.MAP_NAME_UNKNOWN)).forEach(key ->
                        this.mapEntries.replace(key, info.getMapEntries().get(key))
        );

        // Append new key-value pairs to the map.
        info.getMapEntries().keySet().stream().filter(key ->
                !this.mapEntries.containsKey(key) &&
                null != info.getMapEntries().get(key)).forEach(key ->
            this.mapEntries.put(key, info.getMapEntries().get(key))
        );

        return this;
    }
}
