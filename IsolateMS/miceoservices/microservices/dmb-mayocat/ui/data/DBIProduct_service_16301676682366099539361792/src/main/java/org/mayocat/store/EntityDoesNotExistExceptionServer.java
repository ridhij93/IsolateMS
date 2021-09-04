/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store;

public class EntityDoesNotExistExceptionServer extends Exception {

    /**
     * Change when the serialization form of this exception changes.
     */
    private static final long serialVersionUID = 2219941249999412472L;

    public EntityDoesNotExistExceptionServer() {
        super();
    }

    public EntityDoesNotExistExceptionServer(String message) {
        super(message);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}

