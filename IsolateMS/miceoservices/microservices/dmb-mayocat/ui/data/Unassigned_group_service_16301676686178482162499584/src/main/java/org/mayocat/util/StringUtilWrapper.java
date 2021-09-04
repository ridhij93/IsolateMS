/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.util;

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
 * @version $Id: a7f2ff62a50c6f8e4b271b68446ba30e00ece615 $
 */
@Controller
@RequestMapping("/ms5/stringutil/")
public class StringUtilWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, StringUtilServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "stringutil")
    public  @ResponseBody int StringUtil() {
        StringUtilServer newServerObj = new StringUtilServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

