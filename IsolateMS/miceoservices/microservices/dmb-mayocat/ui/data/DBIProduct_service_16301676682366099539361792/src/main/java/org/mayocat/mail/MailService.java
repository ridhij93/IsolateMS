/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.mail;

import org.xwiki.component.annotation.Role;

/**
 * A service for sending emails through the configured SMTP gateway.
 *
 * @version $Id: 52b6dfaa44fa9fd27214ad16c3526aed0d143714 $
 */
@Role
public interface MailService {

    Mail emailToTenant();

    void sendEmail(Mail mail) throws MailException;

    public int id = 0;

    public static MailService getObject(int id) {
        return null;
    }
}

