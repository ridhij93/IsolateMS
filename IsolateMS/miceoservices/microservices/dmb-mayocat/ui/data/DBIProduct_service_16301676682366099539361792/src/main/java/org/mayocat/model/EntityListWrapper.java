/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.mayocat.model.annotation.DoNotIndex;
import com.google.common.base.Objects;
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
 * Model for a list of {@link Entity}, which are entities themselves.
 *
 * @version $Id: 84a026521134347d16529e318808e978eeb18a02 $
 */
@Controller
@RequestMapping("/ms1/entitylist/")
public class EntityListWrapper {

    // FUTURE:
    // if we want to implement a "mixed" type (where entities in the list are of heterogeneous types), this list would
    // hold the individual types at the #entities list matching index.
    // private List<String> types;
    @RequestMapping(method = RequestMethod.GET, value = "getid")
    public @ResponseBody Integer getId(@RequestParam int callerId) {
        EntityListServer callerObj = idObjMap.get(callerId);
        UUID result = callerObj.getId();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getslug")
    public @ResponseBody String getSlug(@RequestParam int callerId) {
        EntityListServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getSlug();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getentities")
    public @ResponseBody Integer getEntities(@RequestParam int callerId) {
        EntityListServer callerObj = idObjMap.get(callerId);
        List<UUID> result = callerObj.getEntities();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "gethint")
    public @ResponseBody String getHint(@RequestParam int callerId) {
        EntityListServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getHint();
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, EntityListServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "entitylist")
    public  @ResponseBody int EntityList() {
        EntityListServer newServerObj = new EntityListServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

