/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.customer.model;

import java.util.UUID;
import org.mayocat.model.Identifiable;
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
 * @version $Id: 0949d59be050f06fcf1270e4040384b8e7b07e63 $
 */
@Controller
@RequestMapping("/ms1/address/")
public class AddressWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AddressServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "address")
    public  @ResponseBody int Address() {
        AddressServer newServerObj = new AddressServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

