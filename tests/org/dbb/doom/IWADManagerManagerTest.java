package org.dbb.doom;

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
    @Test(expected = IllegalArgumentException.class)
    public void testInstancingTooShortFile() throws Exception {
        new IWADManager("assets/testdata/file_too_short.txt");
    }

    /**
     * Tests creating an IWADManager instance with a valid IWAD file.
     * @throws Exception
     */
    @Test
    public void testInstancingExistingFile() throws Exception {
        new IWADManager("assets/IWAD/DOOM2.WAD");
    }

    /**
     * Tests, whether IWADInfo for DOOM2 has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoDoom2Created() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/DOOM2.WAD");
        assertTrue(iwm.getIWADInfo() instanceof Doom2IWADInfo);
    }

    /**
     * Tests, whether IWADInfo for DOOM2 BFG Edition has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoDoom2BfgCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/DOOM2BFG.WAD");
        assertTrue(iwm.getIWADInfo() instanceof Doom2BfgIWADInfo);
    }

    /**
     * Tests, whether IWADInfo for DOOM Plutonia has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoDoomPlutoniaCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/PLUTONIA.WAD");
        assertTrue(iwm.getIWADInfo() instanceof PlutoniaIWADInfo);
    }

    /**
     * Tests, whether IWADInfo for DOOM TNT has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoDoomTNTCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/TNT.WAD");
        assertTrue(iwm.getIWADInfo() instanceof TNTIWADInfo);
    }

    /**
     * Tests, whether IWADInfo for DOOM Shareware has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoDoomSharewareCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/DOOM1.WAD");
        assertTrue(iwm.getIWADInfo() instanceof DoomSharewareIWADInfo);
    }

    /**
     * Tests, whether IWADInfo for The Ultimate DOOM has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoUltimateDoomCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/DOOM.WAD");
        assertTrue(iwm.getIWADInfo() instanceof UltimateDoomIWADInfo);
    }

    /**
     * Tests, whether IWADInfo for Freedoom - Phase 1 has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoFreedoom1Created() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/freedoom1.wad");
        assertTrue(iwm.getIWADInfo() instanceof Freedoom1IWADInfo);
    }

    /**
     * Tests, whether IWADInfo for Freedoom - Phase 2 has been found.
     * @throws Exception
     */
    @Test
    public void testIWADInfoFreedoom2Created() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/freedoom2.wad");
        assertTrue(iwm.getIWADInfo() instanceof Freedoom2IWADInfo);
    }
}