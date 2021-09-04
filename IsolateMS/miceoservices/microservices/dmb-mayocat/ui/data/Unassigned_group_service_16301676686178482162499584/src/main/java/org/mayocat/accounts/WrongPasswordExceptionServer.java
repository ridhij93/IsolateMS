/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

/**
 * @version $Id: e0c3e222b59c34fd229d4f3f25a813507721d6d7 $
 */
public class WrongPasswordExceptionServer extends Exception {

    public WrongPasswordExceptionServer() {
    }

    public WrongPasswordExceptionServer(String message) {
        super(message);
    }
}

