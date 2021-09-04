/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.configuration.shop;

import java.util.Collections;
import java.util.Currency;
import java.util.List;
import javax.validation.Valid;
import org.joda.money.CurrencyUnit;
import org.mayocat.configuration.Configurable;
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
 * @version $Id: f9daf5d1069584ba4a8455d501a18f1c20f1c27f $
 */
@Controller
@RequestMapping("/ms1/currenciessettings/")
public class CurrenciesSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CurrenciesSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "currenciessettings")
    public  @ResponseBody int CurrenciesSettings() {
        CurrenciesSettingsServer newServerObj = new CurrenciesSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

