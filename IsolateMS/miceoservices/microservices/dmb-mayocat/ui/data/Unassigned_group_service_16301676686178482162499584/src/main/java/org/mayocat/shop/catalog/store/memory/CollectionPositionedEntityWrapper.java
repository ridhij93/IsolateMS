/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.store.memory;

import java.util.ArrayList;
import java.util.List;
import org.mayocat.shop.catalog.model.Collection;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.store.memory.DefaultPositionedEntity;
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
 * Collection entity for memory store.
 *
 * @version $Id: 2fe1bedaaa7155bc4eb63d052d39ddeaae17b089 $
 */
@Controller
@RequestMapping("/ms5/collectionpositionedentity/")
public class CollectionPositionedEntityWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CollectionPositionedEntityServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "collectionpositionedentity")
    public  @ResponseBody int CollectionPositionedEntity(@RequestParam int entityId, @RequestParam Integer position, @RequestParam int productsId) {
    }
}

