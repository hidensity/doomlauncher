package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.Doom2MapInfo;
import org.dbb.doom.mapinfo.PlutoniaMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Final DOOM: The Plutonia Experiment.
 *
 * Created by dennis on 19.10.15.
 */
public class PlutoniaIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Final DOOM: The Plutonia Experiment.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP01");
        mustContain.add("CAMO1");
    }

    /**
     * Creates an IWADInfo instance for Final DOOM: The Plutonia Experiment.
     */
    public PlutoniaIWADInfo() {
        super();
        setName("Final DOOM: The Plutonia Experiment");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_COMPATSHORTTEX);
        setMapInfo(new PlutoniaMapInfo());
        setMustContain(PlutoniaIWADInfo.mustContain);
    }
}
