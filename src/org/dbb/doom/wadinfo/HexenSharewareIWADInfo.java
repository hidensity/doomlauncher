package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.MapInfo;
import org.dbb.doom.mapinfo.HexenMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Hexen: Demo Version.
 *
 * Created by dennis on 20.10.15.
 */
public class HexenSharewareIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Hexen: Demo Version.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("TITLE");
        mustContain.add("MAP01");
        mustContain.add("WINNOWR");
    }

    /**
     * Creates an IWADInfo instance for Hexen: Demo Version.
     */
    public HexenSharewareIWADInfo() {
        super();
        setName("Hexen: Demo Version");
        setGameType(GameType.HEXEN);
        setCompatibility(GameCompatibility.GI_SHAREWARE);
        setMapInfo(new MapInfo(new HexenMapInfo().getMapNames("MAP0[1-4]")));
        setMustContain(HexenSharewareIWADInfo.mustContain);
    }
}
