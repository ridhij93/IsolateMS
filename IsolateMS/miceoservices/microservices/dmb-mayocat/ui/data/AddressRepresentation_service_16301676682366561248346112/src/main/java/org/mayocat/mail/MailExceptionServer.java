/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.mail;

/**
 * Exception related to the sending of emails
 *
 * @version $Id: f953c90fbede6f1e2a116e00dc613db18c6ef229 $
 */
public class MailExceptionServer extends Exception {

    public MailExceptionServer() {
        super();
    }

    public MailExceptionServer(String message) {
        super(message);
    }

    public MailExceptionServer(String message, Throwable cause) {
        super(message, cause);
    }

    public MailExceptionServer(Throwable cause) {
        super(cause);
    }
}

