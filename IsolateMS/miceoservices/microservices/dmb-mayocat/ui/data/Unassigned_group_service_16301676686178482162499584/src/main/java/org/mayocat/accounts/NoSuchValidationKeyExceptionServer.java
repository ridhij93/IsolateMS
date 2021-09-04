/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

/**
 * @version $Id: fc9bc9353b5ab23f83a45f1b35d5f7e98a02668e $
 */
public class NoSuchValidationKeyExceptionServer extends Exception {

    public NoSuchValidationKeyExceptionServer() {
    }

    public NoSuchValidationKeyExceptionServer(String message) {
        super(message);
    }
}

