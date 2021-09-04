/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.marketplace.search;

import java.io.PrintWriter;
import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.store.TenantStore;
import org.mayocat.search.SearchEngine;
import org.mayocat.shop.catalog.model.Collection;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.store.CollectionStore;
import org.mayocat.shop.catalog.store.ProductStore;
import org.mayocat.store.rdbms.dbi.DBIProvider;
import org.xwiki.component.annotation.Component;
import com.google.common.collect.ImmutableMultimap;
import io.dropwizard.servlets.tasks.Task;
import mayoapp.dao.CollectionDAO;
import mayoapp.dao.EntityDAO;
import mayoapp.dao.ProductDAO;
import mayoapp.dao.TenantDAO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Component("buildMarketplaceIndex")
public class BuildIndexTaskWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, BuildIndexTaskServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "buildindextask")
    public  @ResponseBody int BuildIndexTask() {
        BuildIndexTaskServer newServerObj = new BuildIndexTaskServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "buildindextask")
    public  @ResponseBody int BuildIndexTask(@RequestParam String name) {
        BuildIndexTaskServer newServerObj = new BuildIndexTaskServer(name);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

