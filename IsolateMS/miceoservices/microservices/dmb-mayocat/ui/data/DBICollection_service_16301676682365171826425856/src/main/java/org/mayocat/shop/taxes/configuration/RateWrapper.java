/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.taxes.configuration;

import java.math.BigDecimal;
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
 * A tax rate, optionally named
 *
 * @version $Id: ebc5202170f0b363a71b17c3ba596f888f6451f1 $
 */
@Controller
@RequestMapping("/ms0/rate/")
public class RateWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, RateServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "rate")
    public  @ResponseBody int Rate() {
        RateServer newServerObj = new RateServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

