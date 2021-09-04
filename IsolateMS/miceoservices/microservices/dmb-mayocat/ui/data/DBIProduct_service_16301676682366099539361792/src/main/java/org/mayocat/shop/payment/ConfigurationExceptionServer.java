/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

/**
 * @version $Id: dd2655dc4d707488fc7bf90289f11d67b02fdb0d $
 */
public class ConfigurationExceptionServer extends PaymentException {

    public ConfigurationExceptionServer() {
    }

    public ConfigurationExceptionServer(String message) {
        super(message);
    }

    public ConfigurationExceptionServer(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigurationExceptionServer(Throwable cause) {
        super(cause);
    }
}

