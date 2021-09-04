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

/**
 * @version $Id: 572deeba8d8896917576c6d6c622d13cadd1d5cb $
 *
 *          TODO: merge product stores and have this in the catalog module
 */
@Component("product")
public class MarketplaceProductEntityLoaderServer implements EntityLoader {

    @Inject
    private Provider<ProductStore> productStore;

    @Inject
    private Provider<MarketplaceProductStore> marketplaceProductStore;

    public <E extends Entity> E load(String slug) {
        return (E) productStore.get().findBySlug(slug);
    }

    public <E extends Entity> E load(String slug, String tenantSlug) {
        return (E) marketplaceProductStore.get().findBySlugAndTenant(slug, tenantSlug);
    }

    public void setProductStore(Provider<ProductStore> productStore) {
        this.productStore = productStore;
    }

    public Provider<ProductStore> getProductStore() {
        return productStore;
    }

    public void setMarketplaceProductStore(Provider<MarketplaceProductStore> marketplaceProductStore) {
        this.marketplaceProductStore = marketplaceProductStore;
    }

    public Provider<MarketplaceProductStore> getMarketplaceProductStore() {
        return marketplaceProductStore;
    }
}

