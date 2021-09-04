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
 * @version $Id: 124c1343b2e29aa442e8fd99189f519839a1c567 $
 */
public interface Child {

    UUID getParentId();

    void setParentId(UUID id);

    public int id = 0;

    public static Child getObject(int id) {
        return null;
    }
}

