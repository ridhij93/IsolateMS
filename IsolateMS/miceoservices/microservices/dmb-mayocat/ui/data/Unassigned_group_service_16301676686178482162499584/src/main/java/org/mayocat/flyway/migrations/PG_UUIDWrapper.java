/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.flyway.migrations;

import java.sql.SQLException;
import java.util.UUID;
import org.postgresql.util.PGobject;
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
 * Postgres UUID PGObject
 *
 * @version $Id: 0687432bfa517fcec50a9568cf533a6f55a783e4 $
 */
@Controller
@RequestMapping("/ms5/pg_uuid/")
public class PG_UUIDWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PG_UUIDServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "pg_uuid")
    public  @ResponseBody int PG_UUID(@RequestParam int idId) {
        PG_UUIDServer newServerObj = new PG_UUIDServer(UUID.getObject(idId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "pg_uuid")
    public  @ResponseBody int PG_UUID(@RequestParam String s) {
        PG_UUIDServer newServerObj = new PG_UUIDServer(s);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

