/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.dao;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.mayocat.shop.billing.model.Order;
import org.mayocat.shop.billing.model.OrderItem;
import org.mayocat.shop.billing.store.jdbi.argument.CurrencyAsCurrencyCodeArgumentFactory;
import org.mayocat.shop.billing.store.jdbi.argument.OrderStatusArgumentFactory;
import org.mayocat.shop.billing.store.jdbi.mapper.OrderMapper;
import org.mayocat.store.rdbms.dbi.argument.DateAsTimestampArgumentFactory;
import org.mayocat.store.rdbms.dbi.argument.MapAsJsonStringArgumentFactory;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlBatch;
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
 * @version $Id: 3f02aa443d4394d2e78cbd1259f131cee5eed716 $
 */
@RegisterMapper(OrderMapper.class)
@RegisterArgumentFactory({ DateAsTimestampArgumentFactory.class, CurrencyAsCurrencyCodeArgumentFactory.class, OrderStatusArgumentFactory.class, MapAsJsonStringArgumentFactory.class })
@UseStringTemplate3StatementLocator
public abstract class OrderDAOWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, OrderDAOServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "orderdao")
    public  @ResponseBody int OrderDAO() {
        OrderDAOServer newServerObj = new OrderDAOServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

