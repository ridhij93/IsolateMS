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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: f4ca72c3a7ffe27dfdb03ff7540916299f901d38 $
 */
public class TaxesSettings implements ExposedSettings {

    @Override
    public String getKey() {
        return (String) null;
    }

    public Configurable<Mode> getMode() {
        return (Configurable<Mode>) null;
    }

    public Configurable<TaxRule> getVat() {
        return (Configurable<TaxRule>) null;
    }

    public Configurable<List<TaxRule>> getOthers() {
        return (Configurable<List<TaxRule>>) null;
    }

    public void setMode(Configurable<Mode> mode) {
        return;
    }

    public void setVat(Configurable<TaxRule> vat) {
        return;
    }

    public void setOthers(Configurable<List<TaxRule>> others) {
        return;
    }

    public int id = 0;

    public static TaxesSettings getObject(int id) {
        TaxesSettings obj = (TaxesSettings) new Object();
        obj.id = id;
        return obj;
    }
}

