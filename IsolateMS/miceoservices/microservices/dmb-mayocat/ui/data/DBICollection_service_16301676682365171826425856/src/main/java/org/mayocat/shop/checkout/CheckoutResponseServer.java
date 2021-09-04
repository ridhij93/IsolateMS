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

/**
 * @version $Id: 834627a977b40ce1508baa014f7821f3919e1b51 $
 */
public class CheckoutResponseServer {

    private final PaymentRequest paymentRequest;

    private final Order order;

    public CheckoutResponseServer(Order order, PaymentRequest paymentRequest) {
        this.order = order;
        this.paymentRequest = paymentRequest;
    }

    public Order getOrder() {
        return order;
    }

    public PaymentRequest getPaymentRequest() {
        return paymentRequest;
    }
}

