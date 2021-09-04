/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.theme;

import javax.validation.Valid;
import org.mayocat.configuration.ExposedSettings;
import org.mayocat.configuration.Configurable;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
 * @verison $Id: 8f53d87885e0a90487ec481d6d0064a94b53d79a $
 */
@Controller
@RequestMapping("/ms5/themesettings/")
public class ThemeSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ThemeSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "themesettings")
    public  @ResponseBody int ThemeSettings() {
        ThemeSettingsServer newServerObj = new ThemeSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

