package org.dbb.doom.wadinfo;

import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.Doom2MapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for DOOM2.
 *
 * Created by dbarzen on 19.10.15.
 */
public class Doom2IWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as DOOM2.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP01");
    }

    /**
     * Creates an IWADInfo instance for DOOM2.
     */
    public Doom2IWADInfo() {
        super();
        setName("DOOM2 - Hell On Earth");
        setGameType(GameType.DOOM);
        setMapInfo(new Doom2MapInfo());
        setMustContain(Doom2IWADInfo.mustContain);
    }
}
