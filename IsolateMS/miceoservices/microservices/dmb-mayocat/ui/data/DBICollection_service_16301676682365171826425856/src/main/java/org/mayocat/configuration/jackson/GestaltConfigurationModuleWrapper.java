/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.jackson;

import java.io.IOException;
import org.mayocat.configuration.Configurable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleSerializers;
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
 * @version $Id: 400cea0f98c7bfa5a2e16b3485deb2a78e04de10 $
 */
@Controller
@RequestMapping("/ms0/gestaltconfigurationmodule/")
public class GestaltConfigurationModuleWrapper {

    private static class ConfigurableSerializer extends JsonSerializer<Configurable> {
    }

    private static int maxId = 0;

    public static HashMap<Integer, GestaltConfigurationModuleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "gestaltconfigurationmodule")
    public  @ResponseBody int GestaltConfigurationModule() {
        GestaltConfigurationModuleServer newServerObj = new GestaltConfigurationModuleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

