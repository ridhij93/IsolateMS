/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.theme;

import java.util.Collections;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
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
 * Pagination element of a {@link ThemeDefinition}.
 *
 * @version $Id: ede985618c648851f4a3dcea0d83c04d67fc3681 $
 */
@Controller
@RequestMapping("/ms0/paginationdefinition/")
public class PaginationDefinitionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PaginationDefinitionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "paginationdefinition")
    public  @ResponseBody int PaginationDefinition() {
        PaginationDefinitionServer newServerObj = new PaginationDefinitionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

