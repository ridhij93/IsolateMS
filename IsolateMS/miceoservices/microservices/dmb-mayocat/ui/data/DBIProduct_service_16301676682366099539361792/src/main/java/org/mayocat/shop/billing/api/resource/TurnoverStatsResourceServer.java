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

/**
 * @version $Id: a0c24f8585e2c37f99f59b9c5d73916e30241651 $
 */
@Component("/tenant/{tenant}/api/billing/stats")
@Path("/tenant/{tenant}/api/billing/stats")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ExistingTenant
public class TurnoverStatsResourceServer implements Resource, Initializable {

    @Inject
    private DBIProvider dbi;

    @Inject
    private WebContext webContext;

    private TurnoverStatsDAO statsDAO;

    @GET
    @Authorized
    public Response getStats() {
        Map<String, Object> stats = Maps.newHashMap();
        UUID tenantId = webContext.getTenant() != null ? webContext.getTenant().getId() : null;
        stats.put("daily", statsDAO.daily(tenantId));
        stats.put("weekly", statsDAO.weekly(tenantId));
        stats.put("monthly", statsDAO.monthly(tenantId));
        stats.put("forever", statsDAO.forever(tenantId));
        return Response.ok(stats).build();
    }

    @Override
    public void initialize() throws InitializationException {
        this.statsDAO = dbi.get().onDemand(TurnoverStatsDAO.class);
    }

    public void setDbi(DBIProvider dbi) {
        this.dbi = dbi;
    }

    public DBIProvider getDbi() {
        return dbi;
    }

    public void setWebContext(WebContext webContext) {
        this.webContext = webContext;
    }

    public WebContext getWebContext() {
        return webContext;
    }

    public void setStatsDAO(TurnoverStatsDAO statsDAO) {
        this.statsDAO = statsDAO;
    }

    public TurnoverStatsDAO getStatsDAO() {
        return statsDAO;
    }
}

