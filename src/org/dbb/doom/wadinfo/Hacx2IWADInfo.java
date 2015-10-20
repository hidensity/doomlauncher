package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.Hacx2MapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Hacx 2.0.
 *
 * Created by dennis on 20.10.15.
 */
public class Hacx2IWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Hacx 2.0.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP01");
        mustContain.add("HACX-E");
    }

    /**
     * Creates an IWADInfo instance for Hacx 2.0.
     */
    public Hacx2IWADInfo() {
        super();
        setName("Hacx 2.0");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_NONE);
        setMapInfo(new Hacx2MapInfo());
        setMustContain(Hacx2IWADInfo.mustContain);
    }
}
