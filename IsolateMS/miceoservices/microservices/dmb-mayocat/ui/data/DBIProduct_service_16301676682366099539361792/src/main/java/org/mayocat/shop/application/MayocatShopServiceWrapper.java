/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.application;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.jdbi.bundles.DBIExceptionsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.mayocat.application.AbstractService;
import org.mayocat.cms.home.HomePageModule;
import org.mayocat.cms.news.NewsModule;
import org.mayocat.cms.pages.PagesModule;
import org.mayocat.flyway.FlywayBundle;
import org.mayocat.shop.catalog.CatalogModule;
import org.mayocat.shop.catalog.configuration.jackson.MoneyModule;
import org.mayocat.shop.configuration.MayocatShopSettings;
import org.mayocat.shop.customer.CustomerModule;
import org.mayocat.store.rdbms.dbi.DBIProvider;
import org.mayocat.store.rdbms.dbi.argument.PostgresUUIDArgumentFactory;
import org.mayocat.store.rdbms.dbi.argument.PostgresUUIDArrayArgumentFactory;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.logging.PrintStreamLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xwiki.component.descriptor.DefaultComponentDescriptor;
import org.xwiki.component.manager.ComponentRepositoryException;
import static com.codahale.metrics.MetricRegistry.name;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ms1/mayocatshopservice/")
public class MayocatShopServiceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MayocatShopServiceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "mayocatshopservice")
    public  @ResponseBody int MayocatShopService() {
        MayocatShopServiceServer newServerObj = new MayocatShopServiceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

