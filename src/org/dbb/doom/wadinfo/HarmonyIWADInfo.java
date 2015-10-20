package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.HarmonyMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Harmony.
 *
 * Created by dennis on 20.10.15.
 */
public class HarmonyIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Harmony.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP01");
        mustContain.add("0HAWK01");
        mustContain.add("0CARA3");
        mustContain.add("0NOSE1");
    }

    /**
     * Creates an IWADInfo instance for Harmony.
     */
    public HarmonyIWADInfo() {
        super();
        setName("Harmony");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_NONE);
        setMapInfo(new HarmonyMapInfo());
        setMustContain(HarmonyIWADInfo.mustContain);
    }
}
