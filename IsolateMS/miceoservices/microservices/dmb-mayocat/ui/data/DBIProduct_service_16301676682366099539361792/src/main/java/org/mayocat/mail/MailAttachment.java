/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.mail;

import javax.activation.DataSource;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 16b45103bf613c387db95f31f3b93de307555bf1 $
 */
public class MailAttachment {

    public MailAttachment(DataSource dataSource, String fileName) {
        String uri = MicroserviceApplication.projectUri + "/ms5/mailattachment/mailattachment?callerId=" + this.id + "&dataSourceId=dataSource.id&fileName=fileName";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getFileName() {
        return (String) null;
    }

    public DataSource getDataSource() {
        return (DataSource) null;
    }

    public int id = 0;

    public static MailAttachment getObject(int id) {
        MailAttachment obj = (MailAttachment) new Object();
        obj.id = id;
        return obj;
    }
}

