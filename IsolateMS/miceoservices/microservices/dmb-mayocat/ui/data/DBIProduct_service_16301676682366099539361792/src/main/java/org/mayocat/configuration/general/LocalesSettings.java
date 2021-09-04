/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.general;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.validation.Valid;
import org.mayocat.configuration.Configurable;
import org.mayocat.jackson.OptionalStringListDeserializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 9e44ac88ea720f6282f260c1b06890e5e86cdbc6 $
 */
public class LocalesSettings {

    public Configurable<Locale> getMainLocale() {
        return (Configurable<Locale>) null;
    }

    public Configurable<List<Locale>> getOtherLocales() {
        return (Configurable<List<Locale>>) null;
    }

    public void setMainLocale(Configurable<Locale> mainLocale) {
        return;
    }

    public void setOtherLocales(Configurable<List<Locale>> otherLocales) {
        return;
    }

    public int id = 0;

    public static LocalesSettings getObject(int id) {
        LocalesSettings obj = (LocalesSettings) new Object();
        obj.id = id;
        return obj;
    }
}

