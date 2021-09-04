/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.migrations;

import java.util.Arrays;
import java.util.List;
import org.mayocat.flyway.migrations.AbstractUUIDGenerationMigration;
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
 * @version $Id: c268a7dc089ee8d98d0f02f4dd37c918f2ab73de $
 */
@Controller
@RequestMapping("/ms0/v0074_0023__generate_uuids_for_addresses/")
public class V0074_0023__generate_uuids_for_addressesWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, V0074_0023__generate_uuids_for_addressesServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "v0074_0023__generate_uuids_for_addresses")
    public  @ResponseBody int V0074_0023__generate_uuids_for_addresses() {
        V0074_0023__generate_uuids_for_addressesServer newServerObj = new V0074_0023__generate_uuids_for_addressesServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

