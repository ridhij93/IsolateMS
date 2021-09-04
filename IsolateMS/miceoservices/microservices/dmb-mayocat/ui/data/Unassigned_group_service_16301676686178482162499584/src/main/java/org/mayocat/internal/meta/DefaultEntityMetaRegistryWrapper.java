/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.internal.meta;

import java.util.List;
import org.mayocat.meta.EntityMeta;
import org.mayocat.meta.EntityMetaRegistry;
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
 * @version $Id: 960bffb11e6deefc62615ea8b53b4ea521df30c0 $
 */
@Controller
@RequestMapping("/ms5/defaultentitymetaregistry/")
public class DefaultEntityMetaRegistryWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultEntityMetaRegistryServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultentitymetaregistry")
    public  @ResponseBody int DefaultEntityMetaRegistry(@RequestParam int entitiesId) {
    }
}

