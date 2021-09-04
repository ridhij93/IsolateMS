/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.store.memory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.mayocat.shop.shipping.Strategy;
import org.mayocat.shop.shipping.model.Carrier;
import org.mayocat.shop.shipping.store.CarrierStore;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.memory.BaseEntityMemoryStore;
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
 * In-memory implementation of {@link CarrierStore}
 *
 * @version $Id: 1427f3b0be1cc22447b87fa2a33af13c71391d10 $
 */
@Controller
@RequestMapping("/ms0/memorycarrierstore/")
public class MemoryCarrierStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MemoryCarrierStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "memorycarrierstore")
    public  @ResponseBody int MemoryCarrierStore() {
        MemoryCarrierStoreServer newServerObj = new MemoryCarrierStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

