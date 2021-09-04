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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 4cac251b085ba16dae8d5d5319e5b10a15c9d7ba $
 */
public class DefaultFileManager implements FileManager {

    @Override
    public Path resolvePermanentFilePath(Path path) {
        return (Path) null;
    }

    public void setFilesSettings(FilesSettings filesSettings) {
        return;
    }

    public FilesSettings getFilesSettings() {
        return (FilesSettings) null;
    }

    public int id = 0;

    public static DefaultFileManager getObject(int id) {
        DefaultFileManager obj = (DefaultFileManager) new Object();
        obj.id = id;
        return obj;
    }
}

