/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.invoicing;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.mayocat.configuration.Configurable;
import org.mayocat.configuration.ExposedSettings;
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
 * @version $Id: a862cf46025a0b13f0934cc92227fa98f1e3e41f $
 */
@Controller
@RequestMapping("/ms0/invoicingsettings/")
public class InvoicingSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, InvoicingSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "invoicingsettings")
    public  @ResponseBody int InvoicingSettings() {
        InvoicingSettingsServer newServerObj = new InvoicingSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

