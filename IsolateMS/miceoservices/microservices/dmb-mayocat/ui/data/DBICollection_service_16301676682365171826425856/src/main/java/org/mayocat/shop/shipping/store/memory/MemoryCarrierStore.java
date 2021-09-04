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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * In-memory implementation of {@link CarrierStore}
 *
 * @version $Id: 1427f3b0be1cc22447b87fa2a33af13c71391d10 $
 */
public class MemoryCarrierStore extends BaseEntityMemoryStore<Carrier> implements CarrierStore {

    private Predicate<Carrier> withStrategy(final Strategy strategy) {
        return (Predicate<Carrier>) null;
    }

    public Set<Carrier> findAll() {
        return (Set<Carrier>) null;
    }

    public Set<Carrier> findAll(Strategy strategy) {
        return (Set<Carrier>) null;
    }

    public void createCarrier(Carrier carrier) {
        return;
    }

    public void updateCarrier(Carrier carrier) {
        return;
    }

    public void deleteCarrier(Carrier carrier) {
        return;
    }

    public void updatePositions(List<Carrier> carriers) {
        return;
    }

    public int id = 0;

    public static MemoryCarrierStore getObject(int id) {
        MemoryCarrierStore obj = (MemoryCarrierStore) new Object();
        obj.id = id;
        return obj;
    }
}

