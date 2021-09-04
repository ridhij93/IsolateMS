/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart;

import java.math.BigDecimal;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.shop.catalog.model.Purchasable;
import org.mayocat.shop.taxes.PriceWithTaxes;
import com.google.common.base.Preconditions;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * An immutable cart item, with its associated prices : unit price and total price, with applied taxes information.
 *
 * @version $Id: 0b4fca5b7171efb0cc661500546c73deb634da82 $
 */
public class CartItem {

    public CartItem(Tenant tenant, Purchasable item, Long quantity, PriceWithTaxes unitPrice) {
        String uri = MicroserviceApplication.projectUri + "/ms2/cartitem/cartitem?callerId=" + this.id + "&tenantId=tenant.id&itemId=item.id&quantity=quantity&unitPriceId=unitPrice.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Tenant tenant() {
        return (Tenant) null;
    }

    public Purchasable item() {
        return (Purchasable) null;
    }

    public Long quantity() {
        return (Long) null;
    }

    public PriceWithTaxes unitPrice() {
        return (PriceWithTaxes) null;
    }

    public PriceWithTaxes total() {
        return (PriceWithTaxes) null;
    }

    public Tenant getTenant() {
        return (Tenant) null;
    }

    public Purchasable getItem() {
        return (Purchasable) null;
    }

    public Long getQuantity() {
        return (Long) null;
    }

    public PriceWithTaxes getUnitPrice() {
        return (PriceWithTaxes) null;
    }

    public PriceWithTaxes getTotal() {
        return (PriceWithTaxes) null;
    }

    public int id = 0;

    public static CartItem getObject(int id) {
        CartItem obj = (CartItem) new Object();
        obj.id = id;
        return obj;
    }
}

