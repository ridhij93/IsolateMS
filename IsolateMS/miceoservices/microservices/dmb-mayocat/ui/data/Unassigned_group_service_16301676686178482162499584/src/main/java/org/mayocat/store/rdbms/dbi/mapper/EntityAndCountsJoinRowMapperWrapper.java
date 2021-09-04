/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.mapper;

import java.util.Map;
import org.mayocat.store.rdbms.dbi.jointype.EntityAndCountsJoinRow;
import com.google.common.collect.ImmutableMap;
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
 * @version $Id: db808f97025438d3de834b6db7b97f99d0be473b $
 */
@Controller
@RequestMapping("/ms5/entityandcountsjoinrowmapper/")
public class EntityAndCountsJoinRowMapperWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, EntityAndCountsJoinRowMapperServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "entityandcountsjoinrowmapper")
    public  @ResponseBody int EntityAndCountsJoinRowMapper() {
        EntityAndCountsJoinRowMapperServer newServerObj = new EntityAndCountsJoinRowMapperServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

