/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store;

public class StoreExceptionServer extends RuntimeException {

    /**
     */
    private static final long serialVersionUID = -153504107891229925L;

    public StoreExceptionServer() {
        super();
    }

    public StoreExceptionServer(String message) {
        super(message);
    }

    public StoreExceptionServer(Throwable cause) {
        super(cause);
    }

    public StoreExceptionServer(String message, Throwable cause) {
        super(message, cause);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}

