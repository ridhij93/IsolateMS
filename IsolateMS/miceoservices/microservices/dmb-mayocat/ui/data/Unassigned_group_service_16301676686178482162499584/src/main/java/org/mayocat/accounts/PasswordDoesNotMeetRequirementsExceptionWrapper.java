/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

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
 * @version $Id: 83f6384f3427b0f0644742d37485ee0bd51637f1 $
 */
@Controller
@RequestMapping("/ms5/passworddoesnotmeetrequirementsexception/")
public class PasswordDoesNotMeetRequirementsExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PasswordDoesNotMeetRequirementsExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "passworddoesnotmeetrequirementsexception")
    public  @ResponseBody int PasswordDoesNotMeetRequirementsException() {
        PasswordDoesNotMeetRequirementsExceptionServer newServerObj = new PasswordDoesNotMeetRequirementsExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "passworddoesnotmeetrequirementsexception")
    public  @ResponseBody int PasswordDoesNotMeetRequirementsException(@RequestParam String message) {
        PasswordDoesNotMeetRequirementsExceptionServer newServerObj = new PasswordDoesNotMeetRequirementsExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

