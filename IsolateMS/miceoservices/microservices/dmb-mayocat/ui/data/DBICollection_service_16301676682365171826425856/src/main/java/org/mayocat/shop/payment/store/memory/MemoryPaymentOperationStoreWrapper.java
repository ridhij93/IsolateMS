/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.store.memory;

import java.util.List;
import java.util.UUID;
import org.mayocat.shop.payment.model.PaymentOperation;
import org.mayocat.shop.payment.store.PaymentOperationStore;
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
 * In-memory implementation of {@link PaymentOperationStore}
 *
 * @version $Id: a579aa2a0382e0af0a13c03e2fa743883671796c $
 */
@Component("memory")
public class MemoryPaymentOperationStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MemoryPaymentOperationStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "memorypaymentoperationstore")
    public  @ResponseBody int MemoryPaymentOperationStore() {
        MemoryPaymentOperationStoreServer newServerObj = new MemoryPaymentOperationStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

