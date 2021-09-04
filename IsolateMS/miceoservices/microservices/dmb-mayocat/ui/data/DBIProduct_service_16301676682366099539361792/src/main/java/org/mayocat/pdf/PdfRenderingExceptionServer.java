/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.pdf;

/**
 * @version $Id: 7bb191b962bb8e61fe8258b9363ca5533983eadb $
 */
public class PdfRenderingExceptionServer extends Exception {

    public PdfRenderingExceptionServer() {
    }

    public PdfRenderingExceptionServer(String message) {
        super(message);
    }

    public PdfRenderingExceptionServer(String message, Throwable cause) {
        super(message, cause);
    }

    public PdfRenderingExceptionServer(Throwable cause) {
        super(cause);
    }

    public PdfRenderingExceptionServer(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

