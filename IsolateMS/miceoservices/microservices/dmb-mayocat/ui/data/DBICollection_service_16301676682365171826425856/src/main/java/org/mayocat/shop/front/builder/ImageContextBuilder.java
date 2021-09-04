/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.builder;

import java.text.MessageFormat;
import org.mayocat.configuration.images.ImageFormatDefinition;
import org.mayocat.image.model.Image;
import org.mayocat.image.model.Thumbnail;
import org.mayocat.image.util.ImageUtils;
import org.mayocat.shop.front.context.ContextConstants;
import org.mayocat.shop.front.context.ImageContext;
import org.mayocat.shop.front.util.ContextUtils;
import org.mayocat.theme.ThemeDefinition;
import com.google.common.base.Optional;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: e930cda14815cb9a21f0f6fe26eb35404beee69f $
 */
public class ImageContextBuilder {

    public ImageContextBuilder(ThemeDefinition theme) {
        String uri = MicroserviceApplication.projectUri + "/ms0/imagecontextbuilder/imagecontextbuilder?callerId=" + this.id + "&themeId=theme.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public ImageContext createImageContext(Image image) {
        return (ImageContext) null;
    }

    public ImageContext createImageContext(Image image, boolean featured) {
        return (ImageContext) null;
    }

    public ImageContext createPlaceholderImageContext() {
        return (ImageContext) null;
    }

    public ImageContext createPlaceholderImageContext(boolean featured) {
        return (ImageContext) null;
    }

    private Optional<Thumbnail> findBestFit(Image image, Integer width, Integer height) {
        return (Optional<Thumbnail>) null;
    }

    public void setTheme(ThemeDefinition theme) {
        return;
    }

    public ThemeDefinition getTheme() {
        return (ThemeDefinition) null;
    }

    public int id = 0;

    public static ImageContextBuilder getObject(int id) {
        ImageContextBuilder obj = (ImageContextBuilder) new Object();
        obj.id = id;
        return obj;
    }
}

