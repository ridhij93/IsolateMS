/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

/**
 * @version $Id: 83f6384f3427b0f0644742d37485ee0bd51637f1 $
 */
public class PasswordDoesNotMeetRequirementsExceptionServer extends Exception {

    public PasswordDoesNotMeetRequirementsExceptionServer() {
    }

    public PasswordDoesNotMeetRequirementsExceptionServer(String message) {
        super(message);
    }
}

