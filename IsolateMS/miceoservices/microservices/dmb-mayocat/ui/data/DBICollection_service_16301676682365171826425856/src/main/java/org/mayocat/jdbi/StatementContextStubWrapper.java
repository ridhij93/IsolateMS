/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.jdbi;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;
import org.skife.jdbi.v2.Binding;
import org.skife.jdbi.v2.Cleanable;
import org.skife.jdbi.v2.StatementContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * StatementContext stub to allow using JDBi mappers in flyway JDBC migrations.
 *
 * NOTE: of course, since this stub does nothing, it might break some mappers that rely on the statement context.
 * Use at your own risk for mappers that you know won't break with a stub context.
 *
 * @version $Id: ce0e9e92fbf96599005705b84c9678e9271e7168 $
 */
@Controller
@RequestMapping("/ms0/statementcontextstub/")
public class StatementContextStubWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, StatementContextStubServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "statementcontextstub")
    public  @ResponseBody int StatementContextStub() {
        StatementContextStubServer newServerObj = new StatementContextStubServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

