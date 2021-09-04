/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.resources;

import java.io.InputStream;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.mayocat.Slugifier;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.attachment.model.AttachmentData;
import org.mayocat.attachment.model.LoadedAttachment;
import org.mayocat.attachment.store.AttachmentStore;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.InvalidEntityException;
import com.google.common.base.Optional;
import com.google.common.base.Strings;
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
 * @version $Id: 4df45b9afe0d156eb0bb3dd16fb3cbaa04104209 $
 */
@Controller
@RequestMapping("/ms2/abstractattachmentresource/")
public class AbstractAttachmentResourceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AbstractAttachmentResourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "abstractattachmentresource")
    public  @ResponseBody int AbstractAttachmentResource() {
        AbstractAttachmentResourceServer newServerObj = new AbstractAttachmentResourceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

