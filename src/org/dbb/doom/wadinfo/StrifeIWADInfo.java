package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.MapInfo;
import org.dbb.doom.mapinfo.StrifeMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Strife: Quest for the Sigil.
 *
 * Created by dennis on 20.10.15.
 */
public class StrifeIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Strife: Quest for the Sigil.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP01");
        mustContain.add("MAP33");
        mustContain.add("ENDSTRF");
    }

    /**
     * Creates an IWADInfo instance for Strife: Quest for the Sigil.
     */
    public StrifeIWADInfo() {
        super();
        setName("Strife: Quest for the Sigil");
        setGameType(GameType.STRIFE);
        setCompatibility(GameCompatibility.GI_NONE);
        setMapInfo(new MapInfo(new StrifeMapInfo().getMapNames("MAP(([0-2][\\d])|(3[0-1]))")));
        setMustContain(StrifeIWADInfo.mustContain);
    }
}
