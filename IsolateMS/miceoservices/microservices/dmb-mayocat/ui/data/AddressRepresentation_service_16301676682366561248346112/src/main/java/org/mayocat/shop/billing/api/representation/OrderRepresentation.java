/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.api.representation;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.mayocat.shop.billing.model.Order;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 443fed2fc2aff97a2d174dffd74a0298101ee0b3 $
 */
public class OrderRepresentation {

    public OrderRepresentation() {
        String uri = MicroserviceApplication.projectUri + "/msnull/orderrepresentation/orderrepresentationcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public OrderRepresentation(DateTimeZone tenantZone, Order order) {
        String uri = MicroserviceApplication.projectUri + "/msnull/orderrepresentation/orderrepresentation?callerId=" + this.id + "&tenantZoneId=tenantZone.id&orderId=order.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getSlug() {
        return (String) null;
    }

    public void setSlug(String slug) {
        return;
    }

    public DateTime getCreationDate() {
        return (DateTime) null;
    }

    public void setCreationDate(DateTime creationDate) {
        return;
    }

    public DateTime getUpdateDate() {
        return (DateTime) null;
    }

    public void setUpdateDate(DateTime updateDate) {
        return;
    }

    public Currency getCurrency() {
        return (Currency) null;
    }

    public void setCurrency(Currency currency) {
        return;
    }

    public Long getNumberOfItems() {
        return (Long) null;
    }

    public void setNumberOfItems(Long numberOfItems) {
        return;
    }

    public BigDecimal getItemsTotal() {
        return (BigDecimal) null;
    }

    public void setItemsTotal(BigDecimal itemsTotal) {
        return;
    }

    public BigDecimal getShipping() {
        return (BigDecimal) null;
    }

    public void setShipping(BigDecimal shipping) {
        return;
    }

    public BigDecimal getGrandTotal() {
        return (BigDecimal) null;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        return;
    }

    public Order.Status getStatus() {
        return (Status) null;
    }

    public void setStatus(Order.Status status) {
        return;
    }

    public Map<String, Object> getData() {
        return (Map<String, Object>) null;
    }

    public String getAdditionalInformation() {
        return (String) null;
    }

    public void setAdditionalInformation(String additionalInformation) {
        return;
    }

    public void setData(Map<String, Object> data) {
        return;
    }

    public CustomerRepresentation getCustomer() {
        return (CustomerRepresentation) null;
    }

    public void setCustomer(CustomerRepresentation customer) {
        return;
    }

    public AddressRepresentation getDeliveryAddress() {
        return (AddressRepresentation) null;
    }

    public void setDeliveryAddress(AddressRepresentation deliveryAddress) {
        return;
    }

    public AddressRepresentation getBillingAddress() {
        return (AddressRepresentation) null;
    }

    public void setBillingAddress(AddressRepresentation billingAddress) {
        return;
    }

    public int id = 0;

    public static OrderRepresentation getObject(int id) {
        OrderRepresentation obj = (OrderRepresentation) new Object();
        obj.id = id;
        return obj;
    }
}

