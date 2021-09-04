/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart;

/**
 * @version $Id: 9d575b44835789438126d1bf4f836633c3f4c1ab $
 */
public class InvalidCartOperationExceptionServer extends Exception {

    public InvalidCartOperationExceptionServer() {
    }

    public InvalidCartOperationExceptionServer(String message) {
        super(message);
    }

    public InvalidCartOperationExceptionServer(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCartOperationExceptionServer(Throwable cause) {
        super(cause);
    }

    public InvalidCartOperationExceptionServer(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

