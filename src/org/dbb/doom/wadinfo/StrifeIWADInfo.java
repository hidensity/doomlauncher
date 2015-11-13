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
 * StrifeIWADInfo.java
 *
 * IWAD information for Strife: Quest for the Sigil.
 *
 * Created by: dennis 2015/10/20
 */

package org.dbb.doom.wadinfo;

import org.dbb.doom.*;
import org.dbb.doom.mapinfo.StrifeMapInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StrifeIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Strife: Quest for the Sigil.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("MAP01");
        mustContain.add("MAP33");
        mustContain.add("ENDSTRF");
    }

    /**
     * Creates an IWADInfo instance for Strife: Quest for the Sigil.
     */
    public StrifeIWADInfo() {
        super();
        setName("Strife: Quest for the Sigil");
        setGameType(GameType.STRIFE);
        setCompatibility(GameCompatibility.GI_NONE);
        setMapInfo(new MapInfo(new StrifeMapInfo().getMapEntries("MAP(([0-2][\\d])|(3[0-1]))")));
        setMustContain(StrifeIWADInfo.mustContain);
    }
}
