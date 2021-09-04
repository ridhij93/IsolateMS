/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.views;

/**
 * @version $Id: 34f8192ededaacf421d8d2a3e84e7378c6089c2c $
 */
public class TemplateEngineExceptionServer extends Exception {

    public TemplateEngineExceptionServer() {
        super();
    }

    public TemplateEngineExceptionServer(Throwable t) {
        super(t);
    }

    public TemplateEngineExceptionServer(String message, Throwable t) {
        super(message, t);
    }
}

