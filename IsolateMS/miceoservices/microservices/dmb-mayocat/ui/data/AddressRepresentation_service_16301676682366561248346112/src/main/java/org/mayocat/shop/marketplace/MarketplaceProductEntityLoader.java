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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 572deeba8d8896917576c6d6c622d13cadd1d5cb $
 *
 *          TODO: merge product stores and have this in the catalog module
 */
@Component("product")
public class MarketplaceProductEntityLoader implements EntityLoader {

    public <E extends Entity> E load(String slug) {
        return (E) null;
    }

    public <E extends Entity> E load(String slug, String tenantSlug) {
        return (E) null;
    }

    public void setProductStore(Provider<ProductStore> productStore) {
        return;
    }

    public Provider<ProductStore> getProductStore() {
        return (Provider<ProductStore>) null;
    }

    public void setMarketplaceProductStore(Provider<MarketplaceProductStore> marketplaceProductStore) {
        return;
    }

    public Provider<MarketplaceProductStore> getMarketplaceProductStore() {
        return (Provider<MarketplaceProductStore>) null;
    }

    public int id = 0;

    public static MarketplaceProductEntityLoader getObject(int id) {
        MarketplaceProductEntityLoader obj = (MarketplaceProductEntityLoader) new Object();
        obj.id = id;
        return obj;
    }
}

