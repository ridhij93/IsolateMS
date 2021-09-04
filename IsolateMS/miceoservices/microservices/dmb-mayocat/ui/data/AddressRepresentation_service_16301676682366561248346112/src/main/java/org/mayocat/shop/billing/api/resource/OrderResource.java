/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.api.resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.joda.time.DateTimeZone;
import org.mayocat.authorization.annotation.Authorized;
import org.mayocat.configuration.ConfigurationService;
import org.mayocat.configuration.general.GeneralSettings;
import org.mayocat.rest.Resource;
import org.mayocat.rest.annotation.ExistingTenant;
import org.mayocat.rest.representations.ResultSetRepresentation;
import org.mayocat.shop.billing.api.representation.OrderRepresentation;
import org.mayocat.shop.billing.model.Order;
import org.mayocat.shop.billing.store.OrderStore;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 0f4234671b5cf00ac20c2575620b3f73a0760fd4 $
 */
@Component("/tenant/{tenant}/api/orders")
@Path("/tenant/{tenant}/api/orders")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ExistingTenant
public class OrderResource implements Resource {

    @GET
    @Authorized
    public ResultSetRepresentation<OrderRepresentation> getAllOrders(@QueryParam("number") @DefaultValue("50") Integer number, @QueryParam("offset") @DefaultValue("0") Integer offset) {
        return (ResultSetRepresentation<OrderRepresentation>) null;
    }

    @GET
    @Path("{slug}")
    @Authorized
    public Response getOrder(@PathParam("slug") String slug) {
        return (Response) null;
    }

    @Path("{slug}")
    @POST
    @Authorized
    public // Partial update : NOT idempotent
    Response updateOrder(@PathParam("slug") String slug, OrderRepresentation updatedOrderRepresentation) {
        return (Response) null;
    }

    public void setOrderStore(Provider<OrderStore> orderStore) {
        return;
    }

    public Provider<OrderStore> getOrderStore() {
        return (Provider<OrderStore>) null;
    }

    public void setConfigurationService(ConfigurationService configurationService) {
        return;
    }

    public ConfigurationService getConfigurationService() {
        return (ConfigurationService) null;
    }

    public int id = 0;

    public static OrderResource getObject(int id) {
        OrderResource obj = (OrderResource) new Object();
        obj.id = id;
        return obj;
    }
}

