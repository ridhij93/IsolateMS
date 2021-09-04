/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.store.jdbi;

import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.shop.customer.model.Customer;
import org.mayocat.shop.payment.InvalidGatewayDataException;
import org.mayocat.shop.payment.model.GatewayCustomerData;
import org.mayocat.shop.payment.model.GatewayTenantData;
import org.mayocat.shop.payment.store.GatewayDataStore;
import org.mayocat.store.rdbms.dbi.DBIProvider;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import com.google.common.base.Optional;
import mayoapp.dao.GatewayDataDAO;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * DBI implementation of {@link org.mayocat.shop.payment.store.GatewayDataStore}
 *
 * @version $Id: e0bea89d9d2989d90c1600ecee3cafb1d446fe54 $
 */
@Component
public class DBIGatewayDataStore implements GatewayDataStore, Initializable {

    @Override
    public Optional<GatewayCustomerData> getCustomerData(Customer customer, String gatewayId) {
        return (Optional<GatewayCustomerData>) null;
    }

    @Override
    public void storeCustomerData(GatewayCustomerData customerData) throws InvalidGatewayDataException {
        return;
    }

    @Override
    public Optional<GatewayTenantData> getTenantData(Tenant tenant, String gatewayId) {
        return (Optional<GatewayTenantData>) null;
    }

    @Override
    public void storeTenantData(GatewayTenantData tenantData) {
        String uri = MicroserviceApplication.projectUri + "/ms1/dbigatewaydatastore/storetenantdata?callerId=" + this.id + "&tenantDataId=tenantData.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    @Override
    public void initialize() {
        String uri = MicroserviceApplication.projectUri + "/ms1/dbigatewaydatastore/initializecallerId=" + this.id + "";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    public void setDbi(DBIProvider dbi) {
        return;
    }

    public DBIProvider getDbi() {
        return (DBIProvider) null;
    }

    public void setDao(GatewayDataDAO dao) {
        return;
    }

    public GatewayDataDAO getDao() {
        return (GatewayDataDAO) null;
    }

    public int id = 0;

    public static DBIGatewayDataStore getObject(int id) {
        DBIGatewayDataStore obj = (DBIGatewayDataStore) new Object();
        obj.id = id;
        return obj;
    }
}

