/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.theme;

import java.nio.file.Path;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 68b2ea3d0d0e2f8a20fe590ca717626081d1e240 $
 */
public class ThemeResource {

    public enum Type {

        CLASSPATH_RESOURCE, FILE
    }

    public ThemeResource(Type type, Path path) {
        String uri = MicroserviceApplication.projectUri + "/msnull/themeresource/themeresource?callerId=" + this.id + "&typeId=type.id&pathId=path.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Path getPath() {
        return (Path) null;
    }

    public Type getType() {
        return (Type) null;
    }

    public void setType(Type type) {
        return;
    }

    public void setPath(Path path) {
        return;
    }

    public int id = 0;

    public static ThemeResource getObject(int id) {
        ThemeResource obj = (ThemeResource) new Object();
        obj.id = id;
        return obj;
    }
}

