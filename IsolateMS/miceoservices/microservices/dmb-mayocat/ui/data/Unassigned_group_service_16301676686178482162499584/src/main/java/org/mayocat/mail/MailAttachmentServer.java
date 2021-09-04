/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.mail;

import javax.activation.DataSource;

/**
 * @version $Id: 16b45103bf613c387db95f31f3b93de307555bf1 $
 */
public class MailAttachmentServer {

    private final String fileName;

    private final DataSource dataSource;

    public MailAttachmentServer(DataSource dataSource, String fileName) {
        this.fileName = fileName;
        this.dataSource = dataSource;
    }

    public String getFileName() {
        return fileName;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}

