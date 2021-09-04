/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

/**
 * @version $Id: b1ae7a2624b25c6f15be9eed17e06a9862e2af1a $
 */
public class UserNotFoundExceptionServer extends Exception {

    public UserNotFoundExceptionServer() {
    }

    public UserNotFoundExceptionServer(String message) {
        super(message);
    }
}

