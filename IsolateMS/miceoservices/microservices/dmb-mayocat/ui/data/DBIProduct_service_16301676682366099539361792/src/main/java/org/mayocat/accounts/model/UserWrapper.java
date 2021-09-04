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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ms1/user/")
public class UserWrapper {

    // /////////////////////////////////////////////////
    // /////////////////////////////////////////////////
    private static int maxId = 0;

    public static HashMap<Integer, UserServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "user")
    public  @ResponseBody int User() {
        UserServer newServerObj = new UserServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "user")
    public  @ResponseBody int User(@RequestParam int idId) {
        UserServer newServerObj = new UserServer(UUID.getObject(idId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // /////////////////////////////////////////////////
    // /////////////////////////////////////////////////
}

