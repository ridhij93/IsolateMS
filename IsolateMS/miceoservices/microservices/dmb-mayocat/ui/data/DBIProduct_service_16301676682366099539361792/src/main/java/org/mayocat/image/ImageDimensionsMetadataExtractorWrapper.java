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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 9fd390a86c080057d71a8bafa489d91477371625 $
 */
@Component("imageDimensions")
public class ImageDimensionsMetadataExtractorWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ImageDimensionsMetadataExtractorServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "imagedimensionsmetadataextractor")
    public  @ResponseBody int ImageDimensionsMetadataExtractor() {
        ImageDimensionsMetadataExtractorServer newServerObj = new ImageDimensionsMetadataExtractorServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "imagedimensionsmetadataextractor")
    public  @ResponseBody int ImageDimensionsMetadataExtractor(@RequestParam int imageProcessorId) {
        ImageDimensionsMetadataExtractorServer newServerObj = new ImageDimensionsMetadataExtractorServer(ImageProcessor.getObject(imageProcessorId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

