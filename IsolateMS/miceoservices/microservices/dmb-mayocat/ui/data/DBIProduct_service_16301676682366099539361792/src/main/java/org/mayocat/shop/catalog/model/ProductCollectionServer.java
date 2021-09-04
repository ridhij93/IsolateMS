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

/**
 * Bridges a product to a collection
 *
 * @version $Id: dc911a819d838c9363edddda6b612b1e3184e556 $
 */
public class ProductCollectionServer {

    private UUID productId;

    private UUID collectionId;

    public ProductCollectionServer(UUID productId, UUID collectionId) {
        this.productId = productId;
        this.collectionId = collectionId;
    }

    public UUID getProductId() {
        return productId;
    }

    public UUID getCollectionId() {
        return collectionId;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductCollection other = (ProductCollection) obj;
        return Objects.equal(this.productId, other.getProductId()) && Objects.equal(this.collectionId, other.getCollectionId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.productId, this.collectionId);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).addValue(productId).addValue(collectionId).toString();
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public void setCollectionId(UUID collectionId) {
        this.collectionId = collectionId;
    }
}

