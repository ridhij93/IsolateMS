/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.webhooks;

import org.xwiki.component.annotation.Role;

/**
 * @version $Id: 1aa3f984887b985bcb006c363ddf18d1ebf1cff0 $
 */
@Role
public interface Webhook {

    String getName();

    public int id = 0;

    public static Webhook getObject(int id) {
        return null;
    }
}

