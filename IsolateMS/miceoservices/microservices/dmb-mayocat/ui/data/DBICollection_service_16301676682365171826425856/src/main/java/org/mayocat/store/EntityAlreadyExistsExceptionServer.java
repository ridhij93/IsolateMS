/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store;

public class EntityAlreadyExistsExceptionServer extends Exception {

    /**
     * Change when the serialization form of this exception changes.
     */
    private static final long serialVersionUID = -153504107891229925L;

    public EntityAlreadyExistsExceptionServer() {
        super();
    }

    public EntityAlreadyExistsExceptionServer(String message) {
        super(message);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}

