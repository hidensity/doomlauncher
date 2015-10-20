package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.HacxMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Hacx: Twitch'n Kill.
 *
 * Created by dennis on 20.10.15.
 */
public class HacxIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Hacx: Twitch'n Kill.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP01");
        mustContain.add("HACX-R");
    }

    /**
     * Creates an IWADInfo instance for Hacx: Twitch'n Kill.
     */
    public HacxIWADInfo() {
        super();
        setName("Hacx: Twitch'n Kill");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_NONE);
        setMapInfo(new HacxMapInfo());
        setMustContain(HacxIWADInfo.mustContain);
    }
}
