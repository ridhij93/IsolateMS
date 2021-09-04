/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.attachment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.attachment.store.AttachmentStore;
import org.mayocat.entity.DataLoaderAssistant;
import org.mayocat.entity.EntityData;
import org.mayocat.entity.LoadingOption;
import org.mayocat.model.Entity;
import org.mayocat.model.HasFeaturedImage;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
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
 * @version $Id: 0729978469274d3b4a680cc18ea1d78488c587af $
 */
@Component("attachments")
public class AttachmentDataLoaderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AttachmentDataLoaderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "attachmentdataloader")
    public  @ResponseBody int AttachmentDataLoader() {
        AttachmentDataLoaderServer newServerObj = new AttachmentDataLoaderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

