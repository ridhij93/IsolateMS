/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.representations;

import javax.validation.constraints.NotNull;
import org.mayocat.image.model.Thumbnail;
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
 * @version $Id: adeb3c416d293537654aef74931f2c82a06cd2da $
 */
@Controller
@RequestMapping("/ms1/thumbnailrepresentation/")
public class ThumbnailRepresentationWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ThumbnailRepresentationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "thumbnailrepresentation")
    public  @ResponseBody int ThumbnailRepresentation() {
        ThumbnailRepresentationServer newServerObj = new ThumbnailRepresentationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "thumbnailrepresentation")
    public  @ResponseBody int ThumbnailRepresentation(@RequestParam int thumbnailId) {
        ThumbnailRepresentationServer newServerObj = new ThumbnailRepresentationServer(Thumbnail.getObject(thumbnailId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

