/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.representations;

import java.util.List;
import org.mayocat.image.model.Image;
import org.mayocat.image.model.Thumbnail;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;
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
 * @version $Id: f9d701347211ff3a5d91501216d0aadfe367210b $
 */
@Controller
@RequestMapping("/ms1/imagerepresentation/")
public class ImageRepresentationWrapper {

    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static int maxId = 0;

    public static HashMap<Integer, ImageRepresentationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "imagerepresentation")
    public  @ResponseBody int ImageRepresentation() {
        ImageRepresentationServer newServerObj = new ImageRepresentationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "imagerepresentation")
    public  @ResponseBody int ImageRepresentation(@RequestParam int imageId, @RequestParam Boolean featured) {
        ImageRepresentationServer newServerObj = new ImageRepresentationServer(Image.getObject(imageId), featured);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "imagerepresentation")
    public  @ResponseBody int ImageRepresentation(@RequestParam int imageId) {
        ImageRepresentationServer newServerObj = new ImageRepresentationServer(Image.getObject(imageId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

