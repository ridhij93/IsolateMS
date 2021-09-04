/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.configuration;

import org.mayocat.configuration.Configurable;
import org.mayocat.configuration.ExposedSettings;
import org.mayocat.shop.shipping.Strategy;
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
 * @version $Id: 539f66a1e4628f333560ee4360a3f10ae55f4cbc $
 */
@Controller
@RequestMapping("/ms1/shippingsettings/")
public class ShippingSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ShippingSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "shippingsettings")
    public  @ResponseBody int ShippingSettings() {
        ShippingSettingsServer newServerObj = new ShippingSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

