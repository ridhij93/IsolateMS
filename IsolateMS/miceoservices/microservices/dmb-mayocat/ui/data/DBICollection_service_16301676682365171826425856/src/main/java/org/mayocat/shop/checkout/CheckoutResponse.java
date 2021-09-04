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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 834627a977b40ce1508baa014f7821f3919e1b51 $
 */
public class CheckoutResponse {

    public CheckoutResponse(Order order, PaymentRequest paymentRequest) {
        String uri = MicroserviceApplication.projectUri + "/ms0/checkoutresponse/checkoutresponse?callerId=" + this.id + "&orderId=order.id&paymentRequestId=paymentRequest.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Order getOrder() {
        return (Order) null;
    }

    public PaymentRequest getPaymentRequest() {
        return (PaymentRequest) null;
    }

    public int id = 0;

    public static CheckoutResponse getObject(int id) {
        CheckoutResponse obj = (CheckoutResponse) new Object();
        obj.id = id;
        return obj;
    }
}

