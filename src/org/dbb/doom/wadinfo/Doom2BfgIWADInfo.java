package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.MapInfo;
import org.dbb.doom.mapinfo.Doom2MapInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * IWAD information for DOOM2: BFG Edition.
 *
 * Created by dennis on 19.10.15.
 */
public class Doom2BfgIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as DOOM2 BFG.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP01");
        mustContain.add("DMENUPIC");
        mustContain.add("M_ACPT");
        mustContain.add("M_CAN");
        mustContain.add("M_EXITO");
        mustContain.add("M_CHG");
    }

    /**
     * Creates an IWADInfo instance for DOOM2: BFG Edition.
     */
    public Doom2BfgIWADInfo() {
        super();
        setName("DOOM2: BFG Edition");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_COMPATSHORTTEX);

        // Replace and add map names, different from DOOM2.
        HashMap<String, String> mapNames = new HashMap<>(new Doom2MapInfo().getMapNames());
        mapNames.replace("MAP31", "Level 31: IDKFA");       // Wolfenstein 3D censorship.
        mapNames.replace("MAP32", "Level 32: Keen");
        mapNames.put("MAP33", "Level 33: Betray");

        setMapInfo(new MapInfo(mapNames));
        setMustContain(Doom2BfgIWADInfo.mustContain);
    }
}
