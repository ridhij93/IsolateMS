/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import org.apache.commons.lang3.StringUtils;
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
 * A qualified reference to an entity, providing both the entity slug and its tenant owner slug.
 *
 * @version $Id: c9dec24b7f1e872a4d8e5294a39ae163b86f093f $
 */
@Controller
@RequestMapping("/ms0/reference/")
public class ReferenceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ReferenceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "reference")
    public  @ResponseBody int Reference(@RequestParam String slug, @RequestParam String tenantSlug) {
        ReferenceServer newServerObj = new ReferenceServer(slug, tenantSlug);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

