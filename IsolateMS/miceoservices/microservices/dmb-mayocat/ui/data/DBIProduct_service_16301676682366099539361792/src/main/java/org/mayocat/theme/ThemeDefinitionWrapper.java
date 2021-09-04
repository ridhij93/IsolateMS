/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.theme;

import java.util.Collections;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import org.hibernate.validator.constraints.NotBlank;
import org.mayocat.addons.model.AddonGroupDefinition;
import org.mayocat.configuration.images.ImageFormatDefinition;
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
 * @version $Id: 0cb9712b6d6f41aac2c870bbf63665a7a4cdf905 $
 */
@Controller
@RequestMapping("/ms1/themedefinition/")
public class ThemeDefinitionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ThemeDefinitionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "themedefinition")
    public  @ResponseBody int ThemeDefinition() {
        ThemeDefinitionServer newServerObj = new ThemeDefinitionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

