/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.pages.meta;

import org.mayocat.meta.EntityMeta;
import org.mayocat.cms.pages.model.Page;
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
 * @version $Id: 71b3eb4d9726aba270ba90f7f0fba8fba009e985 $
 */
@Controller
@RequestMapping("/ms2/pageentity/")
public class PageEntityWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PageEntityServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "pageentity")
    public  @ResponseBody int PageEntity() {
        PageEntityServer newServerObj = new PageEntityServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

