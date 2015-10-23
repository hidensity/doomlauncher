package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.MapInfo;
import org.dbb.doom.mapinfo.StrifeMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Strife: Teaser (New Version).
 *
 * Created by dennis on 20.10.15.
 */
public class StrifeTeaserNewIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Strife: Teaser (New Version).
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP33");
        mustContain.add("ENDSTRF");
        mustContain.add("INVCURS");
    }

    /**
     * Creates an IWADInfo instance for Strife: Teaser (New Version).
     */
    public StrifeTeaserNewIWADInfo() {
        super();
        setName("Strife: Teaser (New Version)");
        setGameType(GameType.STRIFE);
        setCompatibility(GameCompatibility.GI_SHAREWARE | GameCompatibility.GI_TEASER2);
        setMapInfo(new MapInfo(new StrifeMapInfo().getMapEntries("MAP3[2-4]")));
        setMustContain(StrifeTeaserNewIWADInfo.mustContain);
    }
}
