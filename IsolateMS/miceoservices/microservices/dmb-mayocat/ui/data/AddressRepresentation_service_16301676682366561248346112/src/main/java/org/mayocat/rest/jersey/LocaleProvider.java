/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.jersey;

import java.util.List;
import java.util.Locale;
import org.mayocat.rest.Provider;
import org.xwiki.component.annotation.Component;
import com.sun.jersey.api.core.HttpContext;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 4bfcacc20e898f069d63a9431610c14933bdb7fc $
 */
@Component("locale")
public class LocaleProvider extends AbstractInjectableProvider<Locale> implements Provider {

    public LocaleProvider() {
        String uri = MicroserviceApplication.projectUri + "/ms2/localeprovider/localeprovidercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public Locale getValue(HttpContext c) {
        return (Locale) null;
    }

    public int id = 0;

    public static LocaleProvider getObject(int id) {
        LocaleProvider obj = (LocaleProvider) new Object();
        obj.id = id;
        return obj;
    }
}

