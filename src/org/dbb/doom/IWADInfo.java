package org.dbb.doom;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD Information.
 * Created by dbarzen on 16.10.15.
 */
public class IWADInfo {

    /**
     * IWAD's name.
     */
    private String name;

    /**
     * Game type.
     */
    private GameType gameType;

    /**
     * Basic map info.
     */
    private String mapInfo;

    /**
     * List of WADs to load.
     */
    private List<String> load;

    /**
     * List of lumps.
     */
    private List<String> lumps;

    /**
     * Creates a new IWADInfo object.
     */
    public IWADInfo() {
        this.gameType = GameType.DOOM;
        this.load = new ArrayList<>();
        this.lumps = new ArrayList<>();
    }

    /**
     * Sets the IWAD's name.
     * @param name Name of the IWAD.
     * @return IWADInfo
     */
    public IWADInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sets the IWAD's game type.
     * @param gameType GameType enum value.
     * @return IWADInfo
     */
    public IWADInfo setGameType(GameType gameType) {
        this.gameType = gameType;
        return this;
    }

    /**
     * Sets the base map info to load.
     * @param mapInfo String with map info.
     * @return IWADInfo
     */
    public IWADInfo setMapInfo(String mapInfo) {
        this.mapInfo = mapInfo;
        return this;
    }

    /**
     * Sets the WADs to be loaded with this one.
     * @param load List of WAD files.
     * @return IWADInfo
     */
    public IWADInfo setLoad(List<String> load) {
        this.load = load;
        return this;
    }

    /**
     * Sets the lump names for identification.
     * @param lumps List with lumps.
     * @return IWADInfo
     */
    public IWADInfo setLumps(List<String> lumps) {
        this.lumps = lumps;
        return this;
    }

    /**
     * Gets the IWAD's name
     * @return String.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the game type.
     * @return GameType
     */
    public GameType getGameType() {
        return this.gameType;
    }

    /**
     * Gets the basic map info.
     * @return String
     */
    public String getMapInfo() {
        return this.mapInfo;
    }

    /**
     * Gets a list of WADs to load.
     * @return List<String>
     */
    public List<String> getLoad() {
        return this.load;
    }

    /**
     * Gets a list of lumps.
     * @return List<String>
     */
    public List<String> getLumps() {
        return this.lumps;
    }
}
