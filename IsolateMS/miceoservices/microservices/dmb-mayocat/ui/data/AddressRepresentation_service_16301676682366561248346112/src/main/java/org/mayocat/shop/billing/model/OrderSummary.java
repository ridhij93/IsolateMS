/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.mayocat.model.Entity;
import org.mayocat.model.Owned;
import org.mayocat.model.annotation.DoNotIndex;
import org.mayocat.model.annotation.Index;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: d34732676907de304cf6eb77107832f4df5cdb9e $
 */
public class OrderSummary implements Entity, Owned {

    @Override
    public UUID getId() {
        return (UUID) null;
    }

    @Override
    public void setId(UUID id) {
        return;
    }

    @Override
    public String getSlug() {
        return (String) null;
    }

    @Override
    public void setSlug(String slug) {
        return;
    }

    public Date getCreationDate() {
        return (Date) null;
    }

    public void setCreationDate(Date creationDate) {
        return;
    }

    public Date getUpdateDate() {
        return (Date) null;
    }

    public void setUpdateDate(Date updateDate) {
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

    public BigDecimal getItemsTotalExcl() {
        return (BigDecimal) null;
    }

    public void setItemsTotalExcl(BigDecimal itemsTotalExcl) {
        return;
    }

    public BigDecimal getShipping() {
        return (BigDecimal) null;
    }

    public void setShipping(BigDecimal shipping) {
        return;
    }

    public BigDecimal getShippingExcl() {
        return (BigDecimal) null;
    }

    public void setShippingExcl(BigDecimal shippingExcl) {
        return;
    }

    public BigDecimal getGrandTotal() {
        return (BigDecimal) null;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        return;
    }

    public BigDecimal getGrandTotalExcl() {
        return (BigDecimal) null;
    }

    public void setGrandTotalExcl(BigDecimal grandTotalExcl) {
        return;
    }

    public Status getStatus() {
        return (Status) null;
    }

    public void setStatus(Status status) {
        return;
    }

    public Map<String, Object> getOrderData() {
        return (Map<String, Object>) null;
    }

    public String getAdditionalInformation() {
        return (String) null;
    }

    public void setAdditionalInformation(String additionalInformation) {
        return;
    }

    public void setOrderData(Map<String, Object> orderData) {
        return;
    }

    public UUID getCustomerId() {
        return (UUID) null;
    }

    public void setCustomerId(UUID customerId) {
        return;
    }

    public UUID getDeliveryAddressId() {
        return (UUID) null;
    }

    public void setDeliveryAddressId(UUID deliveryAddressId) {
        return;
    }

    public UUID getBillingAddressId() {
        return (UUID) null;
    }

    public void setBillingAddressId(UUID billingAddressId) {
        return;
    }

    @Override
    public UUID getTenantId() {
        return (UUID) null;
    }

    public void setTenantId(UUID tenantId) {
        return;
    }

    public enum Status {

        /**
         * The order has no status
         */
        NONE,
        /**
         * Payment has been initialized (for example a credit card transaction has been initialized and we're waiting
         * for confirmation from the server
         */
        PAYMENT_PENDING,
        /**
         * The order is waiting for a future payment. Example: the customer has chosen a check payment method, and we're
         * waiting for the check
         */
        WAITING_FOR_PAYMENT,
        /**
         * Payment has failed (for example refused by an authorization server)
         */
        PAYMENT_FAILED,
        /**
         * The order has been paid and the payment is acknowledged
         */
        PAID,
        /**
         * The order is prepared for shipment
         */
        PREPARED,
        /**
         * The order is shipped
         */
        SHIPPED,
        /**
         * The order is cancelled
         */
        CANCELLED
    }

    public static String getORDER_DATA_ID() {
        return (String) null;
    }

    public static String getORDER_DATA_SHIPPING() {
        return (String) null;
    }

    public static String getORDER_DATA_EXTRA() {
        return (String) null;
    }

    public static String getORDER_DATA_ITEMS() {
        return (String) null;
    }

    public int id = 0;

    public static OrderSummary getObject(int id) {
        OrderSummary obj = (OrderSummary) new Object();
        obj.id = id;
        return obj;
    }
}

