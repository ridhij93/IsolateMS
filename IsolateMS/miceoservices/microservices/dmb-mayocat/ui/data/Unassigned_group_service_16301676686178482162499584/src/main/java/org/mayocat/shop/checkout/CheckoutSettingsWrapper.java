/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.checkout;

import javax.validation.Valid;
import org.mayocat.configuration.Configurable;
import com.fasterxml.jackson.annotation.JsonProperty;
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
 * @version $Id: 2e59c680818e941b37c962ae10932d3c212010de $
 */
@Controller
@RequestMapping("/ms5/checkoutsettings/")
public class CheckoutSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CheckoutSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "checkoutsettings")
    public  @ResponseBody int CheckoutSettings() {
        CheckoutSettingsServer newServerObj = new CheckoutSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

