/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.entity;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mayocat.model.Entity;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
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
 * @version $Id: bc3fb292fbd15a55c9aa1fb304b53ea711c4bdda $
 */
@Controller
@RequestMapping("/ms2/entitydata/")
public class EntityDataWrapper<T extends Entity> {

    private static int maxId = 0;

    public static HashMap<Integer, EntityDataServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "entitydata")
    public  @ResponseBody int EntityData(@RequestParam int entityId) {
        EntityDataServer newServerObj = new EntityDataServer(T.getObject(entityId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

