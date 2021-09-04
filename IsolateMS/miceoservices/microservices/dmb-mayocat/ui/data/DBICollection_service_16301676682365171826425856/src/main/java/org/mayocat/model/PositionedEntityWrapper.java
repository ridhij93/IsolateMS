/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.model;

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
 * @version $Id: 0e5ddfba913350c86d44ac9ad450ed6078431eec $
 */
@Controller
@RequestMapping("/ms0/positionedentity/")
public class PositionedEntityWrapper<E extends Entity> {

    private static int maxId = 0;

    public static HashMap<Integer, PositionedEntityServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "positionedentity")
    public  @ResponseBody int PositionedEntity(@RequestParam int entityId, @RequestParam Integer position) {
        PositionedEntityServer newServerObj = new PositionedEntityServer(E.getObject(entityId), position);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

