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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Utility class related to money and currencies
 *
 * @version $Id: 8873ee360b636d7d00a3ed464dab6f622f808f63 $
 */
public class MoneyUtil {

    /**
     * Always returns the local symbol (for example $ or the euro symbol) of a currency, whatever the locale of the
     * system is.
     *
     * @param currency the currency to get the local symbol
     * @return the local symbol for the passed currency
     */
    public static String getLocalSymbol(Currency currency) {
        return (String) null;
    }

    public static void setCurrencyLocaleMap(SortedMap<Currency, Locale> currencyLocaleMap) {
        return;
    }

    public static SortedMap<Currency, Locale> getCurrencyLocaleMap() {
        return (SortedMap<Currency, Locale>) null;
    }

    public int id = 0;

    public static MoneyUtil getObject(int id) {
        MoneyUtil obj = (MoneyUtil) new Object();
        obj.id = id;
        return obj;
    }
}

