/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

import java.util.Map;
import org.mayocat.accounts.model.User;
import org.xwiki.component.annotation.Role;

/**
 * @version $Id: 41fa8b456281ca39957cf65ed237b22aa1c072a6 $
 */
@Role
public interface UserDataSupplier {

    void supply(User user, Map<String, Object> data);

    public int id = 0;

    public static UserDataSupplier getObject(int id) {
        return null;
    }
}

