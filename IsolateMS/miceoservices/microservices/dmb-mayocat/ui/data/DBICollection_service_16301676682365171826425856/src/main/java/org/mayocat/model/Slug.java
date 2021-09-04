/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.model;

/**
 * @version $Id: fc1cf1920c217f436b4edf44e76e7d7d2d3e93ea $
 */
public interface Slug {

    String getSlug();

    void setSlug(String slug);

    public int id = 0;

    public static Slug getObject(int id) {
        return null;
    }
}

