/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.authorization.basic;

import java.io.UnsupportedEncodingException;
import javax.inject.Inject;
import javax.inject.Provider;
import org.eclipse.jetty.util.B64Code;
import org.eclipse.jetty.util.StringUtil;
import org.mayocat.authorization.Authenticator;
import org.mayocat.security.PasswordManager;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.model.User;
import org.mayocat.accounts.store.UserStore;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Optional;
import com.google.common.net.HttpHeaders;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Component("basic")
public class BasicAuthenticatorWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, BasicAuthenticatorServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "basicauthenticator")
    public  @ResponseBody int BasicAuthenticator() {
        BasicAuthenticatorServer newServerObj = new BasicAuthenticatorServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

