/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.model;

import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.Association;
import org.mayocat.model.Child;
import org.mayocat.model.Entity;
import org.mayocat.model.HasAddons;
import org.mayocat.model.HasFeaturedImage;
import org.mayocat.model.Localized;
import org.mayocat.model.annotation.Index;
import org.mayocat.model.annotation.LocalizedField;
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
@RequestMapping("/ms2/collection/")
public class CollectionWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getid")
    public @ResponseBody Integer getId(@RequestParam int callerId) {
        CollectionServer callerObj = idObjMap.get(callerId);
        UUID result = callerObj.getId();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getparentid")
    public @ResponseBody Integer getParentId(@RequestParam int callerId) {
        CollectionServer callerObj = idObjMap.get(callerId);
        UUID result = callerObj.getParentId();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getslug")
    public @ResponseBody String getSlug(@RequestParam int callerId) {
        CollectionServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getSlug();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "gettitle")
    public @ResponseBody String getTitle(@RequestParam int callerId) {
        CollectionServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getTitle();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getdescription")
    public @ResponseBody String getDescription(@RequestParam int callerId) {
        CollectionServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getDescription();
        return result;
    }

    // //////////////////////////////////////////////
    private static int maxId = 0;

    public static HashMap<Integer, CollectionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "collection")
    public  @ResponseBody int Collection() {
        CollectionServer newServerObj = new CollectionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "collection")
    public  @ResponseBody int Collection(@RequestParam int idId) {
        CollectionServer newServerObj = new CollectionServer(UUID.getObject(idId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // //////////////////////////////////////////////
}

