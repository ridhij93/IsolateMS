/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import com.google.common.base.Function;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Function that loads an java.awt.Image from an input stream.
 *
 * @version $Id: eff3dea2611cb0c39a73f05fde157191e800a3d7 $
 */
public class LoadImageFunction implements Function<InputStream, Image> {

    public LoadImageFunction(ImageProcessor imageProcessor) {
        String uri = MicroserviceApplication.projectUri + "/ms0/loadimagefunction/loadimagefunction?callerId=" + this.id + "&imageProcessorId=imageProcessor.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Image apply(InputStream input) {
        return (Image) null;
    }

    public void setImageProcessor(ImageProcessor imageProcessor) {
        return;
    }

    public ImageProcessor getImageProcessor() {
        return (ImageProcessor) null;
    }

    public int id = 0;

    public static LoadImageFunction getObject(int id) {
        LoadImageFunction obj = (LoadImageFunction) new Object();
        obj.id = id;
        return obj;
    }
}

