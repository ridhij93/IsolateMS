/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.model;

import java.util.UUID;
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
 * Bridges a product to a collection
 *
 * @version $Id: dc911a819d838c9363edddda6b612b1e3184e556 $
 */
@Controller
@RequestMapping("/ms1/productcollection/")
public class ProductCollectionWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getproductid")
    public @ResponseBody Integer getProductId(@RequestParam int callerId) {
        ProductCollectionServer callerObj = idObjMap.get(callerId);
        UUID result = callerObj.getProductId();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getcollectionid")
    public @ResponseBody Integer getCollectionId(@RequestParam int callerId) {
        ProductCollectionServer callerObj = idObjMap.get(callerId);
        UUID result = callerObj.getCollectionId();
        return result.id;
    }

    private static int maxId = 0;

    public static HashMap<Integer, ProductCollectionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "productcollection")
    public  @ResponseBody int ProductCollection(@RequestParam int productIdId, @RequestParam int collectionIdId) {
        ProductCollectionServer newServerObj = new ProductCollectionServer(UUID.getObject(productIdId), UUID.getObject(collectionIdId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

