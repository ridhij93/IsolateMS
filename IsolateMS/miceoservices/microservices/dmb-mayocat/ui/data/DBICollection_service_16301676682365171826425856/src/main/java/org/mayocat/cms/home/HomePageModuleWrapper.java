/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.home;

import java.util.ArrayList;
import java.util.List;
import org.mayocat.Module;
import org.mayocat.cms.home.meta.HomePageEntity;
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
 * @version $Id: ac66a567ed1c69d2947881ba8a296bcc187fe443 $
 */
@Controller
@RequestMapping("/ms0/homepagemodule/")
public class HomePageModuleWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, HomePageModuleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "homepagemodule")
    public  @ResponseBody int HomePageModule() {
        HomePageModuleServer newServerObj = new HomePageModuleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

