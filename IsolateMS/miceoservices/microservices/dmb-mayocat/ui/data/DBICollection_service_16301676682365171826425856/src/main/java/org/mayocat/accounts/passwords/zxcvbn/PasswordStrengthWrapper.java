/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.passwords.zxcvbn;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
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
 * JSON representation of the result object given by zxcvbn.js
 *
 * @version $Id: 05b855c941144aff2dfaa7ea463f22459de0b27f $
 */
@Controller
@RequestMapping("/ms0/passwordstrength/")
public class PasswordStrengthWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PasswordStrengthServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "passwordstrength")
    public  @ResponseBody int PasswordStrength() {
        PasswordStrengthServer newServerObj = new PasswordStrengthServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

