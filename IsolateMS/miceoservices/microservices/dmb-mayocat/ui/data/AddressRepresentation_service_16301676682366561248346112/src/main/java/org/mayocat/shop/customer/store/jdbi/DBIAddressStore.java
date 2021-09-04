/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.customer.store.jdbi;

import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import javax.validation.Valid;
import org.mayocat.shop.customer.store.AddressStore;
import org.mayocat.shop.customer.model.Address;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.rdbms.dbi.DBIProvider;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import mayoapp.dao.AddressDAO;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: db61c52dead7b0f41106ba8ce909af65590b7d09 $
 */
@Component(hints = { "jdbi", "default" })
public class DBIAddressStore implements AddressStore, Initializable {

    @Override
    public Address create(@Valid Address address) throws EntityAlreadyExistsException, InvalidEntityException {
        return (Address) null;
    }

    @Override
    public Address findByCustomerIdAndType(UUID customerId, String type) {
        return (Address) null;
    }

    @Override
    public void update(@Valid Address address) throws EntityDoesNotExistException, InvalidEntityException {
        return;
    }

    @Override
    public void delete(@Valid Address address) throws EntityDoesNotExistException {
        return;
    }

    @Override
    public Integer countAll() {
        return (Integer) null;
    }

    @Override
    public List<Address> findAll(Integer number, Integer offset) {
        return (List<Address>) null;
    }

    @Override
    public List<Address> findByIds(List<UUID> ids) {
        return (List<Address>) null;
    }

    @Override
    public Address findById(UUID id) {
        return (Address) null;
    }

    @Override
    public void initialize() throws InitializationException {
        return;
    }

    public void setDbi(DBIProvider dbi) {
        return;
    }

    public DBIProvider getDbi() {
        return (DBIProvider) null;
    }

    public void setDao(AddressDAO dao) {
        return;
    }

    public AddressDAO getDao() {
        return (AddressDAO) null;
    }

    public int id = 0;

    public static DBIAddressStore getObject(int id) {
        DBIAddressStore obj = (DBIAddressStore) new Object();
        obj.id = id;
        return obj;
    }
}

