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
 * @version $Id: 5b4752eba6b84e2646c75da9f7191c907d659ef7 $
 */
public interface HasFeaturedImage extends Entity {

    public UUID getFeaturedImageId();

    void setFeaturedImageId(UUID id);

    public int id = 0;

    public static HasFeaturedImage getObject(int id) {
        return null;
    }
}

