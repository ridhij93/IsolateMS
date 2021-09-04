/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart;

import org.mayocat.accounts.model.Tenant;
import org.mayocat.shop.taxes.PriceWithTaxes;
import org.mayocat.shop.taxes.Taxable;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: c29c999cdd6b481edd28ceeb1e179a8c0b5cf7be $
 */
public class CartItemBuilder {

    public CartItemBuilder tenant(Tenant tenant) {
        return (CartItemBuilder) null;
    }

    public CartItemBuilder item(Taxable item) {
        return (CartItemBuilder) null;
    }

    public CartItemBuilder quantity(Long quantity) {
        return (CartItemBuilder) null;
    }

    public CartItemBuilder unitPrice(PriceWithTaxes unitPrice) {
        return (CartItemBuilder) null;
    }

    public CartItem build() {
        return (CartItem) null;
    }

    public void setTenant(Tenant tenant) {
        return;
    }

    public Tenant getTenant() {
        return (Tenant) null;
    }

    public void setItem(Taxable item) {
        return;
    }

    public Taxable getItem() {
        return (Taxable) null;
    }

    public void setQuantity(Long quantity) {
        return;
    }

    public Long getQuantity() {
        return (Long) null;
    }

    public void setUnitPrice(PriceWithTaxes unitPrice) {
        return;
    }

    public PriceWithTaxes getUnitPrice() {
        return (PriceWithTaxes) null;
    }

    public int id = 0;

    public static CartItemBuilder getObject(int id) {
        CartItemBuilder obj = (CartItemBuilder) new Object();
        obj.id = id;
        return obj;
    }
}

