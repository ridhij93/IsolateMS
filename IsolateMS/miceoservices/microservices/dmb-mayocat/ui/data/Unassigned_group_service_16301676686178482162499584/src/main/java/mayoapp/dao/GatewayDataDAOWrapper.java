/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.dao;

import java.util.UUID;
import org.mayocat.shop.payment.model.GatewayCustomerData;
import org.mayocat.shop.payment.model.GatewayTenantData;
import org.mayocat.shop.payment.store.jdbi.mapper.GatewayCustomerDataMapper;
import org.mayocat.store.rdbms.dbi.argument.MapAsJsonStringArgumentFactory;
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
 * DAO for {@link GatewayCustomerData}
 *
 * @version $Id: 0a9c99648717726bb9557816cafc91333271efba $
 */
@RegisterMapper(GatewayCustomerDataMapper.class)
@RegisterArgumentFactory({ MapAsJsonStringArgumentFactory.class })
@UseStringTemplate3StatementLocator
public abstract class GatewayDataDAOWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, GatewayDataDAOServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "gatewaydatadao")
    public  @ResponseBody int GatewayDataDAO() {
        GatewayDataDAOServer newServerObj = new GatewayDataDAOServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

