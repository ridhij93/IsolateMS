/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.jersey;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Jersey container filter that copies over the X-Mayocat-Full-Context flag header from the request to the response
 * when it is present.
 *
 * @version $Id: e2337fe2e7d9b60d1199ef991fd72540e7138539 $
 */
public class MayocatFullContextRequestFilter implements ContainerResponseFilter {

    public ContainerResponse filter(ContainerRequest request, ContainerResponse response) {
        return (ContainerResponse) null;
    }

    public int id = 0;

    public static MayocatFullContextRequestFilter getObject(int id) {
        MayocatFullContextRequestFilter obj = (MayocatFullContextRequestFilter) new Object();
        obj.id = id;
        return obj;
    }
}

