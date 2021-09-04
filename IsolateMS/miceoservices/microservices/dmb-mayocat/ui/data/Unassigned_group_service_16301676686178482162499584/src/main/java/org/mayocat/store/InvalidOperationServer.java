/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store;

/**
 * @version $Id: 42709486f2ca9c7b06fa5d0162dd6ca3abe99192 $
 */
public class InvalidOperationServer extends Exception {

    /**
     * Generated serial UID. Change when the serialization of this class changes.
     */
    private static final long serialVersionUID = 1l;

    public InvalidOperationServer() {
        super();
    }

    public InvalidOperationServer(String message) {
        super(message);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}

