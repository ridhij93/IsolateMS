/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.context;

import java.util.HashMap;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 30fc12a2b2668e619c5a9f594684cae180e1c138 $
 */
public class ImageContext extends HashMap {

    public ImageContext(String url) {
        String uri = MicroserviceApplication.projectUri + "/ms5/imagecontext/imagecontext?callerId=" + this.id + "&url=url";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public void setUrl(String url) {
        return;
    }

    public void setTitle(String title) {
        return;
    }

    public void setDescription(String description) {
        return;
    }

    public int id = 0;

    public static ImageContext getObject(int id) {
        ImageContext obj = (ImageContext) new Object();
        obj.id = id;
        return obj;
    }
}

