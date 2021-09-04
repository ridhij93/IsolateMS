/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.model;

import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.mayocat.jackson.PasswordSerializer;
import org.mayocat.model.Entity;
import org.mayocat.model.annotation.Index;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class User implements Entity {

    // /////////////////////////////////////////////////
    public User() {
        String uri = MicroserviceApplication.projectUri + "/ms1/user/usercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public User(UUID id) {
        String uri = MicroserviceApplication.projectUri + "/ms1/user/user?callerId=" + this.id + "&idId=id.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    // /////////////////////////////////////////////////
    public String getEmail() {
        return (String) null;
    }

    public void setEmail(String email) {
        return;
    }

    public String getPassword() {
        return (String) null;
    }

    public void setPassword(String password) {
        return;
    }

    public UUID getId() {
        return (UUID) null;
    }

    public void setId(UUID id) {
        return;
    }

    public String getSlug() {
        return (String) null;
    }

    public void setSlug(String slug) {
        return;
    }

    public Boolean isActive() {
        return (Boolean) null;
    }

    public Boolean getActive() {
        return (Boolean) null;
    }

    public void setActive(Boolean active) {
        return;
    }

    public String getValidationKey() {
        return (String) null;
    }

    public void setValidationKey(String validationKey) {
        return;
    }

    public boolean isGlobal() {
        return (Boolean) null;
    }

    public void setGlobal(boolean global) {
        return;
    }

    public boolean getGlobal() {
        return (Boolean) null;
    }

    public int id = 0;

    public static User getObject(int id) {
        User obj = (User) new Object();
        obj.id = id;
        return obj;
    }
}

