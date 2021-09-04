/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

import java.util.ArrayList;
import java.util.List;
import org.mayocat.accounts.meta.TenantEntity;
import org.mayocat.meta.EntityMeta;
import org.mayocat.Module;
import org.mayocat.accounts.meta.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 62dbc44939ff76df75b6e31872b2ecf8758bcf89 $
 */
@Controller
@RequestMapping("/ms2/accountsmodule/")
public class AccountsModuleWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AccountsModuleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "accountsmodule")
    public  @ResponseBody int AccountsModule() {
        AccountsModuleServer newServerObj = new AccountsModuleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

