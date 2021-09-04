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
 * @version $Id: 56a30c63eff9901522bdf709206574a76ca367be $
 */
@Controller
@RequestMapping("/ms2/cartbuilder/")
public class CartBuilderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CartBuilderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "cartbuilder")
    public  @ResponseBody int CartBuilder() {
        CartBuilderServer newServerObj = new CartBuilderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

