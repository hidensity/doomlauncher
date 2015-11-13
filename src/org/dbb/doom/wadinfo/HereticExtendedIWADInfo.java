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
 * HereticExtendedIWADInfo.java
 *
 * IWAD information for Heretic: Shadow of the Serpent Riders.
 *
 * Created by: dennis 2015/10/20
 */

package org.dbb.doom.wadinfo;

import org.dbb.doom.GameCompatibility;
import org.dbb.doom.GameType;
import org.dbb.doom.IWADInfo;
import org.dbb.doom.MapInfo;
import org.dbb.doom.mapinfo.HereticMapInfo;

import java.util.ArrayList;
import java.util.List;

public class HereticExtendedIWADInfo extends IWADInfo {

    /**
     * List of lumps to identify IWAD as Heretic: Shadow of the Serpent Riders.
     */
    private static final List<String> mustContain;
    static {
        mustContain = new ArrayList<>();
        mustContain.add("E1M1");
        mustContain.add("E2M1");
        mustContain.add("TITLE");
        mustContain.add("MUS_E1M1");
    }

    /**
     * Creates an IWADInfo instance for Heretic: Shadow of the Serpent Riders.
     */
    public HereticExtendedIWADInfo() {
        super();
        setName("Heretic");
        setGameType(GameType.HERETIC);
        setCompatibility(GameCompatibility.GI_NONE);
        setMapInfo(new HereticMapInfo());
        setMustContain(HereticExtendedIWADInfo.mustContain);
    }
}
