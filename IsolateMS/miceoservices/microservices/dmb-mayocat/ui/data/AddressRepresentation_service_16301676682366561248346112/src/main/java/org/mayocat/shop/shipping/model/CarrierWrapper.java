/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.mayocat.model.Identifiable;
import org.mayocat.shop.shipping.Strategy;
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
 * @version $Id: f50cf4c3806a23c197299a4264c564d9517af2d2 $
 */
@Controller
@RequestMapping("/ms2/carrier/")
public class CarrierWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CarrierServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "carrier")
    public  @ResponseBody int Carrier() {
        CarrierServer newServerObj = new CarrierServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

