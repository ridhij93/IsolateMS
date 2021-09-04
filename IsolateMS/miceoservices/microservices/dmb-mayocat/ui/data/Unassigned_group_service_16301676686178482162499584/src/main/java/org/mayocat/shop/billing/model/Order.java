/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.model;

import java.util.List;
import org.mayocat.shop.customer.model.Address;
import org.mayocat.shop.customer.model.Customer;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: f4991dc7855f72430664ffd2bb1d7f72e8cf6c60 $
 */
public class Order extends OrderSummary {

    public List<OrderItem> getOrderItems() {
        return (List<OrderItem>) null;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        return;
    }

    public Customer getCustomer() {
        return (Customer) null;
    }

    public void setCustomer(Customer customer) {
        return;
    }

    public Address getBillingAddress() {
        return (Address) null;
    }

    public void setBillingAddress(Address billingAddress) {
        return;
    }

    public Address getDeliveryAddress() {
        return (Address) null;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        return;
    }

    public int id = 0;

    public static Order getObject(int id) {
        Order obj = (Order) new Object();
        obj.id = id;
        return obj;
    }
}

