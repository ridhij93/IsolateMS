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
 * @version $Id: 69da4010475269077a28998643ddb7fc9e6dd323 $
 */
@Component
public class DefaultCartManagerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultCartManagerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultcartmanager")
    public  @ResponseBody int DefaultCartManager() {
        DefaultCartManagerServer newServerObj = new DefaultCartManagerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

