/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart;

import java.util.Currency;
import java.util.List;
import org.mayocat.shop.shipping.ShippingOption;
import org.mayocat.shop.taxes.PriceWithTaxes;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 0fdc9a4c789311b4b892cbb0d67cacf96873521f $
 */
public class Cart {

    public Cart(Currency currency, List<CartItem> items, PriceWithTaxes itemsTotal, Optional<ShippingOption> selectedShippingOption, Optional<PriceWithTaxes> shipping) {
        String uri = MicroserviceApplication.projectUri + "/ms0/cart/cart?callerId=" + this.id + "&currencyId=currency.id&itemsId=items.id&itemsTotalId=itemsTotal.id&selectedShippingOptionId=selectedShippingOption.id&shippingId=shipping.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Currency currency() {
        return (Currency) null;
    }

    public List<CartItem> items() {
        return (List<CartItem>) null;
    }

    public PriceWithTaxes itemsTotal() {
        return (PriceWithTaxes) null;
    }

    public Optional<ShippingOption> selectedShippingOption() {
        return (Optional<ShippingOption>) null;
    }

    public Optional<PriceWithTaxes> shipping() {
        return (Optional<PriceWithTaxes>) null;
    }

    public PriceWithTaxes total() {
        return (PriceWithTaxes) null;
    }

    public Boolean isEmpty() {
        return (Boolean) null;
    }

    public Currency getCurrency() {
        return (Currency) null;
    }

    public List<CartItem> getItems() {
        return (List<CartItem>) null;
    }

    public PriceWithTaxes getItemsTotal() {
        return (PriceWithTaxes) null;
    }

    public Optional<ShippingOption> getSelectedShippingOption() {
        return (Optional<ShippingOption>) null;
    }

    public Optional<PriceWithTaxes> getShipping() {
        return (Optional<PriceWithTaxes>) null;
    }

    public PriceWithTaxes getTotal() {
        return (PriceWithTaxes) null;
    }

    public int id = 0;

    public static Cart getObject(int id) {
        Cart obj = (Cart) new Object();
        obj.id = id;
        return obj;
    }
}

