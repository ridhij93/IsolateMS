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
 * An immutable cart item, with its associated prices : unit price and total price, with applied taxes information.
 *
 * @version $Id: 0b4fca5b7171efb0cc661500546c73deb634da82 $
 */
@Controller
@RequestMapping("/ms2/cartitem/")
public class CartItemWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CartItemServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "cartitem")
    public  @ResponseBody int CartItem(@RequestParam int tenantId, @RequestParam int itemId, @RequestParam Long quantity, @RequestParam int unitPriceId) {
        CartItemServer newServerObj = new CartItemServer(Tenant.getObject(tenantId), Purchasable.getObject(itemId), quantity, PriceWithTaxes.getObject(unitPriceId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

