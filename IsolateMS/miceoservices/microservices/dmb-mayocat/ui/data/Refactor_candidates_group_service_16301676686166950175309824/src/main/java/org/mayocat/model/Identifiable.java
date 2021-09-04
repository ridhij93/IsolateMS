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
 * @version $Id: e0fb2b42fb82cf3e5ee4918c36581173a21d002b $
 */
public interface Identifiable {

    UUID getId();

    void setId(UUID id);

    public int id = 0;

    public static Identifiable getObject(int id) {
        return null;
    }
}

