/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.rest.resource;

import java.io.IOException;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.mayocat.rest.Resource;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: b66c74c41d294f0e5285e861db2fb13b6097bacf $
 */
@Component("/api/shipping/destinations/")
@Path("/api/shipping/destinations/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DestinationsResource implements Resource {

    @GET
    public Response getDestinations() {
        return (Response) null;
    }

    @GET
    @Path("flat")
    public Response getDestinationsFlat() {
        return (Response) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static DestinationsResource getObject(int id) {
        DestinationsResource obj = (DestinationsResource) new Object();
        obj.id = id;
        return obj;
    }
}

