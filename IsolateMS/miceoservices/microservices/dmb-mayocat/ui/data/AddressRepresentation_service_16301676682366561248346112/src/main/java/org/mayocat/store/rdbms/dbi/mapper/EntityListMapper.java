/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.mapper;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.mayocat.model.EntityList;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Mapper for {@link EntityList}
 *
 * @version $Id: d9262ae26434d926b52b6f74237bd91b0c03f7ff $
 */
public class EntityListMapper implements ResultSetMapper<EntityList> {

    public EntityList map(int index, ResultSet resultSet, StatementContext ctx) throws SQLException {
        return (EntityList) null;
    }

    public int id = 0;

    public static EntityListMapper getObject(int id) {
        EntityListMapper obj = (EntityListMapper) new Object();
        obj.id = id;
        return obj;
    }
}

