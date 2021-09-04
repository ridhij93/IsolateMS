/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.webhooks;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import org.mayocat.jackson.OptionalStringDeserializer;
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
 * @version $Id: d06817c4f90be9dc831dd6d9849e3b4285c1f8e5 $
 *
 * Registered hook : a URL that is called when an event occurs. An optional secret can be given for
 * computing a signature that attests the hook HTTP call authenticity.
 */
@Controller
@RequestMapping("/ms1/hook/")
public class HookWrapper {

    // And I don't need no hook for this shiiiit
    private static int maxId = 0;

    public static HashMap<Integer, HookServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "hook")
    public  @ResponseBody int Hook() {
        HookServer newServerObj = new HookServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // And I don't need no hook for this shiiiit
}

