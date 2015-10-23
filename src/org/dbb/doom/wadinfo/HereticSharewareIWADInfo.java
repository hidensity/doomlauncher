package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.MapInfo;
import org.dbb.doom.mapinfo.HereticMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Heretic Shareware.
 *
 * Created by dennis on 20.10.15.
 */
public class HereticSharewareIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Heretic Shareware.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("E1M1");
        mustContain.add("TITLE");
        mustContain.add("MUS_E1M1");
    }

    /**
     * Creates an IWADInfo instance for Heretic Shareware.
     */
    public HereticSharewareIWADInfo() {
        super();
        setName("Heretic Shareware");
        setGameType(GameType.HERETIC);
        setCompatibility(GameCompatibility.GI_SHAREWARE);
        setMapInfo(new MapInfo(new HereticMapInfo().getMapEntries("E1M\\d")));
        setMustContain(HereticSharewareIWADInfo.mustContain);
    }
}
