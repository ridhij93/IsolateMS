/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart;

import java.io.Serializable;
import java.util.Map;
import java.util.UUID;
import org.mayocat.shop.shipping.ShippingOption;
import org.mayocat.shop.taxes.Taxable;
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
 * @version $Id: 24ae9bce25b834a858bc7e270794f57fa955725f $
 *
 * A serialization size optimized version of {@link CartContents}. We need this since cookie size is limited in
 * browsers, so we just can't serialize the whole purchasables (products, etc.).
 */
@Controller
@RequestMapping("/ms0/cartinsession/")
public class CartInSessionWrapper {

    public static class IdAndType implements Serializable {

        private UUID id;

        private String type;

        private IdAndType(UUID id, String type) {
            this.id = id;
            this.type = type;
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, CartInSessionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "cartinsession")
    public  @ResponseBody int CartInSession(@RequestParam int cartContentsId) {
        CartInSessionServer newServerObj = new CartInSessionServer(CartContents.getObject(cartContentsId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

