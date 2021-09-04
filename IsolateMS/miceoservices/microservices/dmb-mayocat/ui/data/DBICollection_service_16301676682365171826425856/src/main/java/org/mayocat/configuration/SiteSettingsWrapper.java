/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;
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
 * @version $Id: 8ba71789c1b71ac84cf3a5767017298b852ba6a5 $
 */
@Controller
@RequestMapping("/ms0/sitesettings/")
public class SiteSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, SiteSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "sitesettings")
    public  @ResponseBody int SiteSettings() {
        SiteSettingsServer newServerObj = new SiteSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

