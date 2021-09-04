/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.marketplace.store.jdbi;

import java.util.List;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.addons.store.dbi.AddonsHelper;
import org.mayocat.context.WebContext;
import org.mayocat.model.AddonGroup;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.marketplace.model.EntityAndTenant;
import org.mayocat.shop.marketplace.store.MarketplaceProductStore;
import org.mayocat.store.rdbms.dbi.DBIProvider;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import mayoapp.dao.MarketplaceProductDAO;
import mayoapp.dao.TenantDAO;
import static org.mayocat.addons.util.AddonUtils.asMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: aa1e1a93d0b667d49f87d2c080948990c60d4e19 $
 */
@Component(hints = { "jdbi", "default" })
public class DBIMarketplaceProductStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DBIMarketplaceProductStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "dbimarketplaceproductstore")
    public  @ResponseBody int DBIMarketplaceProductStore() {
        DBIMarketplaceProductStoreServer newServerObj = new DBIMarketplaceProductStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

