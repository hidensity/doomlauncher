package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.ChexMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Chex(R) Quest.
 *
 * Created by dennis on 20.10.15.
 */
public class ChexIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Chex(R) Quest.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("E1M1");
        mustContain.add("E4M1");
        mustContain.add("W94_1");
        mustContain.add("POSSH0M0");
    }

    /**
     * Creates an IWADInfo instance for Chex(R) Quest.
     */
    public ChexIWADInfo() {
        super();
        setName("Chex(R) Quest");
        setGameType(GameType.CHEX);
        setCompatibility(GameCompatibility.GI_NONE);
        setMapInfo(new ChexMapInfo());
        setMustContain(ChexIWADInfo.mustContain);
    }
}
