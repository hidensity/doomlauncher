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
 * MapInfoEntry.java
 *
 * Class, containing single MAPINFO entry.
 *
 * Created by: dennis 2015/10/23
 */

package org.dbb.doom;

public class MapInfoEntry {

    /**
     * Internal key for the map (MAP01, E1M4, etc.).
     */
    private String mapKey;

    /**
     * The map's name.
     */
    private String mapName;

    /**
     * Does map's name come from an externalDefinition language lump?
     */
    private boolean externalDefinition;

    /**
     * Creates a new MapInfoEntry instance.
     * @param mapKey String with internal map's key.
     * @param mapName String with map's name.
     * @param external boolean, specifying name comes from external language lump.
     */
    public MapInfoEntry(String mapKey, String mapName, boolean external) {
        this.mapKey = mapKey;
        this.mapName = mapName;
        this.externalDefinition = external;
    }

    /**
     * Sets the map's name.
     * @param mapName String with map's name.
     */
    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * Gets the internal map's key.
      * @return String
     */
    public String getMapKey() {
        return this.mapKey;
    }

    /**
     * Gets the map's name.
     * @return String.
     */
    public String getMapName() {
        return this.mapName;
    }

    /**
     * Gets, whether the name comes from external language lump.
     * @return boolean
     */
    public boolean getExternalDefinition() {
        return this.externalDefinition;
    }
}
