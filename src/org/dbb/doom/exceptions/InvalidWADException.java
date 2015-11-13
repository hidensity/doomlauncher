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
 * InvalidWADException.java
 *
 * Exception for invalid WAD files.
 *
 * Created by: dennis 2015/10/21
 */

package org.dbb.doom.exceptions;

public class InvalidWADException extends RuntimeException {

    /**
     * Creates a new InvalidWADException instance.
     * @param message Exception's message.
     */
    public InvalidWADException(String message) {
        super(message);
    }

    /**
     * Creates a new InvalidWADException instance.
     * @param cause Exception's cause.
     */
    public InvalidWADException(Throwable cause) {
        super(cause);
    }

    /**
     * Creates a new InvalidWADException instance.
     * @param message Exception's message.
     * @param cause Exception's cause.
     */
    public InvalidWADException(String message, Throwable cause) {
        super(message, cause);
    }
}
