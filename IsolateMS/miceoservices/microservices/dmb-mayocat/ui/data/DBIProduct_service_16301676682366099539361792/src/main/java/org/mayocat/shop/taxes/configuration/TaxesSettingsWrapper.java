/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.taxes.configuration;

import java.util.Collections;
import java.util.List;
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
 * @version $Id: f4ca72c3a7ffe27dfdb03ff7540916299f901d38 $
 */
@Controller
@RequestMapping("/ms1/taxessettings/")
public class TaxesSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TaxesSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "taxessettings")
    public  @ResponseBody int TaxesSettings() {
        TaxesSettingsServer newServerObj = new TaxesSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

