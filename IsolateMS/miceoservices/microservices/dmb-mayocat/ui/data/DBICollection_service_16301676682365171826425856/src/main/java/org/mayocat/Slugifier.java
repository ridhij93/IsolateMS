/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat;

import org.xwiki.component.annotation.Role;

/**
 * @version $Id: f51b4b8d3091e0673dac7b289771059592abc5a6 $
 */
@Role
public interface Slugifier {

    String slugify(String toSlugify);

    public int id = 0;

    public static Slugifier getObject(int id) {
        return null;
    }
}

