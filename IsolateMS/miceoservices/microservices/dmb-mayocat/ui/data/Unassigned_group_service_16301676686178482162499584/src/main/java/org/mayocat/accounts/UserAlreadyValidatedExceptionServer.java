/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

/**
 * @version $Id: 116b94a26dfacb27c26f654f0b3e45439d2c2274 $
 */
public class UserAlreadyValidatedExceptionServer extends Exception {

    public UserAlreadyValidatedExceptionServer() {
    }

    public UserAlreadyValidatedExceptionServer(String message) {
        super(message);
    }
}

