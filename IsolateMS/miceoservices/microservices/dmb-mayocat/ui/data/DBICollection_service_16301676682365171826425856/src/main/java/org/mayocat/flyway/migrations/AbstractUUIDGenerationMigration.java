/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.flyway.migrations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.googlecode.flyway.core.api.migration.jdbc.JdbcMigration;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 53c86c29095f7154688feaf3338232de085322b6 $
 */
public abstract class AbstractUUIDGenerationMigration implements JdbcMigration {

    public void migrate(Connection connection) throws Exception {
        return;
    }

    public String getIdField() {
        return (String) null;
    }

    public String getUUIDField() {
        return (String) null;
    }

    public abstract List<String> getTableNames() {
        return (List<String>) null;
    }

    public abstract String getTransitionTableSuffix() {
        return (String) null;
    }

    public int id = 0;

    public static AbstractUUIDGenerationMigration getObject(int id) {
        AbstractUUIDGenerationMigration obj = (AbstractUUIDGenerationMigration) new Object();
        obj.id = id;
        return obj;
    }
}

