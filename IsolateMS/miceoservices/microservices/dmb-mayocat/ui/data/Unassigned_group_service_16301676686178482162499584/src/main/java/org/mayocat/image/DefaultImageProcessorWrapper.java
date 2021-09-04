/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RasterFormatException;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import org.xwiki.component.annotation.Component;
import com.mortennobel.imagescaling.ResampleOp;
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
 * AWT-based image processor
 *
 * @version $Id: b2d57e55313a53f1fbd31151f0c093cf2f08066e $
 */
@Component
public class DefaultImageProcessorWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultImageProcessorServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultimageprocessor")
    public  @ResponseBody int DefaultImageProcessor() {
        DefaultImageProcessorServer newServerObj = new DefaultImageProcessorServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

