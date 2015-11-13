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
 * Chex3IWADInfo.java
 *
 * IWAD information for Chex(R) Quest 3.
 *
 * Created by: dennis 2015/10/20
 */

package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.Chex3MapInfo;

import java.util.ArrayList;
import java.util.List;

public class Chex3IWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Chex(R) Quest 3.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("E1M1");
        mustContain.add("CYCLA1");
        mustContain.add("FLMBA1");
        mustContain.add("MAPINFO");
    }

    /**
     * Creates an IWADInfo instance for Chex(R) Quest 3.
     */
    public Chex3IWADInfo() {
        super();
        setName("Chex(R) Quest 3");
        setGameType(GameType.CHEX);
        setCompatibility(GameCompatibility.GI_NOTEXTCOLOR);
        setMapInfo(new Chex3MapInfo());
        setMustContain(Chex3IWADInfo.mustContain);
    }
}
