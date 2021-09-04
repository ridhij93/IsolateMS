/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.model;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: b1955132744d92de27df9dc8230d31b028efd1ca $
 */
public class OrderItem {

    public UUID getId() {
        return (UUID) null;
    }

    public void setId(UUID id) {
        return;
    }

    public UUID getOrderId() {
        return (UUID) null;
    }

    public void setOrderId(UUID orderId) {
        return;
    }

    public UUID getPurchasableId() {
        return (UUID) null;
    }

    public void setPurchasableId(UUID purchasableId) {
        return;
    }

    public String getType() {
        return (String) null;
    }

    public void setType(String type) {
        return;
    }

    public String getTitle() {
        return (String) null;
    }

    public void setTitle(String title) {
        return;
    }

    public String getMerchant() {
        return (String) null;
    }

    public void setMerchant(String merchant) {
        return;
    }

    public Long getQuantity() {
        return (Long) null;
    }

    public void setQuantity(Long quantity) {
        return;
    }

    public BigDecimal getUnitPrice() {
        return (BigDecimal) null;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        return;
    }

    public BigDecimal getItemTotal() {
        return (BigDecimal) null;
    }

    public void setItemTotal(BigDecimal itemTotal) {
        return;
    }

    public BigDecimal getVatRate() {
        return (BigDecimal) null;
    }

    public void setVatRate(BigDecimal vatRate) {
        return;
    }

    public Map<String, Object> getData() {
        return (Map<String, Object>) null;
    }

    public void addData(String key, Object value) {
        return;
    }

    public void addData(Map<String, Object> data) {
        return;
    }

    public void setData(Map<String, Object> data) {
        return;
    }

    public int id = 0;

    public static OrderItem getObject(int id) {
        OrderItem obj = (OrderItem) new Object();
        obj.id = id;
        return obj;
    }
}

