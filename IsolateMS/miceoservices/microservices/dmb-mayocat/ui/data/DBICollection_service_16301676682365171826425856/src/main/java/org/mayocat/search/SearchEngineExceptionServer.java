/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.search;

public class SearchEngineExceptionServer extends Exception {

    /**
     */
    private static final long serialVersionUID = 1L;

    public SearchEngineExceptionServer() {
        super();
    }

    public SearchEngineExceptionServer(String message) {
        super(message);
    }

    public SearchEngineExceptionServer(Throwable cause) {
        super(cause);
    }

    public SearchEngineExceptionServer(String message, Throwable cause) {
        super(message, cause);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}

