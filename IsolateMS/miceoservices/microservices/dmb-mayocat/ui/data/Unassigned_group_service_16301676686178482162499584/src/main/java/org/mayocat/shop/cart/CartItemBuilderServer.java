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

/**
 * @version $Id: c29c999cdd6b481edd28ceeb1e179a8c0b5cf7be $
 */
public class CartItemBuilderServer {

    private Tenant tenant;

    private Taxable item;

    private Long quantity;

    private PriceWithTaxes unitPrice;

    public CartItemBuilder tenant(Tenant tenant) {
        this.tenant = tenant;
        return this;
    }

    public CartItemBuilder item(Taxable item) {
        this.item = item;
        return this;
    }

    public CartItemBuilder quantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public CartItemBuilder unitPrice(PriceWithTaxes unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public CartItem build() {
        return new CartItem(tenant, item, quantity, unitPrice);
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setItem(Taxable item) {
        this.item = item;
    }

    public Taxable getItem() {
        return item;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setUnitPrice(PriceWithTaxes unitPrice) {
        this.unitPrice = unitPrice;
    }

    public PriceWithTaxes getUnitPrice() {
        return unitPrice;
    }
}

