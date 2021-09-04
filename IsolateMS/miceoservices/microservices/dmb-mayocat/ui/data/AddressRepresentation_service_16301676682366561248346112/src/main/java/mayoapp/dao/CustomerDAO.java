/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.dao;

import java.util.UUID;
import org.mayocat.addons.store.dbi.AddonsHelper;
import org.mayocat.shop.customer.model.Customer;
import org.mayocat.shop.customer.store.jdbi.mapper.CustomerMapper;
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
 * @version $Id: 484c41d3c5c4cf0d494ea2b1b0b0f2e5eb472025 $
 */
@RegisterMapper(CustomerMapper.class)
@UseStringTemplate3StatementLocator
public abstract class CustomerDAO implements EntityDAO<Customer>, Transactional<CustomerDAO>, AddonsDAO<Customer> {

    @SqlUpdate
    public abstract void create(@BindBean("customer") Customer customer) {
        return;
    }

    @SqlUpdate
    public abstract void updateCustomer(@BindBean("customer") Customer customer) {
        return;
    }

    @SqlQuery
    public abstract Customer findByUserId(@Bind("userId") UUID userId) {
        return (Customer) null;
    }

    public void createOrUpdateAddons(Customer entity) {
        return;
    }

    public int id = 0;

    public static CustomerDAO getObject(int id) {
        CustomerDAO obj = (CustomerDAO) new Object();
        obj.id = id;
        return obj;
    }
}

