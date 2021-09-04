/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.views;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 71930d4b6a1acfe65ae1584f19e670dd444da810 $
 */
public class WebView {

    public enum Option {

        FALLBACK_ON_DEFAULT_THEME, FALLBACK_ON_GLOBAL_TEMPLATES
    }

    public Path template() {
        return (Path) null;
    }

    public WebView template(Path path) {
        return (WebView) null;
    }

    public WebView template(String path) {
        return (WebView) null;
    }

    public Map<String, Object> data() {
        return (Map<String, Object>) null;
    }

    public WebView data(Map<String, Object> context) {
        return (WebView) null;
    }

    public WebView data(String key, Map<String, Object> data) {
        return (WebView) null;
    }

    public Optional<String> model() {
        return (Optional<String>) null;
    }

    public WebView model(Optional<String> model) {
        return (WebView) null;
    }

    public WebView model(String model) {
        return (WebView) null;
    }

    public WebView with(Option... options) {
        return (WebView) null;
    }

    public boolean hasOption(Option option) {
        return (Boolean) null;
    }

    public void setTemplate(Path template) {
        return;
    }

    public Path getTemplate() {
        return (Path) null;
    }

    public void setModel(Optional<String> model) {
        return;
    }

    public Optional<String> getModel() {
        return (Optional<String>) null;
    }

    public void setData(Map<String, Object> data) {
        return;
    }

    public Map<String, Object> getData() {
        return (Map<String, Object>) null;
    }

    public void setOptions(Set<Option> options) {
        return;
    }

    public Set<Option> getOptions() {
        return (Set<Option>) null;
    }

    public int id = 0;

    public static WebView getObject(int id) {
        WebView obj = (WebView) new Object();
        obj.id = id;
        return obj;
    }
}

