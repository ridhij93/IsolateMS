/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.representations;

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
 * @version $Id: 087a390733e699428c85819e0ffe7a8366b45969 $
 */
@Controller
@RequestMapping("/ms1/localerepresentation/")
public class LocaleRepresentationWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, LocaleRepresentationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "localerepresentation")
    public  @ResponseBody int LocaleRepresentation(@RequestParam String tag, @RequestParam String name) {
        LocaleRepresentationServer newServerObj = new LocaleRepresentationServer(tag, name);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

