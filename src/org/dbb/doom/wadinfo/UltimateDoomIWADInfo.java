package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.MapInfo;
import org.dbb.doom.mapinfo.Doom2MapInfo;
import org.dbb.doom.mapinfo.DoomMapInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * IWAD information for Ultimate DOOM.
 *
 * Created by dennis on 19.10.15.
 */
public class UltimateDoomIWADInfo extends IWADInfo {

    /**
     * Creates an IWADInfo instance for Ultimate DOOM.
     */
    public UltimateDoomIWADInfo() {
        super();
        setName("The Ultimate DOOM");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_COMPATSHORTTEX);
        setMapInfo(new DoomMapInfo());

        // Ultimate DOOM has same lump checks, as DOOM and
        // an additional check for E4M2.
        ArrayList<String> mustContain = new ArrayList<>(new DoomIWADInfo().getMustContain());
        mustContain.add("E4M2");
        setMustContain(mustContain);
    }
}
