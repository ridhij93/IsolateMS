/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.store.jdbi;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.context.WebContext;
import org.mayocat.shop.shipping.Strategy;
import org.mayocat.shop.shipping.model.Carrier;
import org.mayocat.shop.shipping.model.CarrierRule;
import org.mayocat.shop.shipping.store.CarrierStore;
import org.mayocat.store.rdbms.dbi.DBIProvider;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import mayoapp.dao.CarrierDAO;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 1ef819cf53f5655c82a707aa606919550ab01ff5 $
 */
@Component
public class DBICarrierStore implements CarrierStore, Initializable {

    public Carrier findById(UUID id) {
        return (Carrier) null;
    }

    public Set<Carrier> findAll() {
        return (Set<Carrier>) null;
    }

    public Set<Carrier> findAll(Strategy strategy) {
        return (Set<Carrier>) null;
    }

    public void createCarrier(Carrier carrier) {
        return;
    }

    public void updateCarrier(Carrier carrier) {
        return;
    }

    public void deleteCarrier(Carrier carrier) {
        return;
    }

    @Override
    public void updatePositions(List<Carrier> carriers) {
        return;
    }

    protected UUID getTenant() {
        return (UUID) null;
    }

    @Override
    public void initialize() throws InitializationException {
        return;
    }

    public void setContext(WebContext context) {
        return;
    }

    public WebContext getContext() {
        return (WebContext) null;
    }

    public void setDbi(DBIProvider dbi) {
        return;
    }

    public DBIProvider getDbi() {
        return (DBIProvider) null;
    }

    public void setCarrierDAO(CarrierDAO carrierDAO) {
        return;
    }

    public CarrierDAO getCarrierDAO() {
        return (CarrierDAO) null;
    }

    public int id = 0;

    public static DBICarrierStore getObject(int id) {
        DBICarrierStore obj = (DBICarrierStore) new Object();
        obj.id = id;
        return obj;
    }
}

