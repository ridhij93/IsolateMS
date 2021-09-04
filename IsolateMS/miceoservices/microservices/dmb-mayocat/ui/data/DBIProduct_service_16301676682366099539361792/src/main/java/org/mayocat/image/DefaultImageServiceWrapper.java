/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image;

import java.awt.*;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.attachment.model.LoadedAttachment;
import org.mayocat.attachment.store.AttachmentStore;
import org.mayocat.files.FileManager;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 0299135a8aafdaa2957808d1df8a90fa87006761 $
 */
@Component
public class DefaultImageServiceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultImageServiceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultimageservice")
    public  @ResponseBody int DefaultImageService() {
        DefaultImageServiceServer newServerObj = new DefaultImageServiceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

