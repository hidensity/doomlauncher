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
 * GameCompatibility.java
 *
 * Game compatibility constants.
 *
 * Created by: dennis 2015/10/19
 */

package org.dbb.doom;

public class GameCompatibility {

    public static final int GI_NONE = 0x00000000;
    public static final int GI_MAPxx = 0x00000001;
    public static final int GI_SHAREWARE = 0x00000002;
    public static final int GI_MENUHACK_EXTENDED = 0x00000004;      // Heretic.
    public static final int GI_TEASER2 = 0x00000008;                // Alternative Strife 2 teaser.
    public static final int GI_COMPATSHORTTEX = 0x00000010;         // Always force COMPAT_SHORTTEX for IWAD maps.
    public static final int GI_COMPATSTAIRS = 0x00000020;           // Same for stair building.
    public static final int GI_COMPATPOLY1 = 0x00000040;            // Hexen's MAP36 needs old polyobject drawing.
    public static final int GI_COMPATPOLY2 = 0x00000080;            // So does HEXDD's MAP47.
    public static final int GI_NOTEXTCOLOR = 0x00000100;            // Chex Quest 3 would have everything green.
}
