/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.flyway.migrations;

import java.sql.Connection;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Abstract class that fixes NULL featured image id for an entity table (such as articles, pages, etc.)
 *
 * Extending class must just precise the table name to fix NULL featured image id for.
 *
 * @version $Id: 597a162ca85ff0978f6a30c9ebaebfc46da4ffd7 $
 */
public abstract class AbstractFixNullAndOrphanFeaturedImagesMigration {

    public void migrate(Connection connection) throws Exception {
        return;
    }

    public abstract String getTableName() {
        return (String) null;
    }

    public int id = 0;

    public static AbstractFixNullAndOrphanFeaturedImagesMigration getObject(int id) {
        AbstractFixNullAndOrphanFeaturedImagesMigration obj = (AbstractFixNullAndOrphanFeaturedImagesMigration) new Object();
        obj.id = id;
        return obj;
    }
}

