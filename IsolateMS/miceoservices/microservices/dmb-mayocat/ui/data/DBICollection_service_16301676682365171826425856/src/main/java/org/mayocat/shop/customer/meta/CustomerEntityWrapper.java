/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.customer.meta;

import org.mayocat.meta.EntityMeta;
import org.mayocat.shop.customer.model.Customer;
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
 * @version $Id: 239a8529f52e759302562ce5a0f505a36ca45ebf $
 */
@Controller
@RequestMapping("/ms0/customerentity/")
public class CustomerEntityWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CustomerEntityServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "customerentity")
    public  @ResponseBody int CustomerEntity() {
        CustomerEntityServer newServerObj = new CustomerEntityServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

