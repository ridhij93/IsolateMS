/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.home.model;

import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.Association;
import org.mayocat.model.Entity;
import org.mayocat.model.HasAddons;
import org.mayocat.model.Localized;
import org.mayocat.model.annotation.DoNotIndex;
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

/**
 * @version $Id: 9239b0c2cf1d39475a81432b2f53d3b4f0c1a507 $
 */
@Controller
@RequestMapping("/ms1/homepage/")
public class HomePageWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getid")
    public @ResponseBody Integer getId(@RequestParam int callerId) {
        HomePageServer callerObj = idObjMap.get(callerId);
        UUID result = callerObj.getId();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getslug")
    public @ResponseBody String getSlug(@RequestParam int callerId) {
        HomePageServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getSlug();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getaddons")
    public @ResponseBody Integer getAddons(@RequestParam int callerId) {
        HomePageServer callerObj = idObjMap.get(callerId);
        Association<Map<String, AddonGroup>> result = callerObj.getAddons();
        return result.id;
    }

    // //////////////////////////////////////////////
    private static int maxId = 0;

    public static HashMap<Integer, HomePageServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "homepage")
    public  @ResponseBody int HomePage() {
        HomePageServer newServerObj = new HomePageServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // //////////////////////////////////////////////
}

