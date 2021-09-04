/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import com.google.common.base.Function;
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
 * Function that loads an java.awt.Image from an input stream.
 *
 * @version $Id: eff3dea2611cb0c39a73f05fde157191e800a3d7 $
 */
@Controller
@RequestMapping("/ms0/loadimagefunction/")
public class LoadImageFunctionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, LoadImageFunctionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "loadimagefunction")
    public  @ResponseBody int LoadImageFunction(@RequestParam int imageProcessorId) {
        LoadImageFunctionServer newServerObj = new LoadImageFunctionServer(ImageProcessor.getObject(imageProcessorId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

