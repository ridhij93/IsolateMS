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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * DAO for {@link GatewayCustomerData}
 *
 * @version $Id: 0a9c99648717726bb9557816cafc91333271efba $
 */
@RegisterMapper(GatewayCustomerDataMapper.class)
@RegisterArgumentFactory({ MapAsJsonStringArgumentFactory.class })
@UseStringTemplate3StatementLocator
public abstract class GatewayDataDAO implements Transactional<GatewayDataDAO> {

    @SqlQuery
    public abstract GatewayCustomerData getCustomerData(@Bind("customerId") UUID customerId, @Bind("gateway") String gateway) {
        return (GatewayCustomerData) null;
    }

    @SqlUpdate
    public abstract void createCustomerData(@BindBean("gatewayCustomerData") GatewayCustomerData gatewayCustomerData) {
        return;
    }

    @SqlUpdate
    public abstract void updateCustomerData(@BindBean("gatewayCustomerData") GatewayCustomerData gatewayCustomerData) {
        return;
    }

    @SqlQuery
    public abstract GatewayTenantData getTenantData(@Bind("tenantId") UUID id, @Bind("gateway") String gatewayId) {
        return (GatewayTenantData) null;
    }

    @SqlUpdate
    public abstract void updateTenantData(@BindBean("gatewayTenantData") GatewayTenantData tenantData) {
        return;
    }

    @SqlUpdate
    public abstract void createTenantData(@BindBean("gatewayTenantData") GatewayTenantData tenantData) {
        return;
    }

    public int id = 0;

    public static GatewayDataDAO getObject(int id) {
        GatewayDataDAO obj = (GatewayDataDAO) new Object();
        obj.id = id;
        return obj;
    }
}

