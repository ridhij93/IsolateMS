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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * StatementContext stub to allow using JDBi mappers in flyway JDBC migrations.
 *
 * NOTE: of course, since this stub does nothing, it might break some mappers that rely on the statement context.
 * Use at your own risk for mappers that you know won't break with a stub context.
 *
 * @version $Id: ce0e9e92fbf96599005705b84c9678e9271e7168 $
 */
public class StatementContextStub implements StatementContext {

    @Override
    public Object setAttribute(String key, Object value) {
        return (Object) null;
    }

    @Override
    public Object getAttribute(String key) {
        return (Object) null;
    }

    @Override
    public Map<String, Object> getAttributes() {
        return (Map<String, Object>) null;
    }

    @Override
    public String getRawSql() {
        return (String) null;
    }

    @Override
    public String getRewrittenSql() {
        return (String) null;
    }

    @Override
    public String getLocatedSql() {
        return (String) null;
    }

    @Override
    public PreparedStatement getStatement() {
        return (PreparedStatement) null;
    }

    @Override
    public Connection getConnection() {
        return (Connection) null;
    }

    @Override
    public Binding getBinding() {
        return (Binding) null;
    }

    @Override
    public Class<?> getSqlObjectType() {
        return (Class<?>) null;
    }

    @Override
    public Method getSqlObjectMethod() {
        return (Method) null;
    }

    @Override
    public boolean isReturningGeneratedKeys() {
        return (Boolean) null;
    }

    @Override
    public void addCleanable(Cleanable cleanable) {
        return;
    }

    public int id = 0;

    public static StatementContextStub getObject(int id) {
        StatementContextStub obj = (StatementContextStub) new Object();
        obj.id = id;
        return obj;
    }
}

