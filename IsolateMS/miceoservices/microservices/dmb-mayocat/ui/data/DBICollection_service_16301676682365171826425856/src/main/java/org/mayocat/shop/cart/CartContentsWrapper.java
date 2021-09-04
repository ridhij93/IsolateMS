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
 * @version $Id: cca0e17b610621e0b02a2e2298165dc4ebb7d963 $
 */
@Controller
@RequestMapping("/ms0/cartcontents/")
public class CartContentsWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getitems")
    public @ResponseBody Integer getItems(@RequestParam int callerId) {
        CartContentsServer callerObj = idObjMap.get(callerId);
        Map<Taxable, Long> result = callerObj.getItems();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getcurrency")
    public @ResponseBody Integer getCurrency(@RequestParam int callerId) {
        CartContentsServer callerObj = idObjMap.get(callerId);
        Currency result = callerObj.getCurrency();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getselectedshippingoption")
    public @ResponseBody Integer getSelectedShippingOption(@RequestParam int callerId) {
        CartContentsServer callerObj = idObjMap.get(callerId);
        ShippingOption result = callerObj.getSelectedShippingOption();
        return result.id;
    }

    private static int maxId = 0;

    public static HashMap<Integer, CartContentsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "cartcontents")
    public  @ResponseBody int CartContents(@RequestParam int currencyId) {
        CartContentsServer newServerObj = new CartContentsServer(Currency.getObject(currencyId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

