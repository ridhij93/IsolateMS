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
 * Fix NULL and orphan featured images id for products
 *
 * @version $Id: 52450b92d15511a9b94c4eb8514e8b8ed4ec385c $
 */
public class V0300_1020__fix_product_null_and_orphans_featured_imagesServer extends AbstractFixNullAndOrphanFeaturedImagesMigration implements JdbcMigration {

    @Override
    public String getTableName() {
        return "product";
    }
}

