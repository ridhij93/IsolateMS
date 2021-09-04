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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Abstract class that fixes NULL featured image id for an entity table (such as articles, pages, etc.)
 *
 * Extending class must just precise the table name to fix NULL featured image id for.
 *
 * @version $Id: c2c98d22d20b8a6b861bbb69cb2e2e1c345c4042 $
 */
public abstract class AbstractFixNullFeaturedImageMigration {

    public void migrate(Connection connection) throws Exception {
        return;
    }

    public abstract String getTableName() {
        return (String) null;
    }

    public int id = 0;

    public static AbstractFixNullFeaturedImageMigration getObject(int id) {
        AbstractFixNullFeaturedImageMigration obj = (AbstractFixNullFeaturedImageMigration) new Object();
        obj.id = id;
        return obj;
    }
}

