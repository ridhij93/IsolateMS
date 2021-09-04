/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.model;

import java.util.Date;
import java.util.Map;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotBlank;
import org.mayocat.image.model.Image;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.Association;
import org.mayocat.model.Entity;
import org.mayocat.model.HasAddons;
import org.mayocat.model.HasFeaturedImage;
import org.mayocat.model.annotation.Index;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Objects;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ms0/tenant/")
public class TenantWrapper {

    // FIXME
    // /////////////////////////////////////////////////
    // /////////////////////////////////////////////////
    @RequestMapping(method = RequestMethod.GET, value = "getslug")
    public @ResponseBody String getSlug(@RequestParam int callerId) {
        TenantServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getSlug();
        return result;
    }

    // ///////////////////////////////////////////////////////////
    private static int maxId = 0;

    public static HashMap<Integer, TenantServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tenant")
    public  @ResponseBody int Tenant() {
        TenantServer newServerObj = new TenantServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "tenant")
    public  @ResponseBody int Tenant(@RequestParam String slug, @RequestParam int configurationId) {
        TenantServer newServerObj = new TenantServer(slug, TenantConfiguration.getObject(configurationId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "tenant")
    public  @ResponseBody int Tenant(@RequestParam int idId, @RequestParam String slug, @RequestParam int configurationId) {
        TenantServer newServerObj = new TenantServer(UUID.getObject(idId), slug, TenantConfiguration.getObject(configurationId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // ///////////////////////////////////////////////////////////
}

