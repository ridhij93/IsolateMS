/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.internal;

import java.text.Normalizer;
import org.mayocat.Slugifier;
import org.xwiki.component.annotation.Component;
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
 * @version $Id: 5354b6de80febcab58cd190f16fd300ea705d10b $
 */
@Component
public class DefaultSlugifierWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultSlugifierServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultslugifier")
    public  @ResponseBody int DefaultSlugifier() {
        DefaultSlugifierServer newServerObj = new DefaultSlugifierServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

