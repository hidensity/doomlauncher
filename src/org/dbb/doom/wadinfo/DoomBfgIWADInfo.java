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
 * DoomBfgIWADInfo.java
 *
 * IWAD information for DOOM: BFG Edition.
 *
 * Created by: dennis 2015/10/19
 */

package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.DoomMapInfo;

import java.util.ArrayList;

public class DoomBfgIWADInfo extends IWADInfo {

    /**
     * Creates an IWADInfo instance for DOOM: BFG Edition.
     */
    public DoomBfgIWADInfo() {
        super();
        setName("DOOM: BFG Edition");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_COMPATSHORTTEX);
        setMapInfo(new DoomMapInfo());

        // DOOM: BFG Edition has same lump checks, as Ultimate DOOM and
        // some additional checks.
        ArrayList<String> mustContain = new ArrayList<>(new UltimateDoomIWADInfo().getMustContain());
        mustContain.add("DMENUPIC");
        mustContain.add("M_ACPT");
        mustContain.add("M_CAN");
        mustContain.add("M_EXITO");
        mustContain.add("M_CHG");
        setMustContain(mustContain);
    }
}
