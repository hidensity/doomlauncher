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
 * UltimateDoomIWADInfo.java
 *
 * IWAD information for Ultimate DOOM.
 *
 * Created by: dennis 2015/10/19
 */

package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.mapinfo.DoomMapInfo;

import java.util.ArrayList;

public class UltimateDoomIWADInfo extends IWADInfo {

    /**
     * Creates an IWADInfo instance for Ultimate DOOM.
     */
    public UltimateDoomIWADInfo() {
        super();
        setName("The Ultimate DOOM");
        setGameType(GameType.DOOM);
        setCompatibility(GameCompatibility.GI_COMPATSHORTTEX);
        setMapInfo(new DoomMapInfo());

        // Ultimate DOOM has same lump checks, as DOOM and
        // an additional check for E4M2.
        ArrayList<String> mustContain = new ArrayList<>(new DoomIWADInfo().getMustContain());
        mustContain.add("E4M2");
        setMustContain(mustContain);
    }
}
