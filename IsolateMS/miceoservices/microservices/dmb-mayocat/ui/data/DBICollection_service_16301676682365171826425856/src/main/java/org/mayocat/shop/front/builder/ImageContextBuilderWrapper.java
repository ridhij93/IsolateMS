/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.builder;

import java.text.MessageFormat;
import org.mayocat.configuration.images.ImageFormatDefinition;
import org.mayocat.image.model.Image;
import org.mayocat.image.model.Thumbnail;
import org.mayocat.image.util.ImageUtils;
import org.mayocat.shop.front.context.ContextConstants;
import org.mayocat.shop.front.context.ImageContext;
import org.mayocat.shop.front.util.ContextUtils;
import org.mayocat.theme.ThemeDefinition;
import com.google.common.base.Optional;
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
 * @version $Id: e930cda14815cb9a21f0f6fe26eb35404beee69f $
 */
@Controller
@RequestMapping("/ms0/imagecontextbuilder/")
public class ImageContextBuilderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ImageContextBuilderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "imagecontextbuilder")
    public  @ResponseBody int ImageContextBuilder(@RequestParam int themeId) {
        ImageContextBuilderServer newServerObj = new ImageContextBuilderServer(ThemeDefinition.getObject(themeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

