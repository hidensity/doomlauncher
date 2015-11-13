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
 * DoomIWADInfo.java
 *
 * IWAD information for DOOM (Registered).
 *
 * Created by: dennis 2015/10/19
 */

package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.DoomMapInfo;

import java.util.ArrayList;
import java.util.List;

public class DoomIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as DOOM (Registered).
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("E1M1");
        mustContain.add("E2M1");
        mustContain.add("E2M2");
        mustContain.add("E2M3");
        mustContain.add("E2M4");
        mustContain.add("E2M5");
        mustContain.add("E2M6");
        mustContain.add("E2M7");
        mustContain.add("E2M8");
        mustContain.add("E2M9");
        mustContain.add("E3M1");
        mustContain.add("E3M2");
        mustContain.add("E3M3");
        mustContain.add("E3M4");
        mustContain.add("E3M5");
        mustContain.add("E3M6");
        mustContain.add("E3M7");
        mustContain.add("E3M8");
        mustContain.add("E3M9");
        mustContain.add("DPHOOF");
        mustContain.add("BFGGA0");
        mustContain.add("HEADA1");
        mustContain.add("CYBRA1");
        mustContain.add("SPIDA1D1");
    }

    /**
     * Creates an IWADInfo instance for DOOM (Registered).
     */
    public DoomIWADInfo() {
        super();
        setName("DOOM (Registered)");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_COMPATSHORTTEX);
        setMapInfo(new DoomMapInfo());
        setMustContain(DoomIWADInfo.mustContain);
    }
}
