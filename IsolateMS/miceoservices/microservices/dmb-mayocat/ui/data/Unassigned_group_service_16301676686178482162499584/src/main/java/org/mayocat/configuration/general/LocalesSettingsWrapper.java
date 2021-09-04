/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.general;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.validation.Valid;
import org.mayocat.configuration.Configurable;
import org.mayocat.jackson.OptionalStringListDeserializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
 * @version $Id: 9e44ac88ea720f6282f260c1b06890e5e86cdbc6 $
 */
@Controller
@RequestMapping("/ms5/localessettings/")
public class LocalesSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, LocalesSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "localessettings")
    public  @ResponseBody int LocalesSettings() {
        LocalesSettingsServer newServerObj = new LocalesSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

