/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.internal;

import java.util.Map;
import com.google.common.reflect.TypeToken;
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
 * @version $Id: cf6d6ff7c7b6e37a0b88cb53b8627410c41c06a1 $
 */
@Controller
@RequestMapping("/ms0/configurationmerger/")
public class ConfigurationMergerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ConfigurationMergerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "configurationmerger")
    public  @ResponseBody int ConfigurationMerger() {
        ConfigurationMergerServer newServerObj = new ConfigurationMergerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

