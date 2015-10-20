package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.Doom2MapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Action Doom 2: Urban Brawl.
 *
 * Created by dennis on 19.10.15.
 */
public class UrbanBrawlIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Action Doom 2: Urban Brawl.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP01");
        mustContain.add("AD2LIB");
    }

    /**
     * Creates an IWADInfo instance for Action Doom 2: Urban Brawl.
     */
    public UrbanBrawlIWADInfo() {
        super();
        setName("Action Doom 2: Urban Brawl");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_COMPATSHORTTEX);
        setMapInfo(new Doom2MapInfo());
        setMustContain(UrbanBrawlIWADInfo.mustContain);
    }
}
