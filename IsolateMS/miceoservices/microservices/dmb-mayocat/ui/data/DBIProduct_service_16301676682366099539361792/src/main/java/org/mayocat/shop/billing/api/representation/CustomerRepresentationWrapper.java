/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.api.representation;

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
 * @version $Id: 12b82c86c29b2eb012bb8945fe19e62a2b63452e $
 */
@Controller
@RequestMapping("/ms1/customerrepresentation/")
public class CustomerRepresentationWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CustomerRepresentationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "customerrepresentation")
    public  @ResponseBody int CustomerRepresentation() {
        CustomerRepresentationServer newServerObj = new CustomerRepresentationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "customerrepresentation")
    public  @ResponseBody int CustomerRepresentation(@RequestParam int customerId) {
        CustomerRepresentationServer newServerObj = new CustomerRepresentationServer(Customer.getObject(customerId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

