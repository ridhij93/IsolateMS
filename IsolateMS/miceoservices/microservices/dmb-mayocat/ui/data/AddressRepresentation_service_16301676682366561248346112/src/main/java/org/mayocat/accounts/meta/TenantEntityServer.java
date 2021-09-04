/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.meta;

import org.mayocat.accounts.model.Tenant;
import org.mayocat.meta.EntityMeta;

/**
 * @version $Id: 7fc00443398e8fa56736817244aaa9cb7c8286e4 $
 */
public class TenantEntityServer implements EntityMeta {

    public static final String ID = "tenant";

    public static final String PATH = "tenants";

    @Override
    public String getEntityName() {
        return ID;
    }

    @Override
    public Class getEntityClass() {
        return Tenant.class;
    }

    public static String getID() {
        return ID;
    }

    public static String getPATH() {
        return PATH;
    }
}

