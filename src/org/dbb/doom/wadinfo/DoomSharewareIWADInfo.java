package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.MapInfo;
import org.dbb.doom.mapinfo.DoomMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for DOOM Shareware.
 *
 * Created by dennis on 19.10.15.
 */
public class DoomSharewareIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as DOOM Shareware.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("E1M1");
    }

    /**
     * Creates an IWADInfo instance for DOOM Shareware.
     */
    public DoomSharewareIWADInfo() {
        super();
        setName("DOOM Shareware");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_COMPATSHORTTEX | GameCompatibility.GI_SHAREWARE);
        setMapInfo(new MapInfo(new DoomMapInfo().getMapEntries("E1M\\d")));
        setMustContain(DoomSharewareIWADInfo.mustContain);
    }
}
