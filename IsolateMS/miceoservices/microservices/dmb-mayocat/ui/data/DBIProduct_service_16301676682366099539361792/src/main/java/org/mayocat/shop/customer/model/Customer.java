/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.customer.model;

import java.util.Map;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.Association;
import org.mayocat.model.Entity;
import org.mayocat.model.HasAddons;
import org.mayocat.model.annotation.Index;
import com.google.common.base.Optional;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 231010000bec41f2afcd3c54ed618af4055fd118 $
 */
public class Customer implements Entity, HasAddons {

    public String getSlug() {
        return (String) null;
    }

    public void setSlug(String slug) {
        return;
    }

    public UUID getId() {
        return (UUID) null;
    }

    public void setId(UUID id) {
        return;
    }

    public String getEmail() {
        return (String) null;
    }

    public void setEmail(String email) {
        return;
    }

    public String getFirstName() {
        return (String) null;
    }

    public void setFirstName(String firstName) {
        return;
    }

    public String getLastName() {
        return (String) null;
    }

    public void setLastName(String lastName) {
        return;
    }

    public String getPhoneNumber() {
        return (String) null;
    }

    public void setPhoneNumber(String phoneNumber) {
        return;
    }

    public String getCompany() {
        return (String) null;
    }

    public void setCompany(String company) {
        return;
    }

    public Optional<UUID> getUserId() {
        return (Optional<UUID>) null;
    }

    public void setUserId(UUID userId) {
        return;
    }

    @Override
    public Association<Map<String, AddonGroup>> getAddons() {
        return (Association<Map<String, AddonGroup>>) null;
    }

    @Override
    public void setAddons(Map<String, AddonGroup> addons) {
        return;
    }

    public int id = 0;

    public static Customer getObject(int id) {
        Customer obj = (Customer) new Object();
        obj.id = id;
        return obj;
    }
}

