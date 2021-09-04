/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.security;

public class EncryptionExceptionServer extends Exception {

    /**
     * Generated serial version. Change when the serialization of this class changes.
     */
    private static final long serialVersionUID = -7902103228849842206L;

    public EncryptionExceptionServer() {
        super();
    }

    public EncryptionExceptionServer(Throwable t) {
        super(t);
    }

    public EncryptionExceptionServer(String message) {
        super(message);
    }

    public EncryptionExceptionServer(String message, Throwable t) {
        super(message, t);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}

