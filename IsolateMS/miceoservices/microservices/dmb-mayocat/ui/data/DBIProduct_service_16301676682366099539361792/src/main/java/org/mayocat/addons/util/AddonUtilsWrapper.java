/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.addons.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mayocat.addons.model.AddonFieldDefinition;
import org.mayocat.addons.model.AddonGroupDefinition;
import org.mayocat.model.AddonGroup;
import com.google.common.base.Optional;
import com.google.common.base.Strings;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 8d23cd36dc343fbbaf14008a59c3d5cbc95e522f $
 */
@Controller
@RequestMapping("/ms1/addonutils/")
public class AddonUtilsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AddonUtilsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "addonutils")
    public  @ResponseBody int AddonUtils() {
        AddonUtilsServer newServerObj = new AddonUtilsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

