/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.extraction;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.mayocat.util.StringUtil;
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
 * @version $Id: f77c88f3d502daf025fef60cb6adf4523b398682 $
 */
@Controller
@RequestMapping("/ms5/entityextractor/")
public class EntityExtractorWrapper<E> {

    private static int maxId = 0;

    public static HashMap<Integer, EntityExtractorServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "entityextractor")
    public  @ResponseBody int EntityExtractor() {
        EntityExtractorServer newServerObj = new EntityExtractorServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

