/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.Map;
import org.mayocat.shop.shipping.ShippingOption;
import org.mayocat.shop.taxes.Taxable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: cca0e17b610621e0b02a2e2298165dc4ebb7d963 $
 */
public class CartContents {

    public CartContents(Currency currency) {
        String uri = MicroserviceApplication.projectUri + "/ms0/cartcontents/cartcontents?callerId=" + this.id + "&currencyId=currency.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public void addItem(Taxable item) {
        return;
    }

    public void removeItem(Taxable item) {
        return;
    }

    public void setItem(Taxable item, Long quantity) {
        return;
    }

    public void addItem(Taxable item, Long quantity) {
        return;
    }

    public void replaceItem(Taxable oldKey, Taxable newKey, Long quantity) {
        return;
    }

    public Map<Taxable, Long> getItems() {
        String uri = MicroserviceApplication.projectUri + "/ms0/cartcontents/getitemscallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Map<Taxable, Long> result = (Map<Taxable, Long>) new Object();
        return result;
    }

    public Currency getCurrency() {
        String uri = MicroserviceApplication.projectUri + "/ms0/cartcontents/getcurrencycallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Currency result = Currency.getObject(resultTemp);
        return result;
    }

    public BigDecimal getItemTotal(Taxable item) {
        return (BigDecimal) null;
    }

    public BigDecimal getItemsTotal() {
        return (BigDecimal) null;
    }

    public BigDecimal getTotal() {
        return (BigDecimal) null;
    }

    public ShippingOption getSelectedShippingOption() {
        String uri = MicroserviceApplication.projectUri + "/ms0/cartcontents/getselectedshippingoptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        ShippingOption result = ShippingOption.getObject(resultTemp);
        return result;
    }

    public void setSelectedShippingOption(ShippingOption selectedOption) {
        return;
    }

    public boolean isEmpty() {
        return (Boolean) null;
    }

    public void empty() {
        return;
    }

    @Override
    public boolean equals(Object obj) {
        return (Boolean) null;
    }

    public static Logger getLOGGER() {
        return (Logger) null;
    }

    public void setItems(Map<Taxable, Long> items) {
        return;
    }

    public void setCurrency(Currency currency) {
        return;
    }

    public int id = 0;

    public static CartContents getObject(int id) {
        CartContents obj = (CartContents) new Object();
        obj.id = id;
        return obj;
    }
}

