/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

import com.google.common.collect.Lists;
import java.util.List;
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
 * @version $Id: 778640435ec9979a8a73e39b9c08eb7f07e4bad8 $
 */
@Controller
@RequestMapping("/ms5/paymentssettings/")
public class PaymentsSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PaymentsSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "paymentssettings")
    public  @ResponseBody int PaymentsSettings() {
        PaymentsSettingsServer newServerObj = new PaymentsSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

