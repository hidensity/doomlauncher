package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.MapInfo;
import org.dbb.doom.mapinfo.Freedoom1MapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Freedom Demo.
 *
 * Created by dennis on 19.10.15.
 */
public class FreedoomDemoIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Freedom Demo.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("E1M1");
        mustContain.add("FREEDOOM");
    }

    /**
     * Creates an IWADInfo instance for Freedom Demo.
     */
    public FreedoomDemoIWADInfo() {
        super();
        setName("Freedom Demo");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_NONE);
        setMapInfo(new MapInfo(new Freedoom1MapInfo().getMapNames("E1M\\d")));
        setMustContain(FreedoomDemoIWADInfo.mustContain);
    }
}
