/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.gestalt;

import java.util.Map;
import org.xwiki.component.annotation.Role;

/**
 * @version $Id: bd2f1c83a93d99d7f87609e13362132434566fbf $
 */
@Role
public interface EntityConfigurationContributor {

    String contributesTo();

    void contribute(Map<String, Object> configuration);

    public int id = 0;

    public static EntityConfigurationContributor getObject(int id) {
        return null;
    }
}

