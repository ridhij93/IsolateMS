/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.util;

import org.apache.commons.lang3.StringEscapeUtils;
import com.google.common.base.Strings;
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
 * @version $Id: 76de1f464f20a161a37f5f0a9a25ab375f6a271a $
 */
@Controller
@RequestMapping("/ms1/contextutils/")
public class ContextUtilsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ContextUtilsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "contextutils")
    public  @ResponseBody int ContextUtils() {
        ContextUtilsServer newServerObj = new ContextUtilsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

