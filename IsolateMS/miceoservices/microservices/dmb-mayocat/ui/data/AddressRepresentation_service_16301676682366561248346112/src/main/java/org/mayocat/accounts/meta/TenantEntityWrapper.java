/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.meta;

import org.mayocat.accounts.model.Tenant;
import org.mayocat.meta.EntityMeta;
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
 * @version $Id: 7fc00443398e8fa56736817244aaa9cb7c8286e4 $
 */
@Controller
@RequestMapping("/ms2/tenantentity/")
public class TenantEntityWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TenantEntityServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tenantentity")
    public  @ResponseBody int TenantEntity() {
        TenantEntityServer newServerObj = new TenantEntityServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

