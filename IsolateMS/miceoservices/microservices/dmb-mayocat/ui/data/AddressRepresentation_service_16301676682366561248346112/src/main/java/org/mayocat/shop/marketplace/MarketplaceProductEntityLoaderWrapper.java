/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.marketplace;

import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.entity.EntityLoader;
import org.mayocat.model.Entity;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.store.ProductStore;
import org.mayocat.shop.marketplace.model.EntityAndTenant;
import org.mayocat.shop.marketplace.store.MarketplaceProductStore;
import org.xwiki.component.annotation.Component;
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
 * @version $Id: 572deeba8d8896917576c6d6c622d13cadd1d5cb $
 *
 *          TODO: merge product stores and have this in the catalog module
 */
@Component("product")
public class MarketplaceProductEntityLoaderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MarketplaceProductEntityLoaderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "marketplaceproductentityloader")
    public  @ResponseBody int MarketplaceProductEntityLoader() {
        MarketplaceProductEntityLoaderServer newServerObj = new MarketplaceProductEntityLoaderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

