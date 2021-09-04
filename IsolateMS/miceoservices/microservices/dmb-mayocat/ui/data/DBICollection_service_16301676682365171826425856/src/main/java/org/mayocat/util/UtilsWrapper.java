/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.util;

import java.lang.reflect.Type;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
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
 * @version $Id: 43c2dda627949e0c3d64b375f5a56e1e6d245ccc $
 */
@Controller
@RequestMapping("/ms0/utils/")
public class UtilsWrapper {

    /**
     * @param componentManager the component manager used by {@link #getComponent(Type)} and {@link #getComponent(Type,
     * String)}
     */
    @RequestMapping(method = RequestMethod.GET, value = "setcomponentmanager")
    public static @ResponseBody ResponseEntity<Void> setComponentManager(@RequestParam int componentManagerId) {
        UtilsServer.setComponentManager(ComponentManager.getObject(componentManagerId));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private static int maxId = 0;

    public static HashMap<Integer, UtilsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "utils")
    public  @ResponseBody int Utils() {
        UtilsServer newServerObj = new UtilsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

