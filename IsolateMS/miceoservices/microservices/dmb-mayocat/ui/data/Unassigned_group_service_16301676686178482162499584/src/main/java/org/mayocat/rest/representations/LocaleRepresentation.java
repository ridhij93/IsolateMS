/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.representations;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 087a390733e699428c85819e0ffe7a8366b45969 $
 */
public class LocaleRepresentation {

    public LocaleRepresentation(String tag, String name) {
        String uri = MicroserviceApplication.projectUri + "/ms1/localerepresentation/localerepresentation?callerId=" + this.id + "&tag=tag&name=name";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getTag() {
        return (String) null;
    }

    public String getName() {
        return (String) null;
    }

    public void setTag(String tag) {
        return;
    }

    public void setName(String name) {
        return;
    }

    public int id = 0;

    public static LocaleRepresentation getObject(int id) {
        LocaleRepresentation obj = (LocaleRepresentation) new Object();
        obj.id = id;
        return obj;
    }
}

