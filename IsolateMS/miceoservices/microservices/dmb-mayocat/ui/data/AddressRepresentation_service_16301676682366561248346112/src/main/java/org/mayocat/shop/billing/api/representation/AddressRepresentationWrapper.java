/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.api.representation;

import org.mayocat.shop.customer.model.Address;
import com.fasterxml.jackson.annotation.JsonInclude;
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
 * @version $Id: 570302c177f9db0dc60886b3705b0cf808b51741 $
 */
@Controller
@RequestMapping("/ms2/addressrepresentation/")
public class AddressRepresentationWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AddressRepresentationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "addressrepresentation")
    public  @ResponseBody int AddressRepresentation() {
        AddressRepresentationServer newServerObj = new AddressRepresentationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "addressrepresentation")
    public  @ResponseBody int AddressRepresentation(@RequestParam int addressId) {
        AddressRepresentationServer newServerObj = new AddressRepresentationServer(Address.getObject(addressId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

