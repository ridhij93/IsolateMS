/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.api.resource;

import java.util.Map;
import java.util.UUID;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.mayocat.authorization.annotation.Authorized;
import org.mayocat.context.WebContext;
import org.mayocat.rest.Resource;
import org.mayocat.rest.annotation.ExistingTenant;
import org.mayocat.store.rdbms.dbi.DBIProvider;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import com.google.common.collect.Maps;
import mayoapp.dao.TurnoverStatsDAO;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: a0c24f8585e2c37f99f59b9c5d73916e30241651 $
 */
@Component("/tenant/{tenant}/api/billing/stats")
@Path("/tenant/{tenant}/api/billing/stats")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ExistingTenant
public class TurnoverStatsResource implements Resource, Initializable {

    @GET
    @Authorized
    public Response getStats() {
        return (Response) null;
    }

    @Override
    public void initialize() throws InitializationException {
        return;
    }

    public void setDbi(DBIProvider dbi) {
        return;
    }

    public DBIProvider getDbi() {
        return (DBIProvider) null;
    }

    public void setWebContext(WebContext webContext) {
        return;
    }

    public WebContext getWebContext() {
        return (WebContext) null;
    }

    public void setStatsDAO(TurnoverStatsDAO statsDAO) {
        return;
    }

    public TurnoverStatsDAO getStatsDAO() {
        return (TurnoverStatsDAO) null;
    }

    public int id = 0;

    public static TurnoverStatsResource getObject(int id) {
        TurnoverStatsResource obj = (TurnoverStatsResource) new Object();
        obj.id = id;
        return obj;
    }
}

