/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image.model;

import java.util.List;
import org.mayocat.attachment.model.Attachment;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 2029a2de73ee2f02f4084002558be19af2b2d487 $
 */
public class Image {

    public Image(Attachment attachment, List<Thumbnail> thumbnails) {
        String uri = MicroserviceApplication.projectUri + "/ms5/image/image?callerId=" + this.id + "&attachmentId=attachment.id&thumbnailsId=thumbnails.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Attachment getAttachment() {
        return (Attachment) null;
    }

    public List<Thumbnail> getThumbnails() {
        return (List<Thumbnail>) null;
    }

    public void setAttachment(Attachment attachment) {
        return;
    }

    public void setThumbnails(List<Thumbnail> thumbnails) {
        return;
    }

    public int id = 0;

    public static Image getObject(int id) {
        Image obj = (Image) new Object();
        obj.id = id;
        return obj;
    }
}

