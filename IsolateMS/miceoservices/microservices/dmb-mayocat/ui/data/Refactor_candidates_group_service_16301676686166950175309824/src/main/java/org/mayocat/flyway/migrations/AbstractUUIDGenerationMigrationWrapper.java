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
 * @version $Id: 53c86c29095f7154688feaf3338232de085322b6 $
 */
@Controller
@RequestMapping("/ms3/abstractuuidgenerationmigration/")
public abstract class AbstractUUIDGenerationMigrationWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AbstractUUIDGenerationMigrationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "abstractuuidgenerationmigration")
    public  @ResponseBody int AbstractUUIDGenerationMigration() {
        AbstractUUIDGenerationMigrationServer newServerObj = new AbstractUUIDGenerationMigrationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

