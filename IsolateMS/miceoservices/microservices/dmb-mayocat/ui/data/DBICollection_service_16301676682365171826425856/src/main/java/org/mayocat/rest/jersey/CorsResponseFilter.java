/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.jersey;

import javax.ws.rs.core.Response;
import org.mayocat.rest.CorsSettings;
import org.mayocat.util.Utils;
import com.google.common.base.Strings;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 7783502b2d5f1a36203cbb93319dfa67deac406c $
 */
public class CorsResponseFilter implements ContainerResponseFilter {

    @Override
    public ContainerResponse filter(ContainerRequest containerRequest, ContainerResponse containerResponse) {
        return (ContainerResponse) null;
    }

    public int id = 0;

    public static CorsResponseFilter getObject(int id) {
        CorsResponseFilter obj = (CorsResponseFilter) new Object();
        obj.id = id;
        return obj;
    }
}

