/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.migrations;

import org.mayocat.flyway.migrations.AbstractFixNullFeaturedImageMigration;
import com.googlecode.flyway.core.api.migration.jdbc.JdbcMigration;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Fix NULL featured image id for articles
 *
 * @version $Id: 65949aa758ad2ff8f5801bd44aec05c5d0c4da99 $
 */
public class V0100_0011__fix_article_null_featured_image_when_image_exists extends AbstractFixNullFeaturedImageMigration implements JdbcMigration {

    @Override
    public String getTableName() {
        return (String) null;
    }

    public int id = 0;

    public static V0100_0011__fix_article_null_featured_image_when_image_exists getObject(int id) {
        V0100_0011__fix_article_null_featured_image_when_image_exists obj = (V0100_0011__fix_article_null_featured_image_when_image_exists) new Object();
        obj.id = id;
        return obj;
    }
}

