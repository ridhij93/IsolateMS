/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.general;

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
 * @version $Id: eb68c719b7c106d4b5115478e19759e57aa33463 $
 */
@Controller
@RequestMapping("/ms0/generalsettings/")
public class GeneralSettingsWrapper {

    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static int maxId = 0;

    public static HashMap<Integer, GeneralSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "generalsettings")
    public  @ResponseBody int GeneralSettings() {
        GeneralSettingsServer newServerObj = new GeneralSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

