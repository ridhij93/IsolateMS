/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.model.event;

import org.xwiki.observation.event.AbstractFilterableEvent;
import org.xwiki.observation.event.Event;
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
 * @version $Id: da4569a77dd7ec6b275b6a0db1d2b0cb729ff461 $
 */
@Controller
@RequestMapping("/ms2/entityupdatingevent/")
public class EntityUpdatingEventWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, EntityUpdatingEventServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "entityupdatingevent")
    public  @ResponseBody int EntityUpdatingEvent() {
        EntityUpdatingEventServer newServerObj = new EntityUpdatingEventServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

