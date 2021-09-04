/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.meta;

import org.mayocat.accounts.model.User;
import org.mayocat.meta.EntityMeta;
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
 * @version $Id: 93f68d17d36d51fe8de31d02b768073a7423ee06 $
 */
@Controller
@RequestMapping("/ms1/userentity/")
public class UserEntityWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, UserEntityServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "userentity")
    public  @ResponseBody int UserEntity() {
        UserEntityServer newServerObj = new UserEntityServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

