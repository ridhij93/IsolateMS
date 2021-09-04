/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart.internal;

import java.math.BigDecimal;
import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.store.TenantStore;
import org.mayocat.context.WebContext;
import org.mayocat.shop.cart.Cart;
import org.mayocat.shop.cart.CartBuilder;
import org.mayocat.shop.cart.CartContents;
import org.mayocat.shop.cart.CartItemBuilder;
import org.mayocat.shop.cart.CartLoader;
import org.mayocat.shop.shipping.ShippingOption;
import org.mayocat.shop.taxes.PriceWithTaxes;
import org.mayocat.shop.taxes.Taxable;
import org.mayocat.shop.taxes.TaxesService;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: ed359db18b089803442ac3b046a3090a62296740 $
 */
@Component
public class DefaultCartLoaderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultCartLoaderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultcartloader")
    public  @ResponseBody int DefaultCartLoader() {
        DefaultCartLoaderServer newServerObj = new DefaultCartLoaderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

