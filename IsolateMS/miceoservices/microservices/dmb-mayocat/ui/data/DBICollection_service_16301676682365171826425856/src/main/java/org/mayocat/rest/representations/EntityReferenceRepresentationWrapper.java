/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.representations;

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
 * @version $Id: d0248d25b5fd631f96a9f8947c511adb562e12dc $
 */
@Controller
@RequestMapping("/ms0/entityreferencerepresentation/")
public class EntityReferenceRepresentationWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, EntityReferenceRepresentationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "entityreferencerepresentation")
    public  @ResponseBody int EntityReferenceRepresentation() {
        EntityReferenceRepresentationServer newServerObj = new EntityReferenceRepresentationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "entityreferencerepresentation")
    public  @ResponseBody int EntityReferenceRepresentation(@RequestParam String href, @RequestParam String slug, @RequestParam String title) {
        EntityReferenceRepresentationServer newServerObj = new EntityReferenceRepresentationServer(href, slug, title);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

