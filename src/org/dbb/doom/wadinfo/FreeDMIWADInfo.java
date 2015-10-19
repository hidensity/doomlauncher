package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.FreeDMMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for FreeDM.
 *
 * Created by dennis on 19.10.15.
 */
public class FreeDMIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as FreeDM.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP01");
        mustContain.add("FREEDM");
    }

    /**
     * Creates an IWADInfo instance for FreeDM.
     */
    public FreeDMIWADInfo() {
        super();
        setName("FreeDM");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_NONE);
        setMapInfo(new FreeDMMapInfo());
        setMustContain(FreeDMIWADInfo.mustContain);
    }
}
