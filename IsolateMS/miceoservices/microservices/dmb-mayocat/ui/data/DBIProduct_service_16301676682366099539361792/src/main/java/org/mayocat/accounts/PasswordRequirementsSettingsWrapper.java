/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

import javax.validation.Valid;
import org.mayocat.configuration.Configurable;
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
 * @version $Id: 2107ceaa88588b0eee38fb709cb0f1eab8c6766b $
 */
@Controller
@RequestMapping("/ms1/passwordrequirementssettings/")
public class PasswordRequirementsSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PasswordRequirementsSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "passwordrequirementssettings")
    public  @ResponseBody int PasswordRequirementsSettings() {
        PasswordRequirementsSettingsServer newServerObj = new PasswordRequirementsSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

