/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.meta;

import org.mayocat.meta.EntityMeta;
import org.mayocat.shop.catalog.model.Collection;
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
 * @version $Id: cb2870c26ba471ac2a36c10ee5df43eeb581f099 $
 */
@Controller
@RequestMapping("/ms1/collectionentity/")
public class CollectionEntityWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CollectionEntityServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "collectionentity")
    public  @ResponseBody int CollectionEntity() {
        CollectionEntityServer newServerObj = new CollectionEntityServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

