package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.MapInfo;
import org.dbb.doom.mapinfo.HereticMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Heretic: Shadow of the Serpent Riders.
 *
 * Created by dennis on 20.10.15.
 */
public class HereticExtendedIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Heretic: Shadow of the Serpent Riders.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("E1M1");
        mustContain.add("E2M1");
        mustContain.add("TITLE");
        mustContain.add("MUS_E1M1");
    }

    /**
     * Creates an IWADInfo instance for Heretic: Shadow of the Serpent Riders.
     */
    public HereticExtendedIWADInfo() {
        super();
        setName("Heretic");
        setGameType(GameType.HERETIC);
        setCompatibility(GameCompatibility.GI_NONE);
        setMapInfo(new HereticMapInfo());
        setMustContain(HereticExtendedIWADInfo.mustContain);
    }
}
