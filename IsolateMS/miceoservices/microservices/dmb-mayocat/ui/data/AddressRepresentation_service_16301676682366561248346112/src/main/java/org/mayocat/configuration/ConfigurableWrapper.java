/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.validation.ValidationMethod;
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
 * The type of a settings field whose value can be overridden at the tenant level. Useful for {@link
 * ExposedSettings} settings classes.
 *
 * @version $Id: ec1261fc58a486d390fc9167ac7634aa2eb0106e $
 */
@Controller
@RequestMapping("/ms2/configurable/")
public class ConfigurableWrapper<T> {

    private static int maxId = 0;

    public static HashMap<Integer, ConfigurableServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "configurable")
    public  @ResponseBody int Configurable() {
        ConfigurableServer newServerObj = new ConfigurableServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "configurable")
    public  @ResponseBody int Configurable(@RequestParam int defaultValueId) {
        ConfigurableServer newServerObj = new ConfigurableServer(T.getObject(defaultValueId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "configurable")
    public  @ResponseBody int Configurable(@RequestParam int defaultValueId, @RequestParam boolean configurable) {
        ConfigurableServer newServerObj = new ConfigurableServer(T.getObject(defaultValueId), configurable);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "configurable")
    public  @ResponseBody int Configurable(@RequestParam int defaultValueId, @RequestParam boolean configurable, @RequestParam boolean visible) {
        ConfigurableServer newServerObj = new ConfigurableServer(T.getObject(defaultValueId), configurable, visible);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

