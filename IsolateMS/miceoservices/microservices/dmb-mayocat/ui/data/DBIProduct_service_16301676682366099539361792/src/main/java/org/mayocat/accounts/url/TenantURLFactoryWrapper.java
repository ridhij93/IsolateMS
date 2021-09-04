/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.url;

import java.net.MalformedURLException;
import java.net.URL;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.context.WebContext;
import org.mayocat.url.EntityURLFactory;
import org.mayocat.url.URLHelper;
import org.mayocat.url.URLType;
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
 * @version $Id: 5da1a269d67102542c503ca560ef904fd8adfd70 $
 */
@Component
public class TenantURLFactoryWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TenantURLFactoryServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tenanturlfactory")
    public  @ResponseBody int TenantURLFactory() {
        TenantURLFactoryServer newServerObj = new TenantURLFactoryServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

