package org.dbb.doom;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Testing of the ZipManager class.
 *
 * Created by dennis on 21.10.15.
 */
public class ZipManagerTest {

    /**
     * Tests creating an ZipManager instance with a null value as file name.
     * @throws Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void testInstancingNull() throws Exception {
        new ZipManager(null);
    }

    /**
     * Tests creating an ZipManager instance with a non existing file.
     * @throws Exception
     */
    @Test(expected = IOException.class)
    public void testInstancingFileNotExists() throws Exception {
        new IWADManager("assets/pk3/nonExisting.file");
    }

    /**
     * Tests creating an ZipManager instance with a directory given.
     * @throws Exception
     */
    @Test(expected = IOException.class)
    public void testInstancingWithDirectory() throws Exception {
        new IWADManager("assets/pk3/");
    }

}