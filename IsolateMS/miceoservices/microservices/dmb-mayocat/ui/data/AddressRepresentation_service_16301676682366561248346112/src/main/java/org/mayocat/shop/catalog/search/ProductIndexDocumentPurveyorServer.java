/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.search;

import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.search.EntityIndexDocumentPurveyor;
import org.mayocat.search.elasticsearch.AbstractGenericEntityIndexDocumentPurveyor;
import org.mayocat.shop.catalog.model.Collection;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.store.CollectionStore;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * @version $Id: 9bcf0394a17a119d44146a0aa21520975256c042 $
 */
@Component
public class ProductIndexDocumentPurveyorServer extends AbstractGenericEntityIndexDocumentPurveyor<Product> implements EntityIndexDocumentPurveyor<Product> {

    @Inject
    private Logger logger;

    @Inject
    private CollectionStore collectionStore;

    public Class forClass() {
        return Product.class;
    }

    public Map<String, Object> purveyDocument(Product entity, Tenant tenant) {
        Map<String, Object> source = Maps.newHashMap();
        source.put("site", extractSourceFromEntity(tenant, tenant));
        source.putAll(extractSourceFromEntity(entity, tenant));
        List<Collection> collections = collectionStore.findAllForProduct(entity);
        List<String> collectionsSource = Lists.newArrayList();
        for (Collection collection : collections) {
            collectionsSource.add(collection.getSlug());
        }
        source.put("collections", collectionsSource);
        return source;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setCollectionStore(CollectionStore collectionStore) {
        this.collectionStore = collectionStore;
    }

    public CollectionStore getCollectionStore() {
        return collectionStore;
    }
}

