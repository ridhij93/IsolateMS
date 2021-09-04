/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

/**
 * @version $Id: 23938538a372c2cd9eafbdc7855ff39243e1cc30 $
 */
public class PaymentExceptionServer extends Exception {

    public PaymentExceptionServer() {
    }

    public PaymentExceptionServer(String message) {
        super(message);
    }

    public PaymentExceptionServer(String message, Throwable cause) {
        super(message, cause);
    }

    public PaymentExceptionServer(Throwable cause) {
        super(cause);
    }
}

