/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.store.jdbi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.mayocat.shop.billing.model.stats.TurnoverStatEntry;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: aaf81f8ade59a583e820795c9b7cb1c24e4315b9 $
 */
public class TurnoverStatEntryMapper implements ResultSetMapper<TurnoverStatEntry> {

    @Override
    public TurnoverStatEntry map(int index, ResultSet resultSet, StatementContext ctx) throws SQLException {
        return (TurnoverStatEntry) null;
    }

    public int id = 0;

    public static TurnoverStatEntryMapper getObject(int id) {
        TurnoverStatEntryMapper obj = (TurnoverStatEntryMapper) new Object();
        obj.id = id;
        return obj;
    }
}

