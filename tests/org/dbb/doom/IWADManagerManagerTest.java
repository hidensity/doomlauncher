package org.dbb.doom;

import org.dbb.doom.exceptions.InvalidWADException;
import org.dbb.doom.wadinfo.*;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

/**
 * Testing of the IWADManager class.
 *
 * Created by dennis on 16.10.15.
 */
public class IWADManagerManagerTest {

    /**
     * Tests creating an IWADManager instance with a null value as file name.
     * @throws Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void testInstancingNull() throws Exception {
        new IWADManager(null);
    }

    /**
     * Tests creating an IWADManager instance with a non existing file.
     * @throws Exception
     */
    @Test(expected = IOException.class)
    public void testInstancingFileNotExists() throws Exception {
        new IWADManager("assets/IWAD/nonExisting.file");
    }

    /**
     * Tests creating an IWADManager instance with a directory given.
     * @throws Exception
     */
    @Test(expected = IOException.class)
    public void testInstancingWithDirectory() throws Exception {
        new IWADManager("assets/IWAD/");
    }

    /**
     * Tests creating an IWADManager instance with a file, not even containing a header.
     * @throws Exception
     */
    @Test(expected = InvalidWADException.class)
    public void testInstancingTooShortFile() throws Exception {
        new IWADManager("assets/testdata/file_too_short.txt");
    }

    /**
     * Tests creating an IWADManager instance with a valid IWAD file.
     * @throws Exception
     */
    @Test
    public void testInstancingExistingFile() throws Exception {
        new IWADManager("assets/IWAD/DOOM2.WAD").destroy();
    }

    /**
     * Tests, whether IWADInfo for DOOM2 has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoDoom2Created() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/DOOM2.WAD");
        assertTrue(iwm.getIWADInfo() instanceof Doom2IWADInfo);
        iwm.destroy();
    }

    /**
     * Tests, whether IWADInfo for DOOM2 BFG Edition has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoDoom2BfgCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/DOOM2BFG.WAD");
        assertTrue(iwm.getIWADInfo() instanceof Doom2BfgIWADInfo);
        iwm.destroy();
    }

    /**
     * Tests, whether IWADInfo for DOOM Plutonia has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoDoomPlutoniaCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/PLUTONIA.WAD");
        assertTrue(iwm.getIWADInfo() instanceof PlutoniaIWADInfo);
        iwm.destroy();
    }

    /**
     * Tests, whether IWADInfo for DOOM TNT has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoDoomTNTCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/TNT.WAD");
        assertTrue(iwm.getIWADInfo() instanceof TNTIWADInfo);
        iwm.destroy();
    }

    /**
     * Tests, whether IWADInfo for DOOM Shareware has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoDoomSharewareCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/DOOM1.WAD");
        assertTrue(iwm.getIWADInfo() instanceof DoomSharewareIWADInfo);
        iwm.destroy();
    }

    /**
     * Tests, whether IWADInfo for The Ultimate DOOM has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoUltimateDoomCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/DOOM.WAD");
        assertTrue(iwm.getIWADInfo() instanceof UltimateDoomIWADInfo);
        iwm.destroy();
    }

    /**
     * Tests, whether IWADInfo for Freedoom - Phase 1 has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoFreedoom1Created() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/freedoom1.wad");
        assertTrue(iwm.getIWADInfo() instanceof Freedoom1IWADInfo);
        iwm.destroy();
    }

    /**
     * Tests, whether IWADInfo for Freedoom - Phase 2 has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoFreedoom2Created() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/freedoom2.wad");
        assertTrue(iwm.getIWADInfo() instanceof Freedoom2IWADInfo);
        iwm.destroy();
    }

    /**
     * Tests, whether IWADInfo for Heretic: Shadow of the Serpent Riders has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoHereticExtendedCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/HERETIC.WAD");
        assertTrue(iwm.getIWADInfo() instanceof HereticExtendedIWADInfo);
        iwm.destroy();
    }

    /**
     * Tests, whether IWADInfo for Blasphemer has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoBlasphemerCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/BLASPHEM.WAD");
        assertTrue(iwm.getIWADInfo() instanceof BlasphemerIWADInfo);
        assertTrue(iwm.getMapIds().size() == 45);   // Blasphemer has E1M1..E5M9 => 45 maps
        iwm.destroy();
    }

    /**
     * Tests, whether IWADInfo for Hexen Demo has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoHexenDemoCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/HEXEN_SW.WAD");
        assertTrue(iwm.getIWADInfo() instanceof HexenSharewareIWADInfo);
        iwm.destroy();
    }

    /**
     * Tests, whether IWADInfo for Hexen DD has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoHexenDDCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/HEXDD.WAD");
        assertTrue(iwm.getIWADInfo() instanceof HexenDDIWADInfo);
        iwm.destroy();
    }

    /**
     * Tests, whether IWADInfo for Hexen has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoHexenCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/HEXEN.WAD");
        assertTrue(iwm.getIWADInfo() instanceof HexenIWADInfo);
        iwm.destroy();
    }

    /**
     * Tests creating an WADManager instance with a valid PWAD file.
     * @throws Exception
     */
    @Test
    public void testInstancingExistingPWADFile() throws Exception {
        new WADManager("assets/wad/e1a3.wad").destroy();
    }

    /**
     * Tests creating an WADManager instance with a valid PWAD file,
     * containing a bunch of maps.
     * @throws Exception
     */
    @Test
    public void testInstancingExistingPWADFileBunchOfMaps() throws Exception {
        WADManager wm = new WADManager("assets/wad/test-udmf.wad");
        assertEquals(wm.getMapIds().size(), 2);
        wm.destroy();
    }
}