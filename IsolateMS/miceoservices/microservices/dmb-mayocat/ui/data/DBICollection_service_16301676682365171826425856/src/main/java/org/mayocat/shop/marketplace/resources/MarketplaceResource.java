/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.marketplace.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.mayocat.rest.Resource;
import org.mayocat.rest.representations.ResultSetRepresentation;
import org.mayocat.search.SearchEngine;
import org.mayocat.search.elasticsearch.ElasticSearchSearchEngine;
import org.mayocat.url.URLHelper;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: a597afc8ad59c183e70bf5b96200dfed3d9d3601 $
 */
@Path("/marketplace/api/")
@Component("/marketplace/api/")
public class MarketplaceResource implements Resource {

    @GET
    @Path("products")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProducts(@QueryParam("offset") @DefaultValue("0") Integer offset, @QueryParam("number") @DefaultValue("25") Integer number) {
        return (Response) null;
    }

    @GET
    @Path("shops")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getShop(@QueryParam("offset") @DefaultValue("0") Integer offset, @QueryParam("number") @DefaultValue("25") Integer number) {
        return (Response) null;
    }

    @GET
    @Path("shops/{shop}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getShop(@PathParam("shop") String shop) {
        return (Response) null;
    }

    @GET
    @Path("shops/{shop}/products")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getShopProducts(@PathParam("shop") String shop, @QueryParam("offset") @DefaultValue("0") Integer offset, @QueryParam("number") @DefaultValue("25") Integer number) {
        return (Response) null;
    }

    @GET
    @Path("shops/{shop}/collections/{collection}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCollection(@PathParam("shop") String shop, @PathParam("collection") String collection) {
        return (Response) null;
    }

    private ElasticSearchSearchEngine getSearchEngine() {
        return (ElasticSearchSearchEngine) null;
    }

    public void setUrlHelper(URLHelper urlHelper) {
        return;
    }

    public URLHelper getUrlHelper() {
        return (URLHelper) null;
    }

    public void setComponentManager(ComponentManager componentManager) {
        return;
    }

    public ComponentManager getComponentManager() {
        return (ComponentManager) null;
    }

    public void setSearchEngine(ElasticSearchSearchEngine searchEngine) {
        return;
    }

    public int id = 0;

    public static MarketplaceResource getObject(int id) {
        MarketplaceResource obj = (MarketplaceResource) new Object();
        obj.id = id;
        return obj;
    }
}

