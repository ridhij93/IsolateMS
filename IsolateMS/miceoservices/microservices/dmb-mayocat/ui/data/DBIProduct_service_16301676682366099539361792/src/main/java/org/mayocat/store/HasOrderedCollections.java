/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store;

/**
 * @version $Id: 00db53a1d500e2182096e04d2bafb5a248679654 $
 */
public interface HasOrderedCollections {

    enum RelativePosition {

        BEFORE, AFTER
    }

    public int id = 0;

    public static HasOrderedCollections getObject(int id) {
        return null;
    }
}

