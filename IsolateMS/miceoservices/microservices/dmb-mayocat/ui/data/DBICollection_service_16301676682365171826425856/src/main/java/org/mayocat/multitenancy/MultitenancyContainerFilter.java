/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.multitenancy;

import java.net.URI;
import javax.ws.rs.core.UriBuilder;
import org.mayocat.context.WebContext;
import org.mayocat.util.Utils;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 5e4584f4348fc98596b1b9eefb13c1ed5f86b14a $
 */
public class MultitenancyContainerFilter implements ContainerRequestFilter {

    @Override
    public ContainerRequest filter(ContainerRequest request) {
        return (ContainerRequest) null;
    }

    public int id = 0;

    public static MultitenancyContainerFilter getObject(int id) {
        MultitenancyContainerFilter obj = (MultitenancyContainerFilter) new Object();
        obj.id = id;
        return obj;
    }
}

