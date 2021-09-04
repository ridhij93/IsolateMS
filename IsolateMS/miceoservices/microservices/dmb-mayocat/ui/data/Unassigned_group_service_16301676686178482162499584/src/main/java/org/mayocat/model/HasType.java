/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.model;

import com.google.common.base.Optional;

/**
 * Entities that implement this interface declare the support the notion of "variants".
 *
 * @version $Id: b47fe8bfbffb2f49e0d7e028b49721e923ea59d1 $
 */
public interface HasType {

    Optional<String> getType();

    public int id = 0;

    public static HasType getObject(int id) {
        return null;
    }
}

