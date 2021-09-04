/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.attachment.model;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.mayocat.model.Child;
import org.mayocat.model.Entity;
import org.mayocat.model.Localized;
import org.mayocat.model.annotation.LocalizedField;
import com.google.common.base.Objects;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 08724e69a979b7d256d45ee798f62c53f7af1467 $
 */
@Controller
@RequestMapping("/ms1/attachment/")
public class AttachmentWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getslug")
    public @ResponseBody String getSlug(@RequestParam int callerId) {
        AttachmentServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getSlug();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getid")
    public @ResponseBody Integer getId(@RequestParam int callerId) {
        AttachmentServer callerObj = idObjMap.get(callerId);
        UUID result = callerObj.getId();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "gettitle")
    public @ResponseBody String getTitle(@RequestParam int callerId) {
        AttachmentServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getTitle();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getdescription")
    public @ResponseBody String getDescription(@RequestParam int callerId) {
        AttachmentServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getDescription();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getextension")
    public @ResponseBody String getExtension(@RequestParam int callerId) {
        AttachmentServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getExtension();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getmetadata")
    public @ResponseBody Integer getMetadata(@RequestParam int callerId) {
        AttachmentServer callerObj = idObjMap.get(callerId);
        Map<String, Map<String, Object>> result = callerObj.getMetadata();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getparentid")
    public @ResponseBody Integer getParentId(@RequestParam int callerId) {
        AttachmentServer callerObj = idObjMap.get(callerId);
        UUID result = callerObj.getParentId();
        return result.id;
    }

    // //////////////////////////////////////////////
    // //////////////////////////////////////////////
    private static int maxId = 0;

    public static HashMap<Integer, AttachmentServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "attachment")
    public  @ResponseBody int Attachment() {
        AttachmentServer newServerObj = new AttachmentServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // //////////////////////////////////////////////
    // //////////////////////////////////////////////
}

