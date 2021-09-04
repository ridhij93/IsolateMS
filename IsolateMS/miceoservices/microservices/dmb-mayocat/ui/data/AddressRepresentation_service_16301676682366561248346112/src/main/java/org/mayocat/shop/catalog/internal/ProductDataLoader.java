/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.internal;

import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import org.mayocat.entity.DataLoaderAssistant;
import org.mayocat.entity.EntityData;
import org.mayocat.entity.LoadingOption;
import org.mayocat.model.Entity;
import org.mayocat.shop.catalog.ProductLoadingOptions;
import org.mayocat.shop.catalog.model.Feature;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.store.ProductStore;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 659c2d56dd3079c29bfa3d3f3976a8e754df8a40 $
 */
@Component("products")
public class ProductDataLoader implements DataLoaderAssistant {

    @Override
    public <E extends Entity> void load(EntityData<E> entity, LoadingOption... options) {
        return;
    }

    @Override
    public <E extends Entity> void loadList(List<EntityData<E>> entities, LoadingOption... options) {
        return;
    }

    @Override
    public Integer priority() {
        return (Integer) null;
    }

    public void setProductStore(ProductStore productStore) {
        return;
    }

    public ProductStore getProductStore() {
        return (ProductStore) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static ProductDataLoader getObject(int id) {
        ProductDataLoader obj = (ProductDataLoader) new Object();
        obj.id = id;
        return obj;
    }
}

