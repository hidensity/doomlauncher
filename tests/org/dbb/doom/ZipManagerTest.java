/*******************************************************************************
 * Copyright (c) 2015 HiDensity. All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 * *****************************************************************************
 *
 * ZipManagerTest.java
 *
 * Testing of the ZipManager class.
 *
 * Created by: dennis 2015/10/21
 */

package org.dbb.doom;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ZipManagerTest {

    /**
     * Tests creating a ZipManager instance with a null value as file name.
     * @throws Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void testInstancingNull() throws Exception {
        new ZipManager(null);
    }

    /**
     * Tests creating a ZipManager instance with a non existing file.
     * @throws Exception
     */
    @Test(expected = IOException.class)
    public void testInstancingFileNotExists() throws Exception {
        new IWADManager("assets/pk3/nonExisting.file");
    }

    /**
     * Tests creating a ZipManager instance with a directory given.
     * @throws Exception
     */
    @Test(expected = IOException.class)
    public void testInstancingWithDirectory() throws Exception {
        new IWADManager("assets/pk3/");
    }

    /**
     * Tests creating a ZipManager instance with a valid PK3 file.
     * @throws Exception
     */
    @Test
    public void testInstancingExistingFile() throws Exception {
        new ZipManager("assets/pk3/square1.pk3").destroy();
    }

}