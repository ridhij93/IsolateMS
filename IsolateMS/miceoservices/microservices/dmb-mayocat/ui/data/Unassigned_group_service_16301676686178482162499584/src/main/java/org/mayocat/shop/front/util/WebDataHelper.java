/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.util;

import java.util.UUID;
import javax.annotation.Nullable;
import org.mayocat.image.model.Thumbnail;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.model.HasFeaturedImage;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Helper for front context builders.
 *
 * @version $Id: 58ba02d166798d06d71756387b696aadb662e70e $
 */
public class WebDataHelper {

    public static Predicate<? super Attachment> isEntityFeaturedImage(final HasFeaturedImage entity) {
        return (Predicate<? super Attachment>) null;
    }

    public static Predicate<? super Thumbnail> isThumbnailOfAttachment(final Attachment attachment) {
        return (Predicate<? super Thumbnail>) null;
    }

    public static void setENTITY_FEATURED_IMAGE(Function<HasFeaturedImage, UUID> ENTITY_FEATURED_IMAGE) {
        return;
    }

    public static Function<HasFeaturedImage, UUID> getENTITY_FEATURED_IMAGE() {
        return (Function<HasFeaturedImage, UUID>) null;
    }

    public int id = 0;

    public static WebDataHelper getObject(int id) {
        WebDataHelper obj = (WebDataHelper) new Object();
        obj.id = id;
        return obj;
    }
}

