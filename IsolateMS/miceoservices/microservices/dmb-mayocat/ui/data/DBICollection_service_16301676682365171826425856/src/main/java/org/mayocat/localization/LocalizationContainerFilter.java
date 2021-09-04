/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.localization;

import java.net.URI;
import java.util.Locale;
import javax.ws.rs.core.UriBuilder;
import org.mayocat.application.AbstractService;
import org.mayocat.context.WebContext;
import org.mayocat.util.Utils;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Localization container filter that strips out the language tag if present in the URI before its passed to jersey
 * resources.
 *
 * FIXME: this should be in the localization module but there's a dependency on AbstractService that would introduce
 * a cyclic dependency chain. The proper way to resolve this would be to introduce a component that can resolves if a
 * certain path is an static path, or API path or Web path...
 *
 * @version $Id: aaffaa969b576e0f30bce514514584ae83da0156 $
 */
public class LocalizationContainerFilter implements ContainerRequestFilter {

    @Override
    public ContainerRequest filter(ContainerRequest containerRequest) {
        return (ContainerRequest) null;
    }

    private boolean isStaticPath(String path) {
        return (Boolean) null;
    }

    public int id = 0;

    public static LocalizationContainerFilter getObject(int id) {
        LocalizationContainerFilter obj = (LocalizationContainerFilter) new Object();
        obj.id = id;
        return obj;
    }
}

