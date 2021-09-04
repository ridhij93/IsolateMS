/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
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
 * @version $Id: 8af9ab474ca8413c008b7a8279ed1ea6bc2b5605 $
 */
@Controller
@RequestMapping("/ms1/entityutils/")
public class EntityUtilsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, EntityUtilsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "entityutils")
    public  @ResponseBody int EntityUtils() {
        EntityUtilsServer newServerObj = new EntityUtilsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

