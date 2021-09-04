/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.views;

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
 * @version $Id: dba2b6a896c4142ffddb8746abde26786f08af29 $
 */
@Controller
@RequestMapping("/ms5/template/")
public class TemplateWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TemplateServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "template")
    public  @ResponseBody int Template(@RequestParam String id, @RequestParam String content) {
        TemplateServer newServerObj = new TemplateServer(id, content);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "template")
    public  @ResponseBody int Template(@RequestParam String id, @RequestParam String content, @RequestParam boolean partial) {
        TemplateServer newServerObj = new TemplateServer(id, content, partial);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

