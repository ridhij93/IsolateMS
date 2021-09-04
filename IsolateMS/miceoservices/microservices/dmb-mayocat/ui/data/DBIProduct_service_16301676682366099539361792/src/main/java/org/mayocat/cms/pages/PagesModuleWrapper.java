/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.pages;

import java.util.ArrayList;
import java.util.List;
import org.mayocat.meta.EntityMeta;
import org.mayocat.Module;
import org.mayocat.cms.pages.meta.PageEntity;
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
 * @version $Id: a33bdedb85a459bc6f073a5e6a3065726440ccf3 $
 */
@Controller
@RequestMapping("/ms1/pagesmodule/")
public class PagesModuleWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PagesModuleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "pagesmodule")
    public  @ResponseBody int PagesModule() {
        PagesModuleServer newServerObj = new PagesModuleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

