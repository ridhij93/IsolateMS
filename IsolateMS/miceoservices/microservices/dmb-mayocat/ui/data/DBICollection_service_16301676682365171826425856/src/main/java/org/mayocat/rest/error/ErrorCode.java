/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.error;

/**
 * @version $Id: de1b804b55ff6d8a768da4746a0cd2fb28e923b1 $
 */
public interface ErrorCode {

    int getCode();

    String getIdentifier();

    public int id = 0;

    public static ErrorCode getObject(int id) {
        return null;
    }
}

