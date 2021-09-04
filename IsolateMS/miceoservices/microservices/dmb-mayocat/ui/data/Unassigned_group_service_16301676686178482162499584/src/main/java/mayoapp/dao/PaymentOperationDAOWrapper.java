/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.dao;

import java.util.List;
import java.util.UUID;
import org.mayocat.shop.payment.model.PaymentOperation;
import org.mayocat.shop.payment.store.jdbi.mapper.PaymentOperationMapper;
import org.mayocat.store.rdbms.dbi.argument.MapAsJsonStringArgumentFactory;
import org.mayocat.shop.payment.store.jdbi.argument.PaymentOperationResultArgumentFactory;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterArgumentFactory;
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
 * @version $Id: 3c846f75122b26a9f1dd1e691fcc5911e1ee545d $
 */
@RegisterMapper(PaymentOperationMapper.class)
@RegisterArgumentFactory({ MapAsJsonStringArgumentFactory.class, PaymentOperationResultArgumentFactory.class })
@UseStringTemplate3StatementLocator
public abstract class PaymentOperationDAOWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PaymentOperationDAOServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "paymentoperationdao")
    public  @ResponseBody int PaymentOperationDAO() {
        PaymentOperationDAOServer newServerObj = new PaymentOperationDAOServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

