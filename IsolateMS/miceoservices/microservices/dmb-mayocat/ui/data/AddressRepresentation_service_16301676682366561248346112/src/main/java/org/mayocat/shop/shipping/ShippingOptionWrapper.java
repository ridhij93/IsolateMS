/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping;

import com.google.common.base.Objects;
import java.io.Serializable;
import java.util.UUID;
import org.mayocat.shop.taxes.PriceWithTaxes;
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
 * @version $Id: 23de59116d282a5d503e2e16f407c8874ddb5a38 $
 */
@Controller
@RequestMapping("/ms2/shippingoption/")
public class ShippingOptionWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getcarrierid")
    public @ResponseBody Integer getCarrierId(@RequestParam int callerId) {
        ShippingOptionServer callerObj = idObjMap.get(callerId);
        UUID result = callerObj.getCarrierId();
        return result.id;
    }

    private static int maxId = 0;

    public static HashMap<Integer, ShippingOptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "shippingoption")
    public  @ResponseBody int ShippingOption(@RequestParam int carrierIdId, @RequestParam String title, @RequestParam int priceId) {
        ShippingOptionServer newServerObj = new ShippingOptionServer(UUID.getObject(carrierIdId), title, PriceWithTaxes.getObject(priceId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

