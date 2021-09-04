/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.security;

import javax.inject.Inject;
import org.mayocat.configuration.SecuritySettings;
import org.mindrot.jbcrypt.BCrypt;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Component(hints = { "bcrypt", "default" })
public class BCryptPasswordManager implements PasswordManager {

    public String hashPassword(String password) {
        return (String) null;
    }

    public boolean verifyPassword(String candidate, String hashed) {
        return (Boolean) null;
    }

    public void setConfiguration(SecuritySettings configuration) {
        return;
    }

    public SecuritySettings getConfiguration() {
        return (SecuritySettings) null;
    }

    public int id = 0;

    public static BCryptPasswordManager getObject(int id) {
        BCryptPasswordManager obj = (BCryptPasswordManager) new Object();
        obj.id = id;
        return obj;
    }
}

