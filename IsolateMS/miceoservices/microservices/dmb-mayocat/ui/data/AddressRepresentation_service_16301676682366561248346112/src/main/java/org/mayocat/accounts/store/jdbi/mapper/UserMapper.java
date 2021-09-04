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
import java.util.UUID;
import org.mayocat.accounts.model.User;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class UserMapper implements ResultSetMapper<User> {

    @Override
    public User map(int index, ResultSet result, StatementContext statementContext) throws SQLException {
        return (User) null;
    }

    public int id = 0;

    public static UserMapper getObject(int id) {
        UserMapper obj = (UserMapper) new Object();
        obj.id = id;
        return obj;
    }
}

