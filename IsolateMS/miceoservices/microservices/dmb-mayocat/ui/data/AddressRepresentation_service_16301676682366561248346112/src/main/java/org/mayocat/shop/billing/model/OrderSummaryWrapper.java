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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: d34732676907de304cf6eb77107832f4df5cdb9e $
 */
@Controller
@RequestMapping("/ms2/ordersummary/")
public class OrderSummaryWrapper {

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

    private static int maxId = 0;

    public static HashMap<Integer, OrderSummaryServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "ordersummary")
    public  @ResponseBody int OrderSummary() {
        OrderSummaryServer newServerObj = new OrderSummaryServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

