/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.multitenancy;

import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import org.apache.commons.lang3.StringUtils;
import org.mayocat.configuration.MultitenancySettings;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.AccountsService;
import org.mayocat.configuration.SiteSettings;
import org.mayocat.store.EntityAlreadyExistsException;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Strings;
import com.google.common.net.InternetDomainName;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@Singleton
public class DefaultTenantResolverWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultTenantResolverServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaulttenantresolver")
    public  @ResponseBody int DefaultTenantResolver() {
        DefaultTenantResolverServer newServerObj = new DefaultTenantResolverServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

