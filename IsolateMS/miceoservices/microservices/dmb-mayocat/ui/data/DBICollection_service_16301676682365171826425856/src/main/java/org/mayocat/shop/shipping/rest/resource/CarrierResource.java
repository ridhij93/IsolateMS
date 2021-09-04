/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.rest.resource;

import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.mayocat.authorization.annotation.Authorized;
import org.mayocat.rest.Resource;
import org.mayocat.rest.annotation.ExistingTenant;
import org.mayocat.shop.shipping.Strategy;
import org.mayocat.shop.shipping.model.Carrier;
import org.mayocat.shop.shipping.store.CarrierStore;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: d1909129531e6aff773f0a894b598aabe232053d $
 */
@Component("/tenant/{tenant}/api/shipping/carrier/")
@Path("/tenant/{tenant}/api/shipping/carrier/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ExistingTenant
public class CarrierResource implements Resource {

    @GET
    public Response getCarriers(@QueryParam("strategy") String strategy) {
        return (Response) null;
    }

    @POST
    @Authorized
    public Response createCarrier(Carrier carrier) {
        return (Response) null;
    }

    @POST
    @Path("order")
    @Authorized
    public Response updatePositions(List<Carrier> carriers) {
        return (Response) null;
    }

    @PUT
    @Path("{id}")
    @Authorized
    public Response updateCarrier(@PathParam("id") String id, Carrier carrier) {
        return (Response) null;
    }

    @DELETE
    @Path("{id}")
    @Consumes(MediaType.WILDCARD)
    @Authorized
    public Response deleteCarrier(@PathParam("id") String id) {
        return (Response) null;
    }

    public void setCarrierStore(CarrierStore carrierStore) {
        return;
    }

    public CarrierStore getCarrierStore() {
        return (CarrierStore) null;
    }

    public int id = 0;

    public static CarrierResource getObject(int id) {
        CarrierResource obj = (CarrierResource) new Object();
        obj.id = id;
        return obj;
    }
}

