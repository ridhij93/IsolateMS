/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.images;

import java.util.List;
import org.mayocat.jackson.OptionalStringListDeserializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
 * @version $Id: 1d68e64a350765e05eed11ed4f3e449ecf072d99 $
 */
@Controller
@RequestMapping("/ms0/imageformatdefinition/")
public class ImageFormatDefinitionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ImageFormatDefinitionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "imageformatdefinition")
    public  @ResponseBody int ImageFormatDefinition() {
        ImageFormatDefinitionServer newServerObj = new ImageFormatDefinitionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

