/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart.internal;

import java.util.Map;
import java.util.UUID;
import javax.inject.Inject;
import org.mayocat.shop.cart.Cart;
import org.mayocat.shop.cart.CartAccessor;
import org.mayocat.shop.cart.CartContents;
import org.mayocat.shop.cart.CartLoader;
import org.mayocat.shop.cart.CartManager;
import org.mayocat.shop.cart.InvalidCartOperationException;
import org.mayocat.shop.catalog.model.Purchasable;
import org.mayocat.shop.shipping.ShippingOption;
import org.mayocat.shop.shipping.ShippingService;
import org.mayocat.shop.taxes.Taxable;
import org.xwiki.component.annotation.Component;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 69da4010475269077a28998643ddb7fc9e6dd323 $
 */
@Component
public class DefaultCartManager implements CartManager {

    @Override
    public Cart getCart() {
        return (Cart) null;
    }

    @Override
    public Taxable getItem(Integer index) {
        return (Taxable) null;
    }

    @Override
    public void addItem(Taxable purchasable) {
        return;
    }

    @Override
    public void addItem(Taxable purchasable, Long quantity) {
        return;
    }

    @Override
    public void removeItem(Taxable purchasable) throws InvalidCartOperationException {
        return;
    }

    @Override
    public void removeItem(Integer index) throws InvalidCartOperationException {
        return;
    }

    @Override
    public void setItem(Taxable newItem, Integer index) throws InvalidCartOperationException {
        return;
    }

    @Override
    public void setQuantity(Taxable purchasable, Long quantity) throws InvalidCartOperationException {
        return;
    }

    @Override
    public void setQuantity(Integer index, Long quantity) throws InvalidCartOperationException {
        return;
    }

    @Override
    public void setSelectedShippingOption(ShippingOption option) {
        return;
    }

    @Override
    public void discardCart() {
        return;
    }

    private void recalculateShipping() {
        return;
    }

    public void setCartAccessor(CartAccessor cartAccessor) {
        return;
    }

    public CartAccessor getCartAccessor() {
        return (CartAccessor) null;
    }

    public void setCartLoader(CartLoader cartLoader) {
        return;
    }

    public CartLoader getCartLoader() {
        return (CartLoader) null;
    }

    public void setShippingService(ShippingService shippingService) {
        return;
    }

    public ShippingService getShippingService() {
        return (ShippingService) null;
    }

    public int id = 0;

    public static DefaultCartManager getObject(int id) {
        DefaultCartManager obj = (DefaultCartManager) new Object();
        obj.id = id;
        return obj;
    }
}

