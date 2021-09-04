/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RasterFormatException;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import org.xwiki.component.annotation.Component;
import com.mortennobel.imagescaling.ResampleOp;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * AWT-based image processor
 *
 * @version $Id: b2d57e55313a53f1fbd31151f0c093cf2f08066e $
 */
@Component
public class DefaultImageProcessor implements ImageProcessor {

    @Override
    public Image readImage(InputStream inputStream) throws IOException {
        return (Image) null;
    }

    @Override
    public RenderedImage scaleImage(Image image, Dimension dimension) {
        return (RenderedImage) null;
    }

    @Override
    public RenderedImage cropImage(Image image, Rectangle boundaries) {
        return (RenderedImage) null;
    }

    public int id = 0;

    public static DefaultImageProcessor getObject(int id) {
        DefaultImageProcessor obj = (DefaultImageProcessor) new Object();
        obj.id = id;
        return obj;
    }
}

