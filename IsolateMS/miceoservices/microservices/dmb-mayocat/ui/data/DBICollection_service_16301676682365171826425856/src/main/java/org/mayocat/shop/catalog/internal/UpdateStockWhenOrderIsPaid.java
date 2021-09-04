/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.shop.billing.event.OrderPaidEvent;
import org.mayocat.shop.billing.model.Order;
import org.mayocat.shop.billing.model.OrderItem;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.store.ProductStore;
import org.mayocat.store.EntityDoesNotExistException;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import org.xwiki.observation.EventListener;
import org.xwiki.observation.event.Event;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * An event listener that respond to payment operation events.
 *
 * When a payment operation with result "CAPTURED" is received, this listener updates the status of the concerned
 * order.
 *
 * @version $Id: 213770150a805954ae17c5567d218a65931daab1 $
 */
@Component("paidItemsStockUpdateEventListener")
public class UpdateStockWhenOrderIsPaid implements EventListener {

    @Override
    public String getName() {
        return (String) null;
    }

    @Override
    public List<Event> getEvents() {
        return (List<Event>) null;
    }

    @Override
    public void onEvent(Event event, Object source, Object data) {
        return;
    }

    public void setProductStore(Provider<ProductStore> productStore) {
        return;
    }

    public Provider<ProductStore> getProductStore() {
        return (Provider<ProductStore>) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static UpdateStockWhenOrderIsPaid getObject(int id) {
        UpdateStockWhenOrderIsPaid obj = (UpdateStockWhenOrderIsPaid) new Object();
        obj.id = id;
        return obj;
    }
}

