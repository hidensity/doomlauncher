package org.dbb.doom;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

/**
 * Testing of the IWADManager class.
 *
 * Created by dbarzen on 16.10.15.
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
    public void testIWADInfoCreated() throws Exception {
        IWADManager iwm = new IWADManager("assets/IWAD/DOOM2.WAD");
        assertNotNull(iwm.getIwadInfo().getName().contains("DOOM2"));
    }
}