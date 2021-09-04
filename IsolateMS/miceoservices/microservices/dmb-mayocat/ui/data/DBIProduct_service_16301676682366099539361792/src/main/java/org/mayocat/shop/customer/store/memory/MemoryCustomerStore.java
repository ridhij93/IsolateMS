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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * In-memory implementation of {@link CustomerStore}
 *
 * @version $Id: 2f315ec880319805a82026f8b16bc230be3b95c6 $
 */
@Component("memory")
public class MemoryCustomerStore extends BaseEntityMemoryStore<Customer> implements CustomerStore {

    public Customer findBySlug(String slug) {
        return (Customer) null;
    }

    @Override
    public Customer findByUserId(final UUID userId) {
        return (Customer) null;
    }

    public int id = 0;

    public static MemoryCustomerStore getObject(int id) {
        MemoryCustomerStore obj = (MemoryCustomerStore) new Object();
        obj.id = id;
        return obj;
    }
}

