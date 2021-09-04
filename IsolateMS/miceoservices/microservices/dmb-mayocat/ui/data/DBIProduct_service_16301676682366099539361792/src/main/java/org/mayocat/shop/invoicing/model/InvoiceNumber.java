/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.invoicing.model;

import java.util.Date;
import java.util.UUID;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: abd58628315e8a2d134e1c0a25aea042a9cea3d8 $
 */
public class InvoiceNumber {

    public InvoiceNumber(UUID orderId, String number, Date generationDate) {
        String uri = MicroserviceApplication.projectUri + "/msnull/invoicenumber/invoicenumber?callerId=" + this.id + "&orderIdId=orderId.id&number=number&generationDate=generationDate";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public UUID getOrderId() {
        return (UUID) null;
    }

    public String getNumber() {
        return (String) null;
    }

    public Date getGenerationDate() {
        return (Date) null;
    }

    public int id = 0;

    public static InvoiceNumber getObject(int id) {
        InvoiceNumber obj = (InvoiceNumber) new Object();
        obj.id = id;
        return obj;
    }
}

