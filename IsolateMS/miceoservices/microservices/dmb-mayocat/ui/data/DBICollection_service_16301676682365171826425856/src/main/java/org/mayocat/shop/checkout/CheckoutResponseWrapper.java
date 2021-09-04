/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.checkout;

import org.mayocat.shop.billing.model.Order;
import org.mayocat.shop.payment.PaymentRequest;
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
 * @version $Id: 834627a977b40ce1508baa014f7821f3919e1b51 $
 */
@Controller
@RequestMapping("/ms0/checkoutresponse/")
public class CheckoutResponseWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CheckoutResponseServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "checkoutresponse")
    public  @ResponseBody int CheckoutResponse(@RequestParam int orderId, @RequestParam int paymentRequestId) {
        CheckoutResponseServer newServerObj = new CheckoutResponseServer(Order.getObject(orderId), PaymentRequest.getObject(paymentRequestId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

