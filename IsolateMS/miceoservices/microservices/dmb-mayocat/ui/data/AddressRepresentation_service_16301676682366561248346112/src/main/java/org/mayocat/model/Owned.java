/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.model;

import java.util.UUID;

/**
 * @version $Id: c77497f3aba39776082cfe7a599d20be7849a007 $
 *
 * Indicates an entity is "owned" by a tenant
 */
public interface Owned {

    UUID getTenantId();

    public int id = 0;

    public static Owned getObject(int id) {
        return null;
    }
}

