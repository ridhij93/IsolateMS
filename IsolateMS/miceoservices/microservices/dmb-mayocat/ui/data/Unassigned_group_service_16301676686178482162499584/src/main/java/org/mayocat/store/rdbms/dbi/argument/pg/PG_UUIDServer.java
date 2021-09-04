/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.argument.pg;

/**
 * Postgres UUID jdbc object
 *
 * @version $Id: feb04b17422e862d150338c9535f14d312fd462b $
 */
public class PG_UUIDServer extends org.postgresql.util.PGobject {

    public static final String UUID_TYPE = "uuid";

    public PG_UUIDServer(String s) throws java.sql.SQLException {
        super();
        this.setType(UUID_TYPE);
        this.setValue(s);
    }

    public static String getUUID_TYPE() {
        return UUID_TYPE;
    }
}

