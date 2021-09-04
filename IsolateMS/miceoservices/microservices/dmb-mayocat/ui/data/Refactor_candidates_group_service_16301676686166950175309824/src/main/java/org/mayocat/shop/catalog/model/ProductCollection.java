/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.model;

import java.util.UUID;
import com.google.common.base.Objects;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Bridges a product to a collection
 *
 * @version $Id: dc911a819d838c9363edddda6b612b1e3184e556 $
 */
public class ProductCollection {

    public ProductCollection(UUID productId, UUID collectionId) {
        String uri = MicroserviceApplication.projectUri + "/ms1/productcollection/productcollection?callerId=" + this.id + "&productIdId=productId.id&collectionIdId=collectionId.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public UUID getProductId() {
        String uri = MicroserviceApplication.projectUri + "/ms1/productcollection/getproductidcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    public UUID getCollectionId() {
        String uri = MicroserviceApplication.projectUri + "/ms1/productcollection/getcollectionidcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    public boolean equals(Object obj) {
        return (Boolean) null;
    }

    @Override
    public int hashCode() {
        return (Integer) null;
    }

    @Override
    public String toString() {
        return (String) null;
    }

    public void setProductId(UUID productId) {
        return;
    }

    public void setCollectionId(UUID collectionId) {
        return;
    }

    public int id = 0;

    public static ProductCollection getObject(int id) {
        ProductCollection obj = (ProductCollection) new Object();
        obj.id = id;
        return obj;
    }
}

