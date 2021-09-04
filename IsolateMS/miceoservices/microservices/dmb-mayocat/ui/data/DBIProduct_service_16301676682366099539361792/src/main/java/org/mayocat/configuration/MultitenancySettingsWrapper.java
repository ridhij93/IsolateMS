/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

import javax.validation.Valid;
import org.mayocat.accounts.model.Role;
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

@Controller
@RequestMapping("/ms1/multitenancysettings/")
public class MultitenancySettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MultitenancySettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "multitenancysettings")
    public  @ResponseBody int MultitenancySettings() {
        MultitenancySettingsServer newServerObj = new MultitenancySettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

