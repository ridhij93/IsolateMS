/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.news;

import javax.validation.Valid;
import org.mayocat.configuration.Configurable;
import org.mayocat.configuration.ExposedSettings;
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
 * @version $Id: c0fdb33ffcd89fa92f75a70bc7f4e08e1c820a49 $
 */
@Controller
@RequestMapping("/ms1/newssettings/")
public class NewsSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, NewsSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "newssettings")
    public  @ResponseBody int NewsSettings() {
        NewsSettingsServer newServerObj = new NewsSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

