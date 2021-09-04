/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image.model;

import java.util.UUID;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 72c54b0105e1dbf5a66c248e5b84cc01c37bd8bc $
 */
public class Thumbnail {

    public String getSource() {
        return (String) null;
    }

    public void setSource(String source) {
        return;
    }

    public String getHint() {
        return (String) null;
    }

    public void setHint(String hint) {
        return;
    }

    public String getRatio() {
        return (String) null;
    }

    public void setRatio(String ratio) {
        return;
    }

    public Integer getX() {
        return (Integer) null;
    }

    public void setX(Integer x) {
        return;
    }

    public Integer getY() {
        return (Integer) null;
    }

    public void setY(Integer y) {
        return;
    }

    public Integer getWidth() {
        return (Integer) null;
    }

    public void setWidth(Integer width) {
        return;
    }

    public Integer getHeight() {
        return (Integer) null;
    }

    public void setHeight(Integer height) {
        return;
    }

    public UUID getAttachmentId() {
        return (UUID) null;
    }

    public void setAttachmentId(UUID attachmentId) {
        return;
    }

    public int id = 0;

    public static Thumbnail getObject(int id) {
        Thumbnail obj = (Thumbnail) new Object();
        obj.id = id;
        return obj;
    }
}

