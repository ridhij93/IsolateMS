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

/**
 * @version $Id: c0fdb33ffcd89fa92f75a70bc7f4e08e1c820a49 $
 */
public class NewsSettingsServer implements ExposedSettings {

    @Valid
    @JsonProperty
    private Configurable<String> newsPageTitle = new Configurable<String>("{{siteName}} \u2014 News");

    @Valid
    @JsonProperty
    private Configurable<String> articlePageTitle = new Configurable<String>("{{siteName}} \u2014 {{articleTitle}}");

    public Configurable<String> getNewsPageTitle() {
        return newsPageTitle;
    }

    public Configurable<String> getArticlePageTitle() {
        return articlePageTitle;
    }

    @Override
    public String getKey() {
        return "news";
    }

    public void setNewsPageTitle(Configurable<String> newsPageTitle) {
        this.newsPageTitle = newsPageTitle;
    }

    public void setArticlePageTitle(Configurable<String> articlePageTitle) {
        this.articlePageTitle = articlePageTitle;
    }
}

