/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.dao;

import java.util.UUID;
import org.mayocat.shop.invoicing.model.InvoiceNumber;
import org.mayocat.shop.invoicing.store.jdbi.mapper.InvoiceNumberMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.mixins.Transactional;
import org.skife.jdbi.v2.sqlobject.stringtemplate.UseStringTemplate3StatementLocator;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 3c28b2fdd796e47d6a3c10d354b56e97223c3250 $
 */
@UseStringTemplate3StatementLocator
@RegisterMapper(InvoiceNumberMapper.class)
public abstract class InvoiceNumberDao implements Transactional<InvoiceNumberDao> {

    @SqlUpdate
    public abstract void createInvoiceNumber(@BindBean("invoiceNumber") InvoiceNumber number) {
        return;
    }

    @SqlQuery
    public abstract InvoiceNumber findForOrderId(@Bind("orderId") UUID orderId) {
        return (InvoiceNumber) null;
    }

    @SqlQuery
    public abstract Integer getCountForPrefix(@Bind("prefix") String prefix) {
        return (Integer) null;
    }

    public int id = 0;

    public static InvoiceNumberDao getObject(int id) {
        InvoiceNumberDao obj = (InvoiceNumberDao) new Object();
        obj.id = id;
        return obj;
    }
}

