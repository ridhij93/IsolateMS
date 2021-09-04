/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.home.meta;

import org.mayocat.cms.home.model.HomePage;
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
 * @version $Id: 7a53a5ae34e12fd4036efc99d64420b39f77b327 $
 */
@Controller
@RequestMapping("/ms2/homepageentity/")
public class HomePageEntityWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, HomePageEntityServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "homepageentity")
    public  @ResponseBody int HomePageEntity() {
        HomePageEntityServer newServerObj = new HomePageEntityServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

