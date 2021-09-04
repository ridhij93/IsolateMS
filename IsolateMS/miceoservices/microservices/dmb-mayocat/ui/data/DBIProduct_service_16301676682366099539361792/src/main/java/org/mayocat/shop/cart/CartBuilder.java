/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import org.mayocat.shop.shipping.ShippingOption;
import org.mayocat.shop.taxes.PriceWithTaxes;
import com.google.common.base.Optional;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 56a30c63eff9901522bdf709206574a76ca367be $
 */
public class CartBuilder {

    public CartBuilder currency(Currency currency) {
        return (CartBuilder) null;
    }

    public CartBuilder addItem(CartItem item) {
        return (CartBuilder) null;
    }

    public CartBuilder itemsTotal(PriceWithTaxes itemsTotal) {
        return (CartBuilder) null;
    }

    public CartBuilder selectedShippingOption(ShippingOption selectedShippingOption) {
        return (CartBuilder) null;
    }

    public CartBuilder selectedShippingOption(Optional<ShippingOption> selectedShippingOption) {
        return (CartBuilder) null;
    }

    public CartBuilder setShipping(PriceWithTaxes shipping) {
        return (CartBuilder) null;
    }

    public Cart build() {
        return (Cart) null;
    }

    public void setCurrency(Currency currency) {
        return;
    }

    public Currency getCurrency() {
        return (Currency) null;
    }

    public void setItems(List<CartItem> items) {
        return;
    }

    public List<CartItem> getItems() {
        return (List<CartItem>) null;
    }

    public void setItemsTotal(PriceWithTaxes itemsTotal) {
        return;
    }

    public PriceWithTaxes getItemsTotal() {
        return (PriceWithTaxes) null;
    }

    public void setSelectedShippingOption(Optional<ShippingOption> selectedShippingOption) {
        return;
    }

    public Optional<ShippingOption> getSelectedShippingOption() {
        return (Optional<ShippingOption>) null;
    }

    public Optional<PriceWithTaxes> getShipping() {
        return (Optional<PriceWithTaxes>) null;
    }

    public int id = 0;

    public static CartBuilder getObject(int id) {
        CartBuilder obj = (CartBuilder) new Object();
        obj.id = id;
        return obj;
    }
}

