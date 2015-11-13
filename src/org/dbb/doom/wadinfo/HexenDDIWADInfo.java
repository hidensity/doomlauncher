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
 * HexenDDIWADInfo.java
 *
 * IWAD information for Hexen: Deathkings of the Dark Citadel.
 *
 * Created by: dennis 2015/10/20
 */

package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.HexenDDMapInfo;

import java.util.ArrayList;
import java.util.List;

public class HexenDDIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Hexen: Deathkings of the Dark Citadel.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("TITLE");
        mustContain.add("MAP60");
        mustContain.add("CLUS1MSG");
    }

    /**
     * Creates an IWADInfo instance for Hexen: Deathkings of the Dark Citadel.
     */
    public HexenDDIWADInfo() {
        super();
        setName("Hexen: Deathkings of the Dark Citadel");
        setGameType(GameType.HEXEN);
        setCompatibility(GameCompatibility.GI_COMPATPOLY1 | GameCompatibility.GI_COMPATPOLY2);
        setMapInfo(new HexenDDMapInfo());
        setMustContain(HexenDDIWADInfo.mustContain);
    }
}
