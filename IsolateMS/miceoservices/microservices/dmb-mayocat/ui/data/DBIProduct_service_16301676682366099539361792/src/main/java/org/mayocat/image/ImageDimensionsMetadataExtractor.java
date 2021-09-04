/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.mayocat.attachment.MetadataExtractor;
import org.mayocat.attachment.model.LoadedAttachment;
import org.mayocat.attachment.util.AttachmentUtils;
import org.mayocat.attachment.model.Attachment;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Optional;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 9fd390a86c080057d71a8bafa489d91477371625 $
 */
@Component("imageDimensions")
public class ImageDimensionsMetadataExtractor implements MetadataExtractor {

    /**
     * Constructor for DI
     */
    public ImageDimensionsMetadataExtractor() {
        String uri = MicroserviceApplication.projectUri + "/ms1/imagedimensionsmetadataextractor/imagedimensionsmetadataextractorcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * Constructor to be used outside the DI realm (tests, migrations, etc.)
     *
     * @param imageProcessor the imageProcessor to use
     */
    public ImageDimensionsMetadataExtractor(ImageProcessor imageProcessor) {
        String uri = MicroserviceApplication.projectUri + "/ms1/imagedimensionsmetadataextractor/imagedimensionsmetadataextractor?callerId=" + this.id + "&imageProcessorId=imageProcessor.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Optional<Map<String, Object>> extractMetadata(LoadedAttachment attachment) {
        return (Optional<Map<String, Object>>) null;
    }

    public void setImageProcessor(ImageProcessor imageProcessor) {
        return;
    }

    public ImageProcessor getImageProcessor() {
        return (ImageProcessor) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static ImageDimensionsMetadataExtractor getObject(int id) {
        ImageDimensionsMetadataExtractor obj = (ImageDimensionsMetadataExtractor) new Object();
        obj.id = id;
        return obj;
    }
}

