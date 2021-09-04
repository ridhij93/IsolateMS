/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.attachment.store.memory;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.attachment.model.LoadedAttachment;
import org.mayocat.model.Entity;
import org.mayocat.attachment.store.AttachmentStore;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.memory.BaseEntityMemoryStore;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
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
 * @version $Id: bf6aaf4813214581b50c80642da4b8dafd1e2ab6 $
 */
@Component("memory")
public class AttachmentMemoryStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AttachmentMemoryStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "attachmentmemorystore")
    public  @ResponseBody int AttachmentMemoryStore() {
        AttachmentMemoryStoreServer newServerObj = new AttachmentMemoryStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

