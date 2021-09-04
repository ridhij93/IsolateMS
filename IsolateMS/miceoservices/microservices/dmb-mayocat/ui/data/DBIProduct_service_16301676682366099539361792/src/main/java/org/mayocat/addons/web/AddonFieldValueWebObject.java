/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.addons.web;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 3d444e2d07ef6b6c533d8978203513be5d3b488f $
 */
public class AddonFieldValueWebObject {

    public AddonFieldValueWebObject(Object raw, Object display) {
        String uri = MicroserviceApplication.projectUri + "/msnull/addonfieldvaluewebobject/addonfieldvaluewebobject?callerId=" + this.id + "&rawId=raw.id&displayId=display.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Object getRaw() {
        return (Object) null;
    }

    public Object getDisplay() {
        return (Object) null;
    }

    public void setRaw(Object raw) {
        return;
    }

    public void setDisplay(Object display) {
        return;
    }

    public int id = 0;

    public static AddonFieldValueWebObject getObject(int id) {
        AddonFieldValueWebObject obj = (AddonFieldValueWebObject) new Object();
        obj.id = id;
        return obj;
    }
}

