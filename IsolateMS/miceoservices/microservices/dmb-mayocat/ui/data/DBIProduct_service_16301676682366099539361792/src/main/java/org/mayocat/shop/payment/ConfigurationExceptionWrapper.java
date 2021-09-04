/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

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
 * @version $Id: dd2655dc4d707488fc7bf90289f11d67b02fdb0d $
 */
@Controller
@RequestMapping("/ms1/configurationexception/")
public class ConfigurationExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ConfigurationExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "configurationexception")
    public  @ResponseBody int ConfigurationException() {
        ConfigurationExceptionServer newServerObj = new ConfigurationExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "configurationexception")
    public  @ResponseBody int ConfigurationException(@RequestParam String message) {
        ConfigurationExceptionServer newServerObj = new ConfigurationExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "configurationexception")
    public  @ResponseBody int ConfigurationException(@RequestParam String message, @RequestParam int causeId) {
        ConfigurationExceptionServer newServerObj = new ConfigurationExceptionServer(message, Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "configurationexception")
    public  @ResponseBody int ConfigurationException(@RequestParam int causeId) {
        ConfigurationExceptionServer newServerObj = new ConfigurationExceptionServer(Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

