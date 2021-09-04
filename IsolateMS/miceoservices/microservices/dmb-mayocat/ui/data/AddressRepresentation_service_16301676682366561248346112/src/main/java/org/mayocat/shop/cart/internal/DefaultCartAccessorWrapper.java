/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart.internal;

import javax.inject.Inject;
import org.mayocat.configuration.ConfigurationService;
import org.mayocat.context.WebContext;
import org.mayocat.context.scope.Session;
import org.mayocat.shop.cart.CartAccessor;
import org.mayocat.shop.cart.CartInSessionConverter;
import org.mayocat.shop.cart.CartContents;
import org.mayocat.shop.cart.CartInSession;
import org.mayocat.shop.catalog.configuration.shop.CatalogSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 * @version $Id: 90395def851155894113fe4943ddf785de58f94b $
 */
@Component
public class DefaultCartAccessorWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultCartAccessorServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultcartaccessor")
    public  @ResponseBody int DefaultCartAccessor() {
        DefaultCartAccessorServer newServerObj = new DefaultCartAccessorServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

