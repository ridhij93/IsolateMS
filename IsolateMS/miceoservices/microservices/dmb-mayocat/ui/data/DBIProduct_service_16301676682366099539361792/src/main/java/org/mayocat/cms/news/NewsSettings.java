/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.news;

import javax.validation.Valid;
import org.mayocat.configuration.Configurable;
import org.mayocat.configuration.ExposedSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: c0fdb33ffcd89fa92f75a70bc7f4e08e1c820a49 $
 */
public class NewsSettings implements ExposedSettings {

    public Configurable<String> getNewsPageTitle() {
        return (Configurable<String>) null;
    }

    public Configurable<String> getArticlePageTitle() {
        return (Configurable<String>) null;
    }

    @Override
    public String getKey() {
        return (String) null;
    }

    public void setNewsPageTitle(Configurable<String> newsPageTitle) {
        return;
    }

    public void setArticlePageTitle(Configurable<String> articlePageTitle) {
        return;
    }

    public int id = 0;

    public static NewsSettings getObject(int id) {
        NewsSettings obj = (NewsSettings) new Object();
        obj.id = id;
        return obj;
    }
}

