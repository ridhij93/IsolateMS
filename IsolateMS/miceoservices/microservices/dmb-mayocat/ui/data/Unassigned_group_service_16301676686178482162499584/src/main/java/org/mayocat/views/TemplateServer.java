/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.views;

/**
 * @version $Id: dba2b6a896c4142ffddb8746abde26786f08af29 $
 */
public class TemplateServer {

    private String content;

    private String id;

    private boolean partial;

    public TemplateServer(String id, String content) {
        this(id, content, false);
    }

    public TemplateServer(String id, String content, boolean partial) {
        this.content = content;
        this.id = id;
        this.partial = partial;
    }

    public String getContent() {
        return content;
    }

    public String getId() {
        return id;
    }

    public boolean isPartial() {
        return partial;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPartial(boolean partial) {
        this.partial = partial;
    }

    public boolean getPartial() {
        return partial;
    }
}

