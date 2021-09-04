/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
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
 * Settings for the localization filter. See {@link org.mayocat.localization.RequestLocalizationFilter}.
 *
 * @version $Id: 0ae96cd4a4ec2007257404634e2667828accefd0 $
 */
@Controller
@RequestMapping("/ms5/localizationfiltersettings/")
public class LocalizationFilterSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, LocalizationFilterSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "localizationfiltersettings")
    public  @ResponseBody int LocalizationFilterSettings() {
        LocalizationFilterSettingsServer newServerObj = new LocalizationFilterSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

