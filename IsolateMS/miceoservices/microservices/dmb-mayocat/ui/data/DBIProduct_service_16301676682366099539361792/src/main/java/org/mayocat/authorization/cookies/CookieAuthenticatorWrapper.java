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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Component("cookie")
public class CookieAuthenticatorWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CookieAuthenticatorServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "cookieauthenticator")
    public  @ResponseBody int CookieAuthenticator() {
        CookieAuthenticatorServer newServerObj = new CookieAuthenticatorServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

