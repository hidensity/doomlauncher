package org.dbb.doom;

/**
 * Class, containing single MAPINFO entry.
 *
 * Created by dennis on 23.10.15.
 */
public class MapInfoEntry {

    /**
     * Internal key for the map (MAP01, E1M4, etc.).
     */
    private String mapKey;

    /**
     * The map's name.
     */
    private String mapName;

    /**
     * Does map's name come from an externalDefinition language lump?
     */
    private boolean externalDefinition;

    /**
     * Creates a new MapInfoEntry instance.
     * @param mapKey String with internal map's key.
     * @param mapName String with map's name.
     * @param external boolean, specifying name comes from external language lump.
     */
    public MapInfoEntry(String mapKey, String mapName, boolean external) {
        this.mapKey = mapKey;
        this.mapName = mapName;
        this.externalDefinition = external;
    }

    /**
     * Sets the map's name.
     * @param mapName String with map's name.
     */
    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * Gets the internal map's key.
      * @return String
     */
    public String getMapKey() {
        return this.mapKey;
    }

    /**
     * Gets the map's name.
     * @return String.
     */
    public String getMapName() {
        return this.mapName;
    }

    /**
     * Gets, whether the name comes from external language lump.
     * @return boolean
     */
    public boolean getExternalDefinition() {
        return this.externalDefinition;
    }
}
