/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.customer.model;

import java.util.Map;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.Association;
import org.mayocat.model.Entity;
import org.mayocat.model.HasAddons;
import org.mayocat.model.annotation.Index;
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
 * @version $Id: 231010000bec41f2afcd3c54ed618af4055fd118 $
 */
@Controller
@RequestMapping("/ms0/customer/")
public class CustomerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CustomerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "customer")
    public  @ResponseBody int Customer() {
        CustomerServer newServerObj = new CustomerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

