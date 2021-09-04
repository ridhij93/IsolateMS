/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.views;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: dba2b6a896c4142ffddb8746abde26786f08af29 $
 */
public class Template {

    public Template(String id, String content) {
        String uri = MicroserviceApplication.projectUri + "/ms5/template/template?callerId=" + this.id + "&id=id&content=content";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Template(String id, String content, boolean partial) {
        String uri = MicroserviceApplication.projectUri + "/ms5/template/template?callerId=" + this.id + "&id=id&content=content&partial=partial";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getContent() {
        return (String) null;
    }

    public String getId() {
        return (String) null;
    }

    public boolean isPartial() {
        return (Boolean) null;
    }

    public void setContent(String content) {
        return;
    }

    public void setId(String id) {
        return;
    }

    public void setPartial(boolean partial) {
        return;
    }

    public boolean getPartial() {
        return (Boolean) null;
    }

    public int id = 0;

    public static Template getObject(int id) {
        Template obj = (Template) new Object();
        obj.id = id;
        return obj;
    }
}

