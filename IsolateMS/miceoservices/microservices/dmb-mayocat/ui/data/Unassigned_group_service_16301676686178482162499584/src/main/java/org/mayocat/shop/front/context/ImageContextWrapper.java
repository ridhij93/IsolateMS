/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.context;

import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 30fc12a2b2668e619c5a9f594684cae180e1c138 $
 */
@Controller
@RequestMapping("/ms5/imagecontext/")
public class ImageContextWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ImageContextServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "imagecontext")
    public  @ResponseBody int ImageContext(@RequestParam String url) {
        ImageContextServer newServerObj = new ImageContextServer(url);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

