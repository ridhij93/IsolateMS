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
 * Fix NULL and orphan featured images id for articles
 *
 * @version $Id: 698aba70e4748eb147db4a809c8718bfd8411788 $
 */
@Controller
@RequestMapping("/ms5/v0300_1011__fix_article_null_and_orphan_featured_images/")
public class V0300_1011__fix_article_null_and_orphan_featured_imagesWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, V0300_1011__fix_article_null_and_orphan_featured_imagesServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "v0300_1011__fix_article_null_and_orphan_featured_images")
    public  @ResponseBody int V0300_1011__fix_article_null_and_orphan_featured_images() {
        V0300_1011__fix_article_null_and_orphan_featured_imagesServer newServerObj = new V0300_1011__fix_article_null_and_orphan_featured_imagesServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

