/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image.model;

import java.util.UUID;
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
 * @version $Id: 72c54b0105e1dbf5a66c248e5b84cc01c37bd8bc $
 */
@Controller
@RequestMapping("/ms5/thumbnail/")
public class ThumbnailWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ThumbnailServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "thumbnail")
    public  @ResponseBody int Thumbnail() {
        ThumbnailServer newServerObj = new ThumbnailServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

