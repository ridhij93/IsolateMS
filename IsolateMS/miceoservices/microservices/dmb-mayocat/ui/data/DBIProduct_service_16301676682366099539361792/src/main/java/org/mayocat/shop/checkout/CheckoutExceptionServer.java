/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.checkout;

/**
 * @version $Id: 39c35937ae87d4483dc728fcafb84ddc7de5afef $
 */
public class CheckoutExceptionServer extends Exception {

    public CheckoutExceptionServer() {
    }

    public CheckoutExceptionServer(String message) {
        super(message);
    }

    public CheckoutExceptionServer(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckoutExceptionServer(Throwable cause) {
        super(cause);
    }
}

