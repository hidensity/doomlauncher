package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.MapInfo;
import org.dbb.doom.mapinfo.HereticMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Blasphemer.
 *
 * Created by dennis on 20.10.15.
 */
public class BlasphemerIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Blasphemer.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("E1M1");
        mustContain.add("E2M1");
        mustContain.add("TITLE");
        mustContain.add("MUS_E1M1");
        mustContain.add("BLASPHEM");
    }

    /**
     * Creates an IWADInfo instance for Blasphemer.
     */
    public BlasphemerIWADInfo() {
        super();
        setName("Blasphemer");
        setGameType(GameType.HERETIC);
        setCompatibility(GameCompatibility.GI_NONE);
        setMapInfo(new MapInfo(new HereticMapInfo().getMapEntries("E[1-5]M\\d")));
        setMustContain(BlasphemerIWADInfo.mustContain);
    }
}
