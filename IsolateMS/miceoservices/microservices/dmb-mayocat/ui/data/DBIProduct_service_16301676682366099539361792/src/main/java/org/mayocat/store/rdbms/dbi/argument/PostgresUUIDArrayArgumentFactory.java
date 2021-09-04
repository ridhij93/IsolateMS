/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.argument;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.mayocat.store.rdbms.dbi.argument.pg.PG_UUID;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.Argument;
import org.skife.jdbi.v2.tweak.ArgumentFactory;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Argument factory for a list of UUID.
 *
 * @version $Id: 75bae0d9af86a4ce61a47cdcd04122173c5cbed3 $
 */
public class PostgresUUIDArrayArgumentFactory implements ArgumentFactory<List<UUID>> {

    @Override
    public boolean accepts(Class<?> expectedType, Object value, StatementContext ctx) {
        return (Boolean) null;
    }

    @Override
    public Argument build(Class<?> expectedType, final List<UUID> value, StatementContext ctx) {
        return (Argument) null;
    }

    public int id = 0;

    public static PostgresUUIDArrayArgumentFactory getObject(int id) {
        PostgresUUIDArrayArgumentFactory obj = (PostgresUUIDArrayArgumentFactory) new Object();
        obj.id = id;
        return obj;
    }
}

