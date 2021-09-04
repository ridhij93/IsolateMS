/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.representations;

/**
 * @version $Id: d0248d25b5fd631f96a9f8947c511adb562e12dc $
 */
public class EntityReferenceRepresentationServer extends LinkRepresentation {

    private String title;

    private String slug;

    public EntityReferenceRepresentationServer() {
        // No-arg constructor required for Jackson deserialization
        super();
    }

    public EntityReferenceRepresentationServer(String href, String slug, String title) {
        super(href);
        this.title = title;
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public String getSlug() {
        return slug;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}

