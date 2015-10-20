package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.Chex3MapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Chex(R) Quest 3.
 *
 * Created by dennis on 20.10.15.
 */
public class Chex3IWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Chex(R) Quest 3.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("E1M1");
        mustContain.add("CYCLA1");
        mustContain.add("FLMBA1");
        mustContain.add("MAPINFO");
    }

    /**
     * Creates an IWADInfo instance for Chex(R) Quest 3.
     */
    public Chex3IWADInfo() {
        super();
        setName("Chex(R) Quest 3");
        setGameType(GameType.CHEX);
        setCompatibility(GameCompatibility.GI_NOTEXTCOLOR);
        setMapInfo(new Chex3MapInfo());
        setMustContain(Chex3IWADInfo.mustContain);
    }
}
