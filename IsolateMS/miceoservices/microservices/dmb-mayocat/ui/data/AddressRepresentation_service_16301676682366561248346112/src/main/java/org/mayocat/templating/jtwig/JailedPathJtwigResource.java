/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.templating.jtwig;

import com.lyncode.jtwig.exception.ResourceException;
import com.lyncode.jtwig.resource.JtwigResource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Stack;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: cad90111ed1942a9fe5b9ae162229a5d79f25422 $
 */
public class JailedPathJtwigResource implements JtwigResource {

    public JailedPathJtwigResource(Path jail, Path resourcePath) {
        String uri = MicroserviceApplication.projectUri + "/ms2/jailedpathjtwigresource/jailedpathjtwigresource?callerId=" + this.id + "&jailId=jail.id&resourcePathId=resourcePath.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public InputStream retrieve() throws ResourceException {
        return (InputStream) null;
    }

    @Override
    public JtwigResource resolve(String relativePath) throws ResourceException {
        return (JtwigResource) null;
    }

    public void setJail(Path jail) {
        return;
    }

    public Path getJail() {
        return (Path) null;
    }

    public void setResourcePath(Path resourcePath) {
        return;
    }

    public Path getResourcePath() {
        return (Path) null;
    }

    public int id = 0;

    public static JailedPathJtwigResource getObject(int id) {
        JailedPathJtwigResource obj = (JailedPathJtwigResource) new Object();
        obj.id = id;
        return obj;
    }
}

