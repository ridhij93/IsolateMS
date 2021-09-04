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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * In-memory implementation of {@link PaymentOperationStore}
 *
 * @version $Id: a579aa2a0382e0af0a13c03e2fa743883671796c $
 */
@Component("memory")
public class MemoryPaymentOperationStore extends BaseEntityMemoryStore<PaymentOperation> implements PaymentOperationStore {

    @Override
    public List<PaymentOperation> findAllForOrderId(final UUID order) {
        return (List<PaymentOperation>) null;
    }

    public int id = 0;

    public static MemoryPaymentOperationStore getObject(int id) {
        MemoryPaymentOperationStore obj = (MemoryPaymentOperationStore) new Object();
        obj.id = id;
        return obj;
    }
}

