/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.attachment.url;

import java.net.URL;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.attachment.util.AttachmentUtils;
import org.mayocat.url.EntityURLFactory;
import org.mayocat.url.URLHelper;
import org.mayocat.url.URLType;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: b273328472394b7372c8a9c76dcd99c58d959b77 $
 */
@Component
public class AttachmentURLFactory implements EntityURLFactory<Attachment> {

    @Override
    public URL create(Attachment entity, Tenant tenant, URLType type) {
        return (URL) null;
    }

    @Override
    public URL create(Attachment entity, Tenant tenant) {
        return (URL) null;
    }

    @Override
    public URL create(Attachment entity) {
        return (URL) null;
    }

    public void setUrlHelper(URLHelper urlHelper) {
        return;
    }

    public URLHelper getUrlHelper() {
        return (URLHelper) null;
    }

    public int id = 0;

    public static AttachmentURLFactory getObject(int id) {
        AttachmentURLFactory obj = (AttachmentURLFactory) new Object();
        obj.id = id;
        return obj;
    }
}

