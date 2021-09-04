/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.store.TenantStore;
import org.mayocat.context.WebContext;
import org.mayocat.entity.DataLoaderAssistant;
import org.mayocat.entity.EntityData;
import org.mayocat.entity.LoadingOption;
import org.mayocat.model.Entity;
import org.mayocat.model.Owned;
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
 * @version $Id: 7f0b406dd9bf02f29bfa09d76b092bb931449f5a $
 */
@Component("tenant")
public class TenantDataLoaderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TenantDataLoaderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tenantdataloader")
    public  @ResponseBody int TenantDataLoader() {
        TenantDataLoaderServer newServerObj = new TenantDataLoaderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

