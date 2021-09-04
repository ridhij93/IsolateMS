/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

import java.util.Map;
import org.mayocat.shop.billing.model.Order;
import org.xwiki.component.annotation.Role;

/**
 * @version $Id: 37a9ccebcc47c6160ae85e6dfaee6e9a46183e7e $
 */
@Role
public interface PaymentProcessor {

    PaymentRequest requestPayment(Order order, Map<PaymentData, Object> data) throws PaymentException;

    public int id = 0;

    public static PaymentProcessor getObject(int id) {
        return null;
    }
}

