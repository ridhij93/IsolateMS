/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.parameters;

import com.google.common.base.Optional;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: bc2f2644f072be99096ee4c6122e77d4bde5057b $
 */
public class ImageOptions {

    public ImageOptions(Optional<Integer> width, Optional<Integer> height) {
        String uri = MicroserviceApplication.projectUri + "/msnull/imageoptions/imageoptions?callerId=" + this.id + "&widthId=width.id&heightId=height.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Optional<Integer> getWidth() {
        return (Optional<Integer>) null;
    }

    public Optional<Integer> getHeight() {
        return (Optional<Integer>) null;
    }

    public void setWidth(Optional<Integer> width) {
        return;
    }

    public void setHeight(Optional<Integer> height) {
        return;
    }

    public int id = 0;

    public static ImageOptions getObject(int id) {
        ImageOptions obj = (ImageOptions) new Object();
        obj.id = id;
        return obj;
    }
}

