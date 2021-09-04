/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.customer;

import java.util.ArrayList;
import java.util.List;
import org.mayocat.Module;
import org.mayocat.meta.EntityMeta;
import org.mayocat.shop.customer.meta.CustomerEntity;
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
 * @version $Id: a6f459ada0097bb089e02d6786392b68a9621265 $
 */
@Controller
@RequestMapping("/ms1/customermodule/")
public class CustomerModuleWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CustomerModuleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "customermodule")
    public  @ResponseBody int CustomerModule() {
        CustomerModuleServer newServerObj = new CustomerModuleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

