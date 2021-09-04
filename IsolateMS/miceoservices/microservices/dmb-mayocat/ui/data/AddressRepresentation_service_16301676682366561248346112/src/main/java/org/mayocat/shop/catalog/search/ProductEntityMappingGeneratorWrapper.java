/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.search;

import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import org.mayocat.search.elasticsearch.AbstractGenericEntityMappingGenerator;
import org.mayocat.search.elasticsearch.EntityMappingGenerator;
import org.mayocat.shop.catalog.model.Product;
import org.xwiki.component.annotation.Component;
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
 * @version $Id: 0bfb22f0c5051b48aaf1a05f4016872aef1716cb $
 */
@Component("product")
public class ProductEntityMappingGeneratorWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ProductEntityMappingGeneratorServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "productentitymappinggenerator")
    public  @ResponseBody int ProductEntityMappingGenerator() {
        ProductEntityMappingGeneratorServer newServerObj = new ProductEntityMappingGeneratorServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

