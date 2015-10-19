package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.DoomMapInfo;

import java.util.ArrayList;

/**
 * IWAD information for DOOM: BFG Edition.
 *
 * Created by dennis on 19.10.15.
 */
public class DoomBfgIWADInfo extends IWADInfo {

    /**
     * Creates an IWADInfo instance for DOOM: BFG Edition.
     */
    public DoomBfgIWADInfo() {
        super();
        setName("DOOM: BFG Edition");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_COMPATSHORTTEX);
        setMapInfo(new DoomMapInfo());

        // DOOM: BFG Edition has same lump checks, as Ultimate DOOM and
        // some additional checks.
        ArrayList<String> mustContain = new ArrayList<>(new UltimateDoomIWADInfo().getMustContain());
        mustContain.add("DMENUPIC");
        mustContain.add("M_ACPT");
        mustContain.add("M_CAN");
        mustContain.add("M_EXITO");
        mustContain.add("M_CHG");
        setMustContain(mustContain);
    }
}
