/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.meta;

import org.mayocat.meta.EntityMeta;
import org.mayocat.shop.catalog.model.Product;
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
 * @version $Id: fa3f2f538830a19371ee8496b5a87951c5baba7e $
 */
@Controller
@RequestMapping("/ms1/productentity/")
public class ProductEntityWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ProductEntityServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "productentity")
    public  @ResponseBody int ProductEntity() {
        ProductEntityServer newServerObj = new ProductEntityServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

