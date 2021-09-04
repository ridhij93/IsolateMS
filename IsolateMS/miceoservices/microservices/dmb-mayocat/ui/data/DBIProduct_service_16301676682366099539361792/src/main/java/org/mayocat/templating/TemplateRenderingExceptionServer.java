/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.templating;

/**
 * @version $Id: 62e6aff96cf22b95e02320414094492825914c5f $
 */
public class TemplateRenderingExceptionServer extends Exception {

    public TemplateRenderingExceptionServer() {
    }

    public TemplateRenderingExceptionServer(String message) {
        super(message);
    }

    public TemplateRenderingExceptionServer(String message, Throwable cause) {
        super(message, cause);
    }

    public TemplateRenderingExceptionServer(Throwable cause) {
        super(cause);
    }

    public TemplateRenderingExceptionServer(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

