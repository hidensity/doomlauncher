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
 * Freedoom1IWADInfo.java
 *
 * IWAD information for Freedom - Phase 1.
 *
 * Created by: dennis 2015/10/19
 */

package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.Freedoom1MapInfo;

import java.util.ArrayList;
import java.util.List;

public class Freedoom1IWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Freedom - Phase 1.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("E1M1");
        mustContain.add("E2M1");
        mustContain.add("E3M1");
        mustContain.add("FREEDOOM");
    }

    /**
     * Creates an IWADInfo instance for Freedom - Phase 1.
     */
    public Freedoom1IWADInfo() {
        super();
        setName("Freedom - Phase 1");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_NONE);
        setMapInfo(new Freedoom1MapInfo());
        setMustContain(Freedoom1IWADInfo.mustContain);
    }
}
