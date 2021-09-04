/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.argument;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.Argument;
import org.skife.jdbi.v2.tweak.ArgumentFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: a7fb9445414516110ab50f7663a583703d2b57df $
 */
public class MapAsJsonStringArgumentFactory implements ArgumentFactory<Map> {

    @Override
    public boolean accepts(Class<?> expectedType, Object value, StatementContext ctx) {
        return (Boolean) null;
    }

    @Override
    public Argument build(Class<?> expectedType, final Map value, StatementContext ctx) {
        return (Argument) null;
    }

    public int id = 0;

    public static MapAsJsonStringArgumentFactory getObject(int id) {
        MapAsJsonStringArgumentFactory obj = (MapAsJsonStringArgumentFactory) new Object();
        obj.id = id;
        return obj;
    }
}

