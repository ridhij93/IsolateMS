/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.resources;

import java.util.HashSet;
import java.util.Set;
import org.mayocat.attachment.model.Attachment;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 830910393764aae88b7ef850b50492db2ac72a7d $
 */
public class AbstractWebViewResource {

    public static boolean isImage(Attachment attachment) {
        return (Boolean) null;
    }

    public static Set<String> getIMAGE_EXTENSIONS() {
        return (Set<String>) null;
    }

    public int id = 0;

    public static AbstractWebViewResource getObject(int id) {
        AbstractWebViewResource obj = (AbstractWebViewResource) new Object();
        obj.id = id;
        return obj;
    }
}

