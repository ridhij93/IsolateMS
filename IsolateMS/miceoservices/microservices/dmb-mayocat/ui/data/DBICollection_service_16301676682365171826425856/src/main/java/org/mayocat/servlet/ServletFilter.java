/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.servlet;

import org.xwiki.component.annotation.Role;

/**
 * Tag interface for servlet filters
 *
 * @version $Id: b943823805d86b8ce741f180472abb82aaff0b29 $
 */
@Role
public interface ServletFilter {

    /**
     * @return the URL pattern to which this filter should be applied to.
     */
    String urlPattern();

    public int id = 0;

    public static ServletFilter getObject(int id) {
        return null;
    }
}

