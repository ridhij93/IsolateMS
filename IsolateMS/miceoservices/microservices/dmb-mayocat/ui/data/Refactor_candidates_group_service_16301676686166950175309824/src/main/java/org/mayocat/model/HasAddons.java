/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.model;

import java.util.List;
import java.util.Map;

/**
 * @version $Id: 189f5e1814b4e85609da920b82dde9e2f692d81a $
 */
public interface HasAddons {

    Association<Map<String, AddonGroup>> getAddons();

    void setAddons(Map<String, AddonGroup> addons);

    public int id = 0;

    public static HasAddons getObject(int id) {
        return null;
    }
}

