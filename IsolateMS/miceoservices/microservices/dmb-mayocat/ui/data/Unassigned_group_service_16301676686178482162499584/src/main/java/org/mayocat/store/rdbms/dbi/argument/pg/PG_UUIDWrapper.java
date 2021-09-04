/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.argument.pg;

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
 * Postgres UUID jdbc object
 *
 * @version $Id: feb04b17422e862d150338c9535f14d312fd462b $
 */
@Controller
@RequestMapping("/ms5/pg_uuid/")
public class PG_UUIDWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PG_UUIDServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "pg_uuid")
    public  @ResponseBody int PG_UUID(@RequestParam String s) {
        PG_UUIDServer newServerObj = new PG_UUIDServer(s);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

