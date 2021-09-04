/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.search;

import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.search.EntityIndexDocumentPurveyor;
import org.mayocat.search.elasticsearch.AbstractGenericEntityIndexDocumentPurveyor;
import org.mayocat.shop.catalog.model.Collection;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.store.CollectionStore;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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
 * @version $Id: 9bcf0394a17a119d44146a0aa21520975256c042 $
 */
@Component
public class ProductIndexDocumentPurveyorWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ProductIndexDocumentPurveyorServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "productindexdocumentpurveyor")
    public  @ResponseBody int ProductIndexDocumentPurveyor() {
        ProductIndexDocumentPurveyorServer newServerObj = new ProductIndexDocumentPurveyorServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

