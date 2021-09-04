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
 * @version $Id: c2c98d22d20b8a6b861bbb69cb2e2e1c345c4042 $
 */
@Controller
@RequestMapping("/ms3/abstractfixnullfeaturedimagemigration/")
public abstract class AbstractFixNullFeaturedImageMigrationWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AbstractFixNullFeaturedImageMigrationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "abstractfixnullfeaturedimagemigration")
    public  @ResponseBody int AbstractFixNullFeaturedImageMigration() {
        AbstractFixNullFeaturedImageMigrationServer newServerObj = new AbstractFixNullFeaturedImageMigrationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

