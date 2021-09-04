/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.theme;

/**
 * @version $Id: b774a826cbf64ca907bb2d511cdddc1357549d32 $
 */
public class TemplateNotFoundExceptionServer extends Exception {

    public TemplateNotFoundExceptionServer() {
        super();
    }

    public TemplateNotFoundExceptionServer(String message) {
        super(message);
    }

    public TemplateNotFoundExceptionServer(Throwable t) {
        super(t);
    }
}

