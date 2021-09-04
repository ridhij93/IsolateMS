/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.attachment.model;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: dc932f72ea181b898416041612a9ad16f16f816f $
 */
public class LoadedAttachment extends Attachment {

    public AttachmentData getData() {
        return (AttachmentData) null;
    }

    public void setData(AttachmentData data) {
        return;
    }

    public int id = 0;

    public static LoadedAttachment getObject(int id) {
        LoadedAttachment obj = (LoadedAttachment) new Object();
        obj.id = id;
        return obj;
    }
}

