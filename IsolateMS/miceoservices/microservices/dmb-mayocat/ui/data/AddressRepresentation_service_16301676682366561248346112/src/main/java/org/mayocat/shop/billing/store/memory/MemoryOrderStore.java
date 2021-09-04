/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.store.memory;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.mayocat.shop.billing.model.Order;
import org.mayocat.shop.billing.store.OrderStore;
import org.mayocat.store.memory.BaseEntityMemoryStore;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * In-memory implementation of {@link org.mayocat.shop.billing.store.OrderStore}
 *
 * @version $Id: e0f07e4df4ced9db480e5ae7f342438138fedae8 $
 */
@Component("memory")
public class MemoryOrderStore extends BaseEntityMemoryStore<Order> implements OrderStore {

    public List<Order> findAllPaidOrAwaitingPayment(Integer number, Integer offset) {
        return (List<Order>) null;
    }

    @Override
    public Integer countAllPaidOrAwaitingPayment() {
        return (Integer) null;
    }

    public Order findBySlug(String order) {
        return (Order) null;
    }

    @Override
    public List<Order> findAllPaidForCustomer(UUID customerId) {
        return (List<Order>) null;
    }

    @Override
    public List<Order> findAllPaidForCustomer(UUID customerId, Integer number, Integer offset) {
        return (List<Order>) null;
    }

    @Override
    public List<Order> findAllPaidBetween(Date date1, Date date2) {
        return (List<Order>) null;
    }

    @Override
    public Integer countAllPaidForCustomer(UUID customerId) {
        return (Integer) null;
    }

    public void setPaidOrAwaitingPayment(Predicate<Order> paidOrAwaitingPayment) {
        return;
    }

    public Predicate<Order> getPaidOrAwaitingPayment() {
        return (Predicate<Order>) null;
    }

    public int id = 0;

    public static MemoryOrderStore getObject(int id) {
        MemoryOrderStore obj = (MemoryOrderStore) new Object();
        obj.id = id;
        return obj;
    }
}

