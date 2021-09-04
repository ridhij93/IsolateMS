/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

/**
 * Exception thrown when trying to store invalid gateway customer data
 *
 * @version $Id: d01ef579761d25af4537dab00e66a0937ebd9d54 $
 */
public class InvalidGatewayDataExceptionServer extends Exception {

    public InvalidGatewayDataExceptionServer() {
    }

    public InvalidGatewayDataExceptionServer(String message) {
        super(message);
    }
}

