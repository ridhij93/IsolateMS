/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.multitenancy;

import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.configuration.MultitenancySettings;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
import com.sun.jersey.spi.resource.Singleton;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Singleton
@Component
public class TenantResolverProviderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TenantResolverProviderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tenantresolverprovider")
    public  @ResponseBody int TenantResolverProvider() {
        TenantResolverProviderServer newServerObj = new TenantResolverProviderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

