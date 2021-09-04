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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 4df45b9afe0d156eb0bb3dd16fb3cbaa04104209 $
 */
public class AbstractAttachmentResource {

    protected AttachmentStore getAttachmentStore() {
        return (AttachmentStore) null;
    }

    protected Slugifier getSlugifier() {
        return (Slugifier) null;
    }

    protected List<Attachment> getAttachmentList() {
        return (List<Attachment>) null;
    }

    protected Attachment addAttachment(InputStream data, String originalFilename, String title, String description, Optional<UUID> parent) {
        return (Attachment) null;
    }

    private Attachment addAttachment(Attachment attachment, int recursionLevel) {
        return (Attachment) null;
    }

    public void setAttachmentStore(Provider<AttachmentStore> attachmentStore) {
        return;
    }

    public void setSlugifier(Slugifier slugifier) {
        return;
    }

    public int id = 0;

    public static AbstractAttachmentResource getObject(int id) {
        AbstractAttachmentResource obj = (AbstractAttachmentResource) new Object();
        obj.id = id;
        return obj;
    }
}

