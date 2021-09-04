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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 3c28b2fdd796e47d6a3c10d354b56e97223c3250 $
 */
@UseStringTemplate3StatementLocator
@RegisterMapper(InvoiceNumberMapper.class)
public abstract class InvoiceNumberDaoWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, InvoiceNumberDaoServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "invoicenumberdao")
    public  @ResponseBody int InvoiceNumberDao() {
        InvoiceNumberDaoServer newServerObj = new InvoiceNumberDaoServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

