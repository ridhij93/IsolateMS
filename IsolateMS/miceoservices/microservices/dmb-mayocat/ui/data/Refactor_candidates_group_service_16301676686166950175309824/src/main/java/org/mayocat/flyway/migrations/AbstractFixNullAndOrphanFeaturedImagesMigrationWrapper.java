/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.flyway.migrations;

import java.sql.Connection;
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
 * Abstract class that fixes NULL featured image id for an entity table (such as articles, pages, etc.)
 *
 * Extending class must just precise the table name to fix NULL featured image id for.
 *
 * @version $Id: 597a162ca85ff0978f6a30c9ebaebfc46da4ffd7 $
 */
@Controller
@RequestMapping("/ms3/abstractfixnullandorphanfeaturedimagesmigration/")
public abstract class AbstractFixNullAndOrphanFeaturedImagesMigrationWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AbstractFixNullAndOrphanFeaturedImagesMigrationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "abstractfixnullandorphanfeaturedimagesmigration")
    public  @ResponseBody int AbstractFixNullAndOrphanFeaturedImagesMigration() {
        AbstractFixNullAndOrphanFeaturedImagesMigrationServer newServerObj = new AbstractFixNullAndOrphanFeaturedImagesMigrationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

