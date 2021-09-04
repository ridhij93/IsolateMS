/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image.model;

import java.util.List;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: e6f27fa3a132f14212dcf175922744b8a5f5113b $
 */
public class ImageGallery {

    public ImageGallery(List<Image> images) {
        String uri = MicroserviceApplication.projectUri + "/msnull/imagegallery/imagegallery?callerId=" + this.id + "&imagesId=images.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public List<Image> getImages() {
        return (List<Image>) null;
    }

    public void setImages(List<Image> images) {
        return;
    }

    public int id = 0;

    public static ImageGallery getObject(int id) {
        ImageGallery obj = (ImageGallery) new Object();
        obj.id = id;
        return obj;
    }
}

