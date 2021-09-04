/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.memory;

import java.util.UUID;
import org.mayocat.model.Identifiable;
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
 * Default positioned entity for memory stores.
 *
 * @version $Id: e7e3d025e48f056d0149d921c86a934a82afbadf $
 */
@Controller
@RequestMapping("/ms2/defaultpositionedentity/")
public class DefaultPositionedEntityWrapper<T extends Identifiable> {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultPositionedEntityServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultpositionedentity")
    public  @ResponseBody int DefaultPositionedEntity(@RequestParam int entityId, @RequestParam Integer position) {
        DefaultPositionedEntityServer newServerObj = new DefaultPositionedEntityServer(T.getObject(entityId), position);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

