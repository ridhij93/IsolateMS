/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.pages.model;

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
import org.mayocat.model.HasModel;
import org.mayocat.model.Localized;
import org.mayocat.model.annotation.Index;
import org.mayocat.model.annotation.LocalizedField;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
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
 * @version $Id: 1de4b0fbb8ae5066690048c187b4ab3c1dd7ad65 $
 */
@Controller
@RequestMapping("/ms1/page/")
public class PageWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getid")
    public @ResponseBody Integer getId(@RequestParam int callerId) {
        PageServer callerObj = idObjMap.get(callerId);
        UUID result = callerObj.getId();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getslug")
    public @ResponseBody String getSlug(@RequestParam int callerId) {
        PageServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getSlug();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getpublished")
    public @ResponseBody Boolean getPublished(@RequestParam int callerId) {
        PageServer callerObj = idObjMap.get(callerId);
        Boolean result = callerObj.getPublished();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "gettitle")
    public @ResponseBody String getTitle(@RequestParam int callerId) {
        PageServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getTitle();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getcontent")
    public @ResponseBody String getContent(@RequestParam int callerId) {
        PageServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getContent();
        return result;
    }

    // //////////////////////////////////////////////
    @RequestMapping(method = RequestMethod.GET, value = "getparentid")
    public @ResponseBody Integer getParentId(@RequestParam int callerId) {
        PageServer callerObj = idObjMap.get(callerId);
        UUID result = callerObj.getParentId();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getaddons")
    public @ResponseBody Integer getAddons(@RequestParam int callerId) {
        PageServer callerObj = idObjMap.get(callerId);
        Association<Map<String, AddonGroup>> result = callerObj.getAddons();
        return result.id;
    }

    // //////////////////////////////////////////////
    @RequestMapping(method = RequestMethod.GET, value = "equals")
    public  @ResponseBody boolean equals(@RequestParam int callerId, @RequestParam int objId) {
        PageServer callerObj = idObjMap.get(callerId);
        boolean result = callerObj.equals(Object.getObject(objId));
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "hashcode")
    public  @ResponseBody int hashCode(@RequestParam int callerId) {
        PageServer callerObj = idObjMap.get(callerId);
        int result = callerObj.hashCode();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "tostring")
    public @ResponseBody String toString(@RequestParam int callerId) {
        PageServer callerObj = idObjMap.get(callerId);
        String result = callerObj.toString();
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, PageServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "page")
    public  @ResponseBody int Page() {
        PageServer newServerObj = new PageServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "page")
    public  @ResponseBody int Page(@RequestParam int idId) {
        PageServer newServerObj = new PageServer(UUID.getObject(idId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

