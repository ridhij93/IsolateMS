/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.authorization.cookies;

import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.accounts.store.UserStore;
import org.mayocat.authorization.Authenticator;
import org.mayocat.security.Cipher;
import org.mayocat.security.EncryptionException;
import org.mayocat.security.PasswordManager;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.model.User;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Component("cookie")
public class CookieAuthenticator implements Authenticator {

    public boolean respondTo(String headerName, String headerValue) {
        return (Boolean) null;
    }

    @Override
    public Optional<User> verify(String value, Tenant tenant) {
        return (Optional<User>) null;
    }

    public void setUserStore(Provider<UserStore> userStore) {
        return;
    }

    public Provider<UserStore> getUserStore() {
        return (Provider<UserStore>) null;
    }

    public void setPasswordManager(PasswordManager passwordManager) {
        return;
    }

    public PasswordManager getPasswordManager() {
        return (PasswordManager) null;
    }

    public void setCipher(Cipher cipher) {
        return;
    }

    public Cipher getCipher() {
        return (Cipher) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static CookieAuthenticator getObject(int id) {
        CookieAuthenticator obj = (CookieAuthenticator) new Object();
        obj.id = id;
        return obj;
    }
}

