/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.model;

import java.util.Map;
import java.util.UUID;
import org.mayocat.model.Identifiable;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 54a418c155cb8a37bf5f08b65fbbf07f1ac3f015 $
 */
public class PaymentOperation implements Identifiable {

    public enum Result {

        INITIALIZED,
        AUTHORIZED,
        CAPTURED,
        CANCELLED,
        REFUSED,
        FAILED,
        REFUND
    }

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

    public String getGatewayId() {
        return (String) null;
    }

    public void setGatewayId(String gatewayId) {
        return;
    }

    public String getExternalId() {
        return (String) null;
    }

    public void setExternalId(String externalId) {
        return;
    }

    public Result getResult() {
        return (Result) null;
    }

    public void setResult(Result result) {
        return;
    }

    public Map<String, Object> getMemo() {
        return (Map<String, Object>) null;
    }

    public void setMemo(Map<String, Object> memo) {
        return;
    }

    public int id = 0;

    public static PaymentOperation getObject(int id) {
        PaymentOperation obj = (PaymentOperation) new Object();
        obj.id = id;
        return obj;
    }
}

