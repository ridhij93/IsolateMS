/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.inject.Inject;
import org.mayocat.entity.DataLoaderAssistant;
import org.mayocat.entity.EntityData;
import org.mayocat.entity.LoadingOption;
import org.mayocat.entity.StandardOptions;
import org.mayocat.image.model.Image;
import org.mayocat.image.model.ImageGallery;
import org.mayocat.image.model.Thumbnail;
import org.mayocat.image.store.ThumbnailStore;
import org.mayocat.localization.EntityLocalizationService;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.model.Entity;
import org.mayocat.model.EntityList;
import org.mayocat.store.EntityListStore;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import static org.mayocat.entity.EntityUtils.asSet;
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
 * @version $Id: 68714e0dd44a53baae031a68ce965a0e6aeaf1cc $
 */
@Component("images")
public class ImageDataLoaderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ImageDataLoaderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "imagedataloader")
    public  @ResponseBody int ImageDataLoader() {
        ImageDataLoaderServer newServerObj = new ImageDataLoaderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

