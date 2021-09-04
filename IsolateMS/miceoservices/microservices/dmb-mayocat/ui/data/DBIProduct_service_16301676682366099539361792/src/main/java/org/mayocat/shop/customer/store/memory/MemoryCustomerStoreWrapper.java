/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.customer.store.memory;

import java.util.UUID;
import javax.annotation.Nullable;
import org.mayocat.shop.customer.store.CustomerStore;
import org.mayocat.shop.customer.model.Customer;
import org.mayocat.store.memory.BaseEntityMemoryStore;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
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
 * In-memory implementation of {@link CustomerStore}
 *
 * @version $Id: 2f315ec880319805a82026f8b16bc230be3b95c6 $
 */
@Component("memory")
public class MemoryCustomerStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MemoryCustomerStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "memorycustomerstore")
    public  @ResponseBody int MemoryCustomerStore() {
        MemoryCustomerStoreServer newServerObj = new MemoryCustomerStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

