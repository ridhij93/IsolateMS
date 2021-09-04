/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.mail;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
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
 * @version $Id: 2cc5b723f1b8def7eb49a5da12dfc015044ec644 $
 */
@Controller
@RequestMapping("/ms1/smtpsettings/")
public class SmtpSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, SmtpSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "smtpsettings")
    public  @ResponseBody int SmtpSettings() {
        SmtpSettingsServer newServerObj = new SmtpSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

