package org.dbb.doom;

import org.dbb.doom.exceptions.InvalidWADException;
import org.dbb.doom.wadinfo.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IWAD Manager
 * Class to retrieve an IWAD's information.
 *
 * Created by dennis on 16.10.15.
 */
public class IWADManager extends WADManager {

    /**
     * Predefined IWAD configurations.
     */
    public static final List<IWADInfo> PREDEFINED_IWAD;
    static {
        PREDEFINED_IWAD = new ArrayList<>();
        // IMPORTANT:
        // The order of these predefined IWADs absolutely needs to be kept!!!
        // They must be sorted in identification order (easiest to recognize first).
        PREDEFINED_IWAD.add(new HarmonyIWADInfo());                 // Harmony
        PREDEFINED_IWAD.add(new Hacx2IWADInfo());                   // Hacx 2.0
        PREDEFINED_IWAD.add(new HacxIWADInfo());                    // Hacx: Twitch'n Kill
        PREDEFINED_IWAD.add(new UrbanBrawlIWADInfo());              // Action Doom 2: Urban Brawl
        PREDEFINED_IWAD.add(new Chex3IWADInfo());                   // Chex(R) Quest 3
        PREDEFINED_IWAD.add(new ChexIWADInfo());                    // Chex(R) Quest
        PREDEFINED_IWAD.add(new StrifeIWADInfo());                  // Strife: Quest for the Sigil
        PREDEFINED_IWAD.add(new StrifeTeaserNewIWADInfo());         // Strife: Teaser (New Version)
        PREDEFINED_IWAD.add(new StrifeTeaserOldIWADInfo());         // Strife: Teaser (Old Version)
        PREDEFINED_IWAD.add(new HexenIWADInfo());                   // Hexen: Beyond Heretic
        PREDEFINED_IWAD.add(new HexenDDIWADInfo());                 // Hexen: DD
        PREDEFINED_IWAD.add(new HexenSharewareIWADInfo());          // Hexen: Demo Version
        PREDEFINED_IWAD.add(new BlasphemerIWADInfo());              // Blasphemer
        PREDEFINED_IWAD.add(new HereticExtendedIWADInfo());         // Heretic: Shadow of the Serpent Riders
        PREDEFINED_IWAD.add(new HereticIWADInfo());                 // Heretic
        PREDEFINED_IWAD.add(new HereticSharewareIWADInfo());        // Heretic Shareware
        PREDEFINED_IWAD.add(new FreeDMIWADInfo());                  // FreeDM
        PREDEFINED_IWAD.add(new Freedoom2IWADInfo());               // Freedoom - Phase 2
        PREDEFINED_IWAD.add(new Freedoom1IWADInfo());               // Freedoom - Phase 1
        PREDEFINED_IWAD.add(new FreedoomDemoIWADInfo());            // Freedoom Demo
        PREDEFINED_IWAD.add(new DoomBfgIWADInfo());                 // DOOM: BFG Edition
        PREDEFINED_IWAD.add(new UltimateDoomIWADInfo());            // The Ultimate DOOM
        PREDEFINED_IWAD.add(new DoomIWADInfo());                    // DOOM (Registered)
        PREDEFINED_IWAD.add(new DoomSharewareIWADInfo());           // DOOM Shareware
        PREDEFINED_IWAD.add(new TNTIWADInfo());                     // Final DOOM: TNT - Evilution
        PREDEFINED_IWAD.add(new PlutoniaIWADInfo());                // Final DOOM: Plutonia Experiment
        PREDEFINED_IWAD.add(new Doom2BfgIWADInfo());                // DOOM 2: BFG Edition
        PREDEFINED_IWAD.add(new Doom2IWADInfo());                   // DOOM 2
    }

    /**
     * IWAD information.
     */
    private IWADInfo iwadInfo;

    /**
     * Creates a new IWADManager object.
     * @param filename Name of the IWADManager file to use.
     * @throws InvalidWADException if an invalid IWAD file has been specified.
     * @throws IOException if file could not be read or is a directory.
     */
    public IWADManager(String filename) throws Exception {
        super(filename);

        // Get the game information for this IWAD.
        this.iwadInfo = parseIWADInfo();
        if (null == this.iwadInfo) {
            throw new InvalidWADException("For the specified file, no IWAD definition could be retrieved.");
        }

        // Close the WAD file.
        closeWAD();
    }

    /**
     * Gets the IWAD information.
     * @return IWADInfo
     */
    public IWADInfo getIWADInfo() {
        return this.iwadInfo;
    }

    /**
     * Parses a WAD file and gets the behind game information.
     * @return String
     */
    private IWADInfo parseIWADInfo() throws Exception {
        IWADInfo iwi = null;

        // Check, whether the IWAD contains an "LUMP_IWADINFO" lump.
        if (this.lumps.containsKey(IWADInfo.LUMP_IWADINFO)) {
            iwi = IWADInfo.fromLump(this.lumps.get(IWADInfo.LUMP_IWADINFO), this.fc);
        }

        // IWAD file does not contain an LUMP_IWADINFO lump. Try to find out
        // what IWAD file we are using.
        for (IWADInfo info : PREDEFINED_IWAD) {
            if (null == iwi &&
                this.lumpNames.containsAll(info.getMustContain())) {
                iwi = info;
            }
        }

        if (null != iwi) {
            iwi.setLumps(this.lumpNames);
        }

        return iwi;
    }
}
