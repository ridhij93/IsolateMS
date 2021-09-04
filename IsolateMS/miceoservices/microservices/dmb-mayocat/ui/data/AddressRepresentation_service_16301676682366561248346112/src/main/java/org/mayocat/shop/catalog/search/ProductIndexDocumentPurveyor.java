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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 9bcf0394a17a119d44146a0aa21520975256c042 $
 */
@Component
public class ProductIndexDocumentPurveyor extends AbstractGenericEntityIndexDocumentPurveyor<Product> implements EntityIndexDocumentPurveyor<Product> {

    public Class forClass() {
        return (Class) null;
    }

    public Map<String, Object> purveyDocument(Product entity, Tenant tenant) {
        return (Map<String, Object>) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public void setCollectionStore(CollectionStore collectionStore) {
        return;
    }

    public CollectionStore getCollectionStore() {
        return (CollectionStore) null;
    }

    public int id = 0;

    public static ProductIndexDocumentPurveyor getObject(int id) {
        ProductIndexDocumentPurveyor obj = (ProductIndexDocumentPurveyor) new Object();
        obj.id = id;
        return obj;
    }
}

