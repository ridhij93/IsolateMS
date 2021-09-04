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
 * @version $Id: 0fdc9a4c789311b4b892cbb0d67cacf96873521f $
 */
@Controller
@RequestMapping("/ms0/cart/")
public class CartWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CartServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "cart")
    public  @ResponseBody int Cart(@RequestParam int currencyId, @RequestParam int itemsId, @RequestParam int itemsTotalId, @RequestParam int selectedShippingOptionId, @RequestParam int shippingId) {
    }
}

