/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

import javax.validation.Valid;
import org.hibernate.validator.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SecuritySettings {

    public String getEncryptionKey() {
        return (String) null;
    }

    public String getSigningKey() {
        return (String) null;
    }

    public Integer getPasswordSaltLogRounds() {
        return (Integer) null;
    }

    public void setEncryptionKey(String encryptionKey) {
        return;
    }

    public void setSigningKey(String signingKey) {
        return;
    }

    public void setPasswordSaltLogRounds(Integer passwordSaltLogRounds) {
        return;
    }

    public int id = 0;

    public static SecuritySettings getObject(int id) {
        SecuritySettings obj = (SecuritySettings) new Object();
        obj.id = id;
        return obj;
    }
}

