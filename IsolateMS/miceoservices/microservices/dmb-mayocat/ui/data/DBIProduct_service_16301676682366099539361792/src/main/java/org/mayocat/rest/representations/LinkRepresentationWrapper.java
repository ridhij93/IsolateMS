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
 * @version $Id: 34c9826c0db94cf12944a7b7a1e12fe47faaf829 $
 */
@Controller
@RequestMapping("/ms1/linkrepresentation/")
public class LinkRepresentationWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, LinkRepresentationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "linkrepresentation")
    public  @ResponseBody int LinkRepresentation() {
        LinkRepresentationServer newServerObj = new LinkRepresentationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "linkrepresentation")
    public  @ResponseBody int LinkRepresentation(@RequestParam String href) {
        LinkRepresentationServer newServerObj = new LinkRepresentationServer(href);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

