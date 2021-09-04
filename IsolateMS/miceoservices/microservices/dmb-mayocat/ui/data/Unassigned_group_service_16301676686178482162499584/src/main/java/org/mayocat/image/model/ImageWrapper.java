/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image.model;

import java.util.List;
import org.mayocat.attachment.model.Attachment;
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
 * @version $Id: 2029a2de73ee2f02f4084002558be19af2b2d487 $
 */
@Controller
@RequestMapping("/ms5/image/")
public class ImageWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ImageServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "image")
    public  @ResponseBody int Image(@RequestParam int attachmentId, @RequestParam int thumbnailsId) {
    }
}

