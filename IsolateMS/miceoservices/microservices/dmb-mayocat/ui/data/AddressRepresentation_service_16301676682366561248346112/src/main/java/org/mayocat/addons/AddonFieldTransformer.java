/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.addons;

import org.mayocat.addons.model.AddonFieldDefinition;
import org.mayocat.addons.web.AddonFieldValueWebObject;
import org.mayocat.entity.EntityData;
import org.xwiki.component.annotation.Role;
import com.google.common.base.Optional;

/**
 * @version $Id: 8acb55581e48a59cc4589bf0c555810424ddae57 $
 */
@Role
public interface AddonFieldTransformer {

    Optional<AddonFieldValueWebObject> toWebView(EntityData<?> entityData, AddonFieldDefinition definition, Object storedValue);

    public int id = 0;

    public static AddonFieldTransformer getObject(int id) {
        return null;
    }
}

