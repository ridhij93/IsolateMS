/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog;

import java.util.ArrayList;
import java.util.List;
import org.mayocat.meta.EntityMeta;
import org.mayocat.Module;
import org.mayocat.shop.catalog.meta.CollectionEntity;
import org.mayocat.shop.catalog.meta.ProductEntity;
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
 * @version $Id: 94bb8d51f0fa23572f404d5ada1b8a6a4e17aff3 $
 */
@Controller
@RequestMapping("/ms0/catalogmodule/")
public class CatalogModuleWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CatalogModuleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "catalogmodule")
    public  @ResponseBody int CatalogModule() {
        CatalogModuleServer newServerObj = new CatalogModuleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

