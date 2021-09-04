/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.jackson;

import java.util.Locale;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 4d377dcfd9d11ab6fcc3fe447aa570d6b654a5ec $
 */
public class MayocatLocaleBCP47LanguageTagModule extends SimpleModule {

    public MayocatLocaleBCP47LanguageTagModule() {
        String uri = MicroserviceApplication.projectUri + "/ms0/mayocatlocalebcp47languagetagmodule/mayocatlocalebcp47languagetagmodulecallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static MayocatLocaleBCP47LanguageTagModule getObject(int id) {
        MayocatLocaleBCP47LanguageTagModule obj = (MayocatLocaleBCP47LanguageTagModule) new Object();
        obj.id = id;
        return obj;
    }
}

