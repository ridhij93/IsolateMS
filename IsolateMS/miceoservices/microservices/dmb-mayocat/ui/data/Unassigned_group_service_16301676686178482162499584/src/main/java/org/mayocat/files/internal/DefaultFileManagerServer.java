/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.files.internal;

import java.nio.file.Path;
import javax.inject.Inject;
import org.mayocat.configuration.general.FilesSettings;
import org.mayocat.files.FileManager;

/**
 * @version $Id: 4cac251b085ba16dae8d5d5319e5b10a15c9d7ba $
 */
public class DefaultFileManagerServer implements FileManager {

    @Inject
    private FilesSettings filesSettings;

    @Override
    public Path resolvePermanentFilePath(Path path) {
        return filesSettings.getPermanentDirectory().resolve(path);
    }

    public void setFilesSettings(FilesSettings filesSettings) {
        this.filesSettings = filesSettings;
    }

    public FilesSettings getFilesSettings() {
        return filesSettings;
    }
}

