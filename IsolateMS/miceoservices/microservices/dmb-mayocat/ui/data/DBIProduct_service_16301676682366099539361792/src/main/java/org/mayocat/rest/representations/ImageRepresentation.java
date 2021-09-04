/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.representations;

import java.util.List;
import org.mayocat.image.model.Image;
import org.mayocat.image.model.Thumbnail;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: f9d701347211ff3a5d91501216d0aadfe367210b $
 */
public class ImageRepresentation extends AttachmentRepresentation {

    public ImageRepresentation() {
        String uri = MicroserviceApplication.projectUri + "/ms1/imagerepresentation/imagerepresentationcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public ImageRepresentation(Image image, Boolean featured) {
        String uri = MicroserviceApplication.projectUri + "/ms1/imagerepresentation/imagerepresentation?callerId=" + this.id + "&imageId=image.id&featured=featured";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public ImageRepresentation(Image image) {
        String uri = MicroserviceApplication.projectUri + "/ms1/imagerepresentation/imagerepresentation?callerId=" + this.id + "&imageId=image.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public List<ThumbnailRepresentation> getThumbnails() {
        return (List<ThumbnailRepresentation>) null;
    }

    @JsonIgnore
    public boolean isFeaturedImage() {
        return (Boolean) null;
    }

    public Boolean getFeatured() {
        return (Boolean) null;
    }

    public void setFeatured(Boolean featured) {
        return;
    }

    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static String buildImageApiHref(Image image) {
        return (String) null;
    }

    private static String buildImageFileHref(Image image) {
        return (String) null;
    }

    private static FileRepresentation buildFileRepresentation(Image image) {
        return (FileRepresentation) null;
    }

    private static List<ThumbnailRepresentation> buildThumbnailsRepresentation(Image image) {
        return (List<ThumbnailRepresentation>) null;
    }

    public void setThumbnails(List<ThumbnailRepresentation> thumbnails) {
        return;
    }

    public int id = 0;

    public static ImageRepresentation getObject(int id) {
        ImageRepresentation obj = (ImageRepresentation) new Object();
        obj.id = id;
        return obj;
    }
}

