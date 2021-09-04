/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.argument;

import java.util.UUID;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.Argument;
import org.skife.jdbi.v2.tweak.ArgumentFactory;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 811b46f7ab89cd674d195a35d30654de8581a341 $
 */
public class PostgresUUIDArgumentFactory implements ArgumentFactory<UUID> {

    @Override
    public boolean accepts(Class<?> expectedType, Object value, StatementContext ctx) {
        return (Boolean) null;
    }

    @Override
    public Argument build(Class<?> expectedType, UUID value, StatementContext ctx) {
        return (Argument) null;
    }

    public int id = 0;

    public static PostgresUUIDArgumentFactory getObject(int id) {
        PostgresUUIDArgumentFactory obj = (PostgresUUIDArgumentFactory) new Object();
        obj.id = id;
        return obj;
    }
}

