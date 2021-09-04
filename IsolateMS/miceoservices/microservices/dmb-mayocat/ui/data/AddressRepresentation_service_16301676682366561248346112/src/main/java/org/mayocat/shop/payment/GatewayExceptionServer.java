/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

/**
 * @version $Id: 1658b505b45498032173ca058b7d8a6d24dcf73c $
 */
public class GatewayExceptionServer extends Exception {

    public GatewayExceptionServer() {
        super();
    }

    public GatewayExceptionServer(String message) {
        super(message);
    }

    public GatewayExceptionServer(String message, Throwable cause) {
        super(message, cause);
    }

    public GatewayExceptionServer(Throwable t) {
        super(t);
    }
}

