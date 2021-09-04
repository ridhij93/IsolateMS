/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart.internal;

import java.util.Currency;
import javax.inject.Inject;
import org.mayocat.localization.EntityLocalizationService;
import org.mayocat.shop.cart.CartInSessionConverter;
import org.mayocat.shop.cart.CartContents;
import org.mayocat.shop.cart.CartInSession;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.store.ProductStore;
import org.mayocat.shop.taxes.Taxable;
import org.slf4j.Logger;
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
 * @version $Id: e4ad1fb5bb36e67f43988b44239531e2da46148a $
 */
@Component
public class DefaultCartInSessionConverterWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultCartInSessionConverterServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultcartinsessionconverter")
    public  @ResponseBody int DefaultCartInSessionConverter() {
        DefaultCartInSessionConverterServer newServerObj = new DefaultCartInSessionConverterServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

