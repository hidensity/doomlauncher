package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.Freedoom2MapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Freedom - Phase 2.
 *
 * Created by dennis on 19.10.15.
 */
public class Freedoom2IWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Freedom - Phase 2.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP01");
        mustContain.add("FREEDOOM");
    }

    /**
     * Creates an IWADInfo instance for Freedom - Phase 2.
     */
    public Freedoom2IWADInfo() {
        super();
        setName("Freedom - Phase 2");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_NONE);
        setMapInfo(new Freedoom2MapInfo());
        setMustContain(Freedoom2IWADInfo.mustContain);
    }
}
