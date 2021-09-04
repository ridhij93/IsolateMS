/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.ImmutableMap;
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
 * @version $Id: 4c70951d3f15c43d6f0139ef32c04c9dd75ae313 $
 */
@Controller
@RequestMapping("/ms1/tenantconfiguration/")
public class TenantConfigurationWrapper {

    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static int maxId = 0;

    public static HashMap<Integer, TenantConfigurationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tenantconfiguration")
    public  @ResponseBody int TenantConfiguration() {
        TenantConfigurationServer newServerObj = new TenantConfigurationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "tenantconfiguration")
    public  @ResponseBody int TenantConfiguration(@RequestParam final Integer version) {
        TenantConfigurationServer newServerObj = new TenantConfigurationServer(version);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "tenantconfiguration")
    public  @ResponseBody int TenantConfiguration(@RequestParam final Integer version, @RequestParam final int dataId) {
    }
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

