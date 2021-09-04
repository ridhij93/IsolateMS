/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store;

/**
 * @version $Id: 758ae815f0580e5a04c27896a885024f9b59888d $
 */
public interface EntityStore {

    public int id = 0;

    public static EntityStore getObject(int id) {
        return null;
    }
}

