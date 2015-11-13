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
 * GameType.java
 *
 * Game type constants.
 *
 * Created by: dennis 2015/10/16
 */

package org.dbb.doom;

public enum GameType {

    ANY(0),
    DOOM(1),
    HERETIC(2),
    HEXEN(4),
    STRIFE(8),
    CHEX(16),
    RAVEN(HERETIC.getValue() | HEXEN.getValue()),
    DOOM_CHEX(DOOM.getValue() | CHEX.getValue()),
    STRIFE_CHEX(DOOM.getValue() | STRIFE.getValue() | CHEX.getValue());

    private final int value;

    GameType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
