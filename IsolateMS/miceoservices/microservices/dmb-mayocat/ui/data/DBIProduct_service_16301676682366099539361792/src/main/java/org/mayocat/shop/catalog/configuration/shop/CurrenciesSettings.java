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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: f9daf5d1069584ba4a8455d501a18f1c20f1c27f $
 */
public class CurrenciesSettings {

    public Configurable<Currency> getMainCurrency() {
        return (Configurable<Currency>) null;
    }

    public Configurable<List<Currency>> getOtherCurrencies() {
        return (Configurable<List<Currency>>) null;
    }

    public void setMainCurrency(Configurable<Currency> mainCurrency) {
        return;
    }

    public void setOtherCurrencies(Configurable<List<Currency>> otherCurrencies) {
        return;
    }

    public int id = 0;

    public static CurrenciesSettings getObject(int id) {
        CurrenciesSettings obj = (CurrenciesSettings) new Object();
        obj.id = id;
        return obj;
    }
}

