package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.Freedoom1MapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Freedom - Phase 1.
 *
 * Created by dennis on 19.10.15.
 */
public class Freedoom1IWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Freedom - Phase 1.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("E1M1");
        mustContain.add("E2M1");
        mustContain.add("E3M1");
        mustContain.add("FREEDOOM");
    }

    /**
     * Creates an IWADInfo instance for Freedom - Phase 1.
     */
    public Freedoom1IWADInfo() {
        super();
        setName("Freedom - Phase 1");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_NONE);
        setMapInfo(new Freedoom1MapInfo());
        setMustContain(Freedoom1IWADInfo.mustContain);
    }
}
