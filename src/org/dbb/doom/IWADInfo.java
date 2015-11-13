/*******************************************************************************
 * Copyright (c) 2015 HiDensity. All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 * *****************************************************************************
 *
 * IWADInfo.java
 *
 * IWAD Information.
 * Created by dennis on 16.10.15.
 *
 * Created by: dennis 2015/10/16
 */

package org.dbb.doom;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class IWADInfo {

    /**
     * Gets the LUMP_IWADINFO lump's name.
     */
    public static String LUMP_IWADINFO = "LUMP_IWADINFO";

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
    private MapInfo mapInfo;

    /**
     * Game compatibility.
     */
    private int compatibility;

    /**
     * List of WADs to load.
     */
    private List<String> load;

    /**
     * List of lumps.
     */
    private List<String> lumps;

    /**
     * Lists of lumps, the IWAD must contain to be identified as a certain game.
     */
    private List<String> mustContain;

    /**
     * Creates a new IWADInfo object.
     */
    public IWADInfo() {
        this.gameType = GameType.DOOM;
        this.load = new ArrayList<>();
        this.lumps = new ArrayList<>();
        this.compatibility = GameCompatibility.GI_NONE;
        this.mustContain = new ArrayList<>();
    }

    /**
     * Creates an IWADInfo object by parsing a lump, containing IWAD information.
     * @param lump WADLump containing IWAD information.
     * @param fc FileChannel, used for reading.
     * @return IWADInfo
     * @throws IllegalArgumentException if lump does not contain valid LUMP_IWADINFO.
     */
    public static IWADInfo fromLump(WADLump lump, FileChannel fc) throws Exception {
        try {
            String lumpData = new String(lump.getLumpData(fc));
            // TODO: lumpData needs to be parsed.
            return new IWADInfo();
        } catch (Exception e) {
            throw new IllegalArgumentException("Could not read LUMP_IWADINFO lump.", e);
        }

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
     * @param mapInfo MapInfo object.
     * @return IWADInfo
     */
    public IWADInfo setMapInfo(MapInfo mapInfo) {
        this.mapInfo = mapInfo;
        return this;
    }

    /**
     * Sets the IWAD's compatibility.
     * @param compatibility GameCompatibility constant.
     * @return IWADInfo
     */
    public IWADInfo setCompatibility(int compatibility) {
        this.compatibility = compatibility;
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
     * Sets the list of lumps an IWAD must contain to be recognized as a certain game.
     * @param mustContain List of Strings, containing lump names.
     * @return IWADInfo
     */
    public IWADInfo setMustContain(List<String> mustContain) {
        this.mustContain = mustContain;
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
     * @return MapInfo
     */
    public MapInfo getMapInfo() {
        return this.mapInfo;
    }

    /**
     * Gets the IWAD's compatibility.
     * @return int
     */
    public int getCompatibility() {
        return this.compatibility;
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

    /**
     * Gets a list of lumps, the IWAD must contain to be recognized as a certain game.
     * @return List<String>
     */
    public List<String> getMustContain() {
        return this.mustContain;
    }
}
