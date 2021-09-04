/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.util;

import java.util.Comparator;
import java.util.Currency;
import java.util.Locale;
import java.util.SortedMap;
import java.util.TreeMap;
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
 * Utility class related to money and currencies
 *
 * @version $Id: 8873ee360b636d7d00a3ed464dab6f622f808f63 $
 */
@Controller
@RequestMapping("/ms0/moneyutil/")
public class MoneyUtilWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MoneyUtilServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "moneyutil")
    public  @ResponseBody int MoneyUtil() {
        MoneyUtilServer newServerObj = new MoneyUtilServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

