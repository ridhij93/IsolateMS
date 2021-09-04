/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

/**
 * @version $Id: d9df1d77df0f2f655be3bdd3381efdb40a9330bf $
 */
public class NoSuchPasswordResetKeyExceptionServer extends Exception {

    public NoSuchPasswordResetKeyExceptionServer() {
    }

    public NoSuchPasswordResetKeyExceptionServer(String message) {
        super(message);
    }
}

