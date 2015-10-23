package org.dbb.doom.wadinfo;

import org.dbb.doom.*;
import org.dbb.doom.mapinfo.Doom2MapInfo;

import java.util.ArrayList;
import java.util.TreeMap;
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
        TreeMap<String, MapInfoEntry> mapNames = new TreeMap<>(new Doom2MapInfo().getMapEntries());
        mapNames.replace("MAP31", new MapInfoEntry("MAP31", "Level 31: IDKFA", false));     // Wolfenstein 3D censorship.
        mapNames.replace("MAP32", new MapInfoEntry("MAP32", "Level 32: Keen", false));
        mapNames.put("MAP33", new MapInfoEntry("MAP33", "Level 33: Betray", false));

        setMapInfo(new MapInfo(mapNames));
        setMustContain(Doom2BfgIWADInfo.mustContain);
    }
}
