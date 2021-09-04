/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.attachment.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.common.base.Function;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Data of an {@link Attachment}
 *
 * @version $Id: ed7e6cb82d3f8d11cc1602ede500c8b3176f2233 $
 */
public class AttachmentData implements Serializable {

    public AttachmentData(InputStream stream) {
        String uri = MicroserviceApplication.projectUri + "/ms1/attachmentdata/attachmentdata?callerId=" + this.id + "&streamId=stream.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public InputStream getStream() {
        return (InputStream) null;
    }

    public byte[] getData() {
        return (byte[]) null;
    }

    public <T> T getObject(Function<InputStream, T> load, Class<T> clazz) {
        return (T) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public void setStream(InputStream stream) {
        return;
    }

    public void setBytes(byte[] bytes) {
        return;
    }

    public byte[] getBytes() {
        return (byte[]) null;
    }

    public void setObject(Object object) {
        return;
    }

    public int id = 0;

    public static AttachmentData getObject(int id) {
        AttachmentData obj = (AttachmentData) new Object();
        obj.id = id;
        return obj;
    }
}

