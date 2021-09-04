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
 * @version $Id: 59db20100cf8ef909b31b2af4ade3a5399679274 $
 */
@Controller
@RequestMapping("/ms5/v0074_0002__generate_uuids/")
public class V0074_0002__generate_uuidsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, V0074_0002__generate_uuidsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "v0074_0002__generate_uuids")
    public  @ResponseBody int V0074_0002__generate_uuids() {
        V0074_0002__generate_uuidsServer newServerObj = new V0074_0002__generate_uuidsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

