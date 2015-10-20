package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.TNTMapInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * IWAD information for Final DOOM: TNT - Evilution.
 *
 * Created by dennis on 19.10.15.
 */
public class TNTIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Final DOOM: TNT - Evilution.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP01");
        mustContain.add("REDTNT2");
    }

    /**
     * Creates an IWADInfo instance for Final DOOM: TNT - Evilution.
     */
    public TNTIWADInfo() {
        super();
        setName("Final DOOM: TNT - Evilution");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_COMPATSHORTTEX | GameCompatibility.GI_COMPATSTAIRS);
        setMapInfo(new TNTMapInfo());
        setMustContain(TNTIWADInfo.mustContain);
    }
}
