/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.migrations;

import org.mayocat.flyway.migrations.AbstractFixNullAndOrphanFeaturedImagesMigration;
import com.googlecode.flyway.core.api.migration.jdbc.JdbcMigration;

/**
 * Fix NULL and orphan featured image id for collections
 *
 * @version $Id: 2454d6cbe0b9859062836a827c8087a92d6fa6cc $
 */
public class V0300_1021__fix_collection_null_and_orphan_featured_imagesServer extends AbstractFixNullAndOrphanFeaturedImagesMigration implements JdbcMigration {

    @Override
    public String getTableName() {
        return "product";
    }
}

