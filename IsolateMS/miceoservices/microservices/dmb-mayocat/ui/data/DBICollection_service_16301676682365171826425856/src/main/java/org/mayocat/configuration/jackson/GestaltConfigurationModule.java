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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 400cea0f98c7bfa5a2e16b3485deb2a78e04de10 $
 */
public class GestaltConfigurationModule extends Module {

    private static class ConfigurableSerializer extends JsonSerializer<Configurable> {

        @Override
        public void serialize(Configurable value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            return;
        }
    }

    @Override
    public String getModuleName() {
        return (String) null;
    }

    @Override
    public Version version() {
        return (Version) null;
    }

    @Override
    public void setupModule(SetupContext context) {
        return;
    }

    public int id = 0;

    public static GestaltConfigurationModule getObject(int id) {
        GestaltConfigurationModule obj = (GestaltConfigurationModule) new Object();
        obj.id = id;
        return obj;
    }
}

