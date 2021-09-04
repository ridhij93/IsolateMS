/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.resources;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.servlet.ServletContext;
import javax.ws.rs.core.Response;
import org.mayocat.attachment.model.LoadedAttachment;
import org.mayocat.attachment.store.AttachmentStore;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 2815b8c5117f2d4f96da36961381757a8005e0bb $
 */
public class AbstractAttachmentResource {

    public Response downloadFile(String slug, String extension, ServletContext servletContext) {
        return (Response) null;
    }

    protected AttachmentStore getAttachmentStore() {
        return (AttachmentStore) null;
    }

    public void setAttachmentStore(Provider<AttachmentStore> attachmentStore) {
        return;
    }

    public int id = 0;

    public static AbstractAttachmentResource getObject(int id) {
        AbstractAttachmentResource obj = (AbstractAttachmentResource) new Object();
        obj.id = id;
        return obj;
    }
}

