package org.dbb.doom.exceptions;

/**
 * Exception for invalid WAD files.
 *
 * Created by dennis on 21.10.15.
 */
public class InvalidWADException extends Exception {

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
