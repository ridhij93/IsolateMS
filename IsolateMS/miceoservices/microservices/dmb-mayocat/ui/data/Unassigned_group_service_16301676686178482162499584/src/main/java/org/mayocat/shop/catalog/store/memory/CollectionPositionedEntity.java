/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.store.memory;

import java.util.ArrayList;
import java.util.List;
import org.mayocat.shop.catalog.model.Collection;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.store.memory.DefaultPositionedEntity;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Collection entity for memory store.
 *
 * @version $Id: 2fe1bedaaa7155bc4eb63d052d39ddeaae17b089 $
 */
public class CollectionPositionedEntity extends DefaultPositionedEntity<Collection> {

    public CollectionPositionedEntity(Collection entity, Integer position, List<Product> products) {
        String uri = MicroserviceApplication.projectUri + "/ms5/collectionpositionedentity/collectionpositionedentity?callerId=" + this.id + "&entityId=entity.id&position=position&productsId=products.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public List<Product> getProducts() {
        return (List<Product>) null;
    }

    public void setProducts(List<Product> products) {
        return;
    }

    public int id = 0;

    public static CollectionPositionedEntity getObject(int id) {
        CollectionPositionedEntity obj = (CollectionPositionedEntity) new Object();
        obj.id = id;
        return obj;
    }
}

