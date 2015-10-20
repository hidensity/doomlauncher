package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.MapInfo;
import org.dbb.doom.mapinfo.StrifeMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Strife: Teaser (Old Version).
 *
 * Created by dennis on 20.10.15.
 */
public class StrifeTeaserOldIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Strife: Teaser (Old Version).
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP33");
        mustContain.add("ENDSTRF");
    }

    /**
     * Creates an IWADInfo instance for Strife: Teaser (Old Version).
     */
    public StrifeTeaserOldIWADInfo() {
        super();
        setName("Strife: Teaser (Old Version)");
        setGameType(GameType.STRIFE);
        setCompatibility(GameCompatibility.GI_SHAREWARE);
        setMapInfo(new MapInfo(new StrifeMapInfo().getMapNames("MAP3[2-4]")));
        setMustContain(StrifeTeaserOldIWADInfo.mustContain);
    }
}
