package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.HexenDDMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Hexen: Deathkings of the Dark Citadel.
 *
 * Created by dennis on 20.10.15.
 */
public class HexenDDIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Hexen: Deathkings of the Dark Citadel.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("TITLE");
        mustContain.add("MAP60");
        mustContain.add("CLUS1MSG");
    }

    /**
     * Creates an IWADInfo instance for Hexen: Deathkings of the Dark Citadel.
     */
    public HexenDDIWADInfo() {
        super();
        setName("Hexen: Deathkings of the Dark Citadel");
        setGameType(GameType.HEXEN);
        setCompatibility(GameCompatibility.GI_COMPATPOLY1 | GameCompatibility.GI_COMPATPOLY2);
        setMapInfo(new HexenDDMapInfo());
        setMustContain(HexenDDIWADInfo.mustContain);
    }
}
