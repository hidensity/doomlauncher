package org.dbb.doom;

import java.io.File;
import java.io.IOException;

/**
 * ZipManager
 * Class to retrieve a ZIP file's information, that is
 * used to act as a WAD container.
 *
 * Created by dennis on 21.10.15.
 */
public class ZipManager {

    /**
     * ZIP file name.
     */
    private String filename;

    /**
     * File handler.
     */
    private File file;

    /**
     * Creates a new ZipManager object.
     * @param filename Name of the ZipManager's instance file to use.
     * @throws IllegalArgumentException if an invalid Zip container has been specified.
     * @throws IOException if the file could not be read or is a directory.
     */
    public ZipManager(String filename) throws Exception {
        this.filename = filename;
        if (null == filename) {
            throw new IllegalArgumentException("Container file must not be null.");
        }

        // Check if the file exists.
        this.file = new File(filename);
        this.filename = this.file.getCanonicalPath();
        if (!this.file.exists() || this.file.isDirectory()) {
            throw new IOException("The specified container file was not found or is a directory (" + filename + ").");
        }
    }

    /**
     * Gets the container's file name.
     * @return String
     */
    public String getFilename() {
        return this.filename;
    }
}
