/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.gestalt;

import java.util.Map;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.mayocat.configuration.MultitenancySettings;
import org.mayocat.configuration.SiteSettings;
import org.mayocat.context.WebContext;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Strings;
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
 * @version $Id: 2b9d4f9a64dd84ce162b34d346bce54d7cfccc18 $
 */
@Component("site")
public class SiteGestaltConfigurationSourceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, SiteGestaltConfigurationSourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "sitegestaltconfigurationsource")
    public  @ResponseBody int SiteGestaltConfigurationSource() {
        SiteGestaltConfigurationSourceServer newServerObj = new SiteGestaltConfigurationSourceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

