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
 * @version $Id: 34c9826c0db94cf12944a7b7a1e12fe47faaf829 $
 */
public class LinkRepresentation {

    public LinkRepresentation() {
        String uri = MicroserviceApplication.projectUri + "/ms1/linkrepresentation/linkrepresentationcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public LinkRepresentation(String href) {
        String uri = MicroserviceApplication.projectUri + "/ms1/linkrepresentation/linkrepresentation?callerId=" + this.id + "&href=href";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getHref() {
        return (String) null;
    }

    public void setHref(String href) {
        return;
    }

    public int id = 0;

    public static LinkRepresentation getObject(int id) {
        LinkRepresentation obj = (LinkRepresentation) new Object();
        obj.id = id;
        return obj;
    }
}

