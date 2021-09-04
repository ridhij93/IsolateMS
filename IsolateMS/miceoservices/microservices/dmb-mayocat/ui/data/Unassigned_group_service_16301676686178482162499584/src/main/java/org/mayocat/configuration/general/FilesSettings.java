/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.general;

import java.nio.file.Path;
import java.nio.file.Paths;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: a4557c77486f4be3053264a7d2f67223fb0f1d9f $
 */
public class FilesSettings {

    public Path getPermanentDirectory() {
        return (Path) null;
    }

    public Path getTemporaryDirectory() {
        return (Path) null;
    }

    public void setPermanentDirectory(Path permanentDirectory) {
        return;
    }

    public void setTemporaryDirectory(Path temporaryDirectory) {
        return;
    }

    public int id = 0;

    public static FilesSettings getObject(int id) {
        FilesSettings obj = (FilesSettings) new Object();
        obj.id = id;
        return obj;
    }
}

