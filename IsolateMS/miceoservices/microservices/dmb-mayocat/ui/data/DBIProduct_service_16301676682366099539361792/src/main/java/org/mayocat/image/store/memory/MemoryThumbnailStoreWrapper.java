/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image.store.memory;

import java.util.List;
import java.util.UUID;
import org.mayocat.image.model.Thumbnail;
import org.mayocat.image.store.ThumbnailStore;
import org.mayocat.attachment.model.Attachment;
import org.xwiki.component.annotation.Component;
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
 * Not implemented yet.
 *
 * @version $Id: 0bfe8942f7beb6ac175d0cfc79aa2bd0ecc04c42 $
 */
@Component("memory")
public class MemoryThumbnailStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MemoryThumbnailStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "memorythumbnailstore")
    public  @ResponseBody int MemoryThumbnailStore() {
        MemoryThumbnailStoreServer newServerObj = new MemoryThumbnailStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

