package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.DoomMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for DOOM (Registered).
 *
 * Created by dennis on 19.10.15.
 */
public class DoomIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as DOOM (Registered).
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("E1M1");
        mustContain.add("E2M1");
        mustContain.add("E2M2");
        mustContain.add("E2M3");
        mustContain.add("E2M4");
        mustContain.add("E2M5");
        mustContain.add("E2M6");
        mustContain.add("E2M7");
        mustContain.add("E2M8");
        mustContain.add("E2M9");
        mustContain.add("E3M1");
        mustContain.add("E3M2");
        mustContain.add("E3M3");
        mustContain.add("E3M4");
        mustContain.add("E3M5");
        mustContain.add("E3M6");
        mustContain.add("E3M7");
        mustContain.add("E3M8");
        mustContain.add("E3M9");
        mustContain.add("DPHOOF");
        mustContain.add("BFGGA0");
        mustContain.add("HEADA1");
        mustContain.add("CYBRA1");
        mustContain.add("SPIDA1D1");
    }

    /**
     * Creates an IWADInfo instance for DOOM (Registered).
     */
    public DoomIWADInfo() {
        super();
        setName("DOOM (Registered)");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_COMPATSHORTTEX);
        setMapInfo(new DoomMapInfo());
        setMustContain(DoomIWADInfo.mustContain);
    }
}
