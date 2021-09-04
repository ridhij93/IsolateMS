/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.representations;

/**
 * @version $Id: 087a390733e699428c85819e0ffe7a8366b45969 $
 */
public class LocaleRepresentationServer {

    private String tag;

    private String name;

    public LocaleRepresentationServer(String tag, String name) {
        this.tag = tag;
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public String getName() {
        return name;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setName(String name) {
        this.name = name;
    }
}

