/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

import java.util.Collections;
import java.util.Map;
import javax.validation.Valid;
import org.mayocat.addons.model.AddonGroupDefinition;
import org.mayocat.configuration.images.ImageFormatDefinition;
import org.mayocat.theme.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
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
 * @version $Id: ca4089543c99dd9ba52d09b60b5684fbc872d395 $
 */
@Controller
@RequestMapping("/ms5/platformsettings/")
public class PlatformSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PlatformSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "platformsettings")
    public  @ResponseBody int PlatformSettings() {
        PlatformSettingsServer newServerObj = new PlatformSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

