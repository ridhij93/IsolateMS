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

/**
 * @version $Id: 2029a2de73ee2f02f4084002558be19af2b2d487 $
 */
public class ImageServer {

    private Attachment attachment;

    private List<Thumbnail> thumbnails;

    public ImageServer(Attachment attachment, List<Thumbnail> thumbnails) {
        this.attachment = attachment;
        this.thumbnails = thumbnails;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public List<Thumbnail> getThumbnails() {
        return thumbnails;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public void setThumbnails(List<Thumbnail> thumbnails) {
        this.thumbnails = thumbnails;
    }
}

