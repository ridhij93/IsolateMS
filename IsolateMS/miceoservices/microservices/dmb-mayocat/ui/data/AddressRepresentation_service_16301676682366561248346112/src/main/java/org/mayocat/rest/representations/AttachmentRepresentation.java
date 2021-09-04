/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.representations;

import java.util.Locale;
import java.util.Map;
import org.mayocat.attachment.model.Attachment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: b8b8071fc36f965e99fc83c059a889a3fc962cf3 $
 */
public class AttachmentRepresentation extends EntityReferenceRepresentation {

    public AttachmentRepresentation() {
        String uri = MicroserviceApplication.projectUri + "/ms2/attachmentrepresentation/attachmentrepresentationcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public AttachmentRepresentation(Attachment attachment) {
        String uri = MicroserviceApplication.projectUri + "/ms2/attachmentrepresentation/attachmentrepresentation?callerId=" + this.id + "&attachmentId=attachment.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * Constructor that allows to override the attachment URI and its file representation.
     *
     * Particularly useful for extending classes, such as {@link ImageRepresentation}.
     *
     * @param attachment the attachment to represent.
     * @param uri the URI of the resource represented by the attachment representation
     * @param file the file representation of the attachment representation
     */
    public AttachmentRepresentation(Attachment attachment, String uri, FileRepresentation file) {
        String uri = MicroserviceApplication.projectUri + "/ms2/attachmentrepresentation/attachmentrepresentation?callerId=" + this.id + "&attachmentId=attachment.id&uri=uri&fileId=file.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public FileRepresentation getFile() {
        return (FileRepresentation) null;
    }

    public void setFile(FileRepresentation file) {
        return;
    }

    public String getDescription() {
        return (String) null;
    }

    public Map<Locale, Map<String, Object>> getLocalizedVersions() {
        return (Map<Locale, Map<String, Object>>) null;
    }

    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static FileRepresentation buildFileRepresentation(Attachment attachment) {
        return (FileRepresentation) null;
    }

    private static String buildAttachmentApiHref(Attachment attachment) {
        return (String) null;
    }

    private static String buildImageFileHref(Attachment attachment) {
        return (String) null;
    }

    public void setDescription(String description) {
        return;
    }

    public void setLocalizedVersions(Map<Locale, Map<String, Object>> localizedVersions) {
        return;
    }

    public int id = 0;

    public static AttachmentRepresentation getObject(int id) {
        AttachmentRepresentation obj = (AttachmentRepresentation) new Object();
        obj.id = id;
        return obj;
    }
}

