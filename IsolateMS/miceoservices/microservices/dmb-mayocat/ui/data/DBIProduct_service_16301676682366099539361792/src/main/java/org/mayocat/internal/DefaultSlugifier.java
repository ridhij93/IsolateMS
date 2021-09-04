/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.internal;

import java.text.Normalizer;
import org.mayocat.Slugifier;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 5354b6de80febcab58cd190f16fd300ea705d10b $
 */
@Component
public class DefaultSlugifier implements Slugifier {

    @Override
    public String slugify(String toSlugify) {
        return (String) null;
    }

    public int id = 0;

    public static DefaultSlugifier getObject(int id) {
        DefaultSlugifier obj = (DefaultSlugifier) new Object();
        obj.id = id;
        return obj;
    }
}

