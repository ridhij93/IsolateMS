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

/**
 * @version $Id: f9daf5d1069584ba4a8455d501a18f1c20f1c27f $
 */
public class CurrenciesSettingsServer {

    @Valid
    @JsonProperty("main")
    private Configurable<Currency> mainCurrency = new Configurable(CurrencyUnit.getEUR());

    @Valid
    @JsonProperty("others")
    private Configurable<List<Currency>> otherCurrencies = new Configurable(Collections.emptyList());

    public Configurable<Currency> getMainCurrency() {
        return mainCurrency;
    }

    public Configurable<List<Currency>> getOtherCurrencies() {
        return otherCurrencies;
    }

    public void setMainCurrency(Configurable<Currency> mainCurrency) {
        this.mainCurrency = mainCurrency;
    }

    public void setOtherCurrencies(Configurable<List<Currency>> otherCurrencies) {
        this.otherCurrencies = otherCurrencies;
    }
}

