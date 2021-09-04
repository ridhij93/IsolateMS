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
 * @version $Id: 4bfcacc20e898f069d63a9431610c14933bdb7fc $
 */
@Component("locale")
public class LocaleProviderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, LocaleProviderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "localeprovider")
    public  @ResponseBody int LocaleProvider() {
        LocaleProviderServer newServerObj = new LocaleProviderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

