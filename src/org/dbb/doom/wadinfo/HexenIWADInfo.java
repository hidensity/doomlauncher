package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.HexenMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Hexen: Beyond Heretic.
 *
 * Created by dennis on 20.10.15.
 */
public class HexenIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Hexen: Beyond Heretic.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("TITLE");
        mustContain.add("MAP01");
        mustContain.add("MAP40");
        mustContain.add("WINNOWR");
    }

    /**
     * Creates an IWADInfo instance for Hexen: Beyond Heretic.
     */
    public HexenIWADInfo() {
        super();
        setName("Hexen: Beyond Heretic");
        setGameType(GameType.HEXEN);
        setCompatibility(GameCompatibility.GI_COMPATPOLY1);
        setMapInfo(new HexenMapInfo());
        setMustContain(HexenIWADInfo.mustContain);
    }
}
