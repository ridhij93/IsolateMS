/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.representations;

import javax.validation.constraints.NotNull;
import org.mayocat.image.model.Thumbnail;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: adeb3c416d293537654aef74931f2c82a06cd2da $
 */
public class ThumbnailRepresentation {

    public ThumbnailRepresentation() {
        String uri = MicroserviceApplication.projectUri + "/ms1/thumbnailrepresentation/thumbnailrepresentationcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public ThumbnailRepresentation(Thumbnail thumbnail) {
        String uri = MicroserviceApplication.projectUri + "/ms1/thumbnailrepresentation/thumbnailrepresentation?callerId=" + this.id + "&thumbnailId=thumbnail.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

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

    public int id = 0;

    public static ThumbnailRepresentation getObject(int id) {
        ThumbnailRepresentation obj = (ThumbnailRepresentation) new Object();
        obj.id = id;
        return obj;
    }
}

