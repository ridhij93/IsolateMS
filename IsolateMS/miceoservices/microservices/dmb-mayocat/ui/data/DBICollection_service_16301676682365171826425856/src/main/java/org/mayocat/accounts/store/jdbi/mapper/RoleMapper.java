/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.store.jdbi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.mayocat.accounts.model.Role;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RoleMapper implements ResultSetMapper<Role> {

    @Override
    public Role map(int index, ResultSet result, StatementContext context) throws SQLException {
        return (Role) null;
    }

    public int id = 0;

    public static RoleMapper getObject(int id) {
        RoleMapper obj = (RoleMapper) new Object();
        obj.id = id;
        return obj;
    }
}

