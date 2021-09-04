/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.store.memory;

import java.util.Map;
import java.util.UUID;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.shop.customer.model.Customer;
import org.mayocat.shop.payment.InvalidGatewayDataException;
import org.mayocat.shop.payment.model.GatewayCustomerData;
import org.mayocat.shop.payment.model.GatewayTenantData;
import org.mayocat.shop.payment.store.GatewayDataStore;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * In-memory implementation of {@link GatewayDataStore}
 *
 * @version $Id: 090c6060679143864b82b7d61bb4f286648ddfd5 $
 */
@Component("memory")
public class MemoryGatewayDataStore implements GatewayDataStore {

    static class Key {

        Key(UUID id, String gateway, String type) {
            String uri = MicroserviceApplication.projectUri + "/ms1/key/key?callerId=" + this.id + "&idId=id.id&gateway=gateway&type=type";
            int resultTemp = new RestTemplate().getForObject(uri, int.class);
            this.id = resultTemp;
        }

        private UUID id;

        private String gateway;

        private String type;

        @Override
        public boolean equals(Object obj) {
            return (Boolean) null;
        }

        @Override
        public int hashCode() {
            return (Integer) null;
        }
    }

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
    public void storeTenantData(GatewayTenantData tenantData) throws InvalidGatewayDataException {
        return;
    }

    public void setStore(Map<Key, Object> store) {
        return;
    }

    public Map<Key, Object> getStore() {
        return (Map<Key, Object>) null;
    }

    public int id = 0;

    public static MemoryGatewayDataStore getObject(int id) {
        MemoryGatewayDataStore obj = (MemoryGatewayDataStore) new Object();
        obj.id = id;
        return obj;
    }
}

