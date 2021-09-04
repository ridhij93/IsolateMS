/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.model;

import java.math.BigDecimal;
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
 * @version $Id: 21504499ccbc2f6c83ab952311ff0671a35dc7cf $
 */
@Controller
@RequestMapping("/ms5/carrierrule/")
public class CarrierRuleWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CarrierRuleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "carrierrule")
    public  @ResponseBody int CarrierRule() {
        CarrierRuleServer newServerObj = new CarrierRuleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

