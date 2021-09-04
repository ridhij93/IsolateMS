/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.news.model;

import java.util.Date;
import java.util.Map;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.Association;
import org.mayocat.model.Entity;
import org.mayocat.model.HasAddons;
import org.mayocat.model.HasFeaturedImage;
import org.mayocat.model.HasModel;
import org.mayocat.model.annotation.Index;
import org.mayocat.model.annotation.LocalizedField;
import org.mayocat.model.annotation.PluralForm;
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
 * @version $Id: 2dce76e3299ee0e977d20a9a486b562f66ac4df1 $
 */
@PluralForm("news")
public class ArticleWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getid")
    public @ResponseBody Integer getId(@RequestParam int callerId) {
        ArticleServer callerObj = idObjMap.get(callerId);
        UUID result = callerObj.getId();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getslug")
    public @ResponseBody String getSlug(@RequestParam int callerId) {
        ArticleServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getSlug();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "gettitle")
    public @ResponseBody String getTitle(@RequestParam int callerId) {
        ArticleServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getTitle();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getcontent")
    public @ResponseBody String getContent(@RequestParam int callerId) {
        ArticleServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getContent();
        return result;
    }

    // //////////////////////////////////////////////
    private static int maxId = 0;

    public static HashMap<Integer, ArticleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "article")
    public  @ResponseBody int Article() {
        ArticleServer newServerObj = new ArticleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "article")
    public  @ResponseBody int Article(@RequestParam int idId) {
        ArticleServer newServerObj = new ArticleServer(UUID.getObject(idId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // //////////////////////////////////////////////
}

