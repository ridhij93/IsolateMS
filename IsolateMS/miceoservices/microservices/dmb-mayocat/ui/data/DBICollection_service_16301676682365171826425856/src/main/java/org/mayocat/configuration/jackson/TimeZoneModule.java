/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.jackson;

import java.io.IOException;
import java.util.TimeZone;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 2f9a2b30189151640b5a35e913077e4cb9066c9d $
 */
public class TimeZoneModule extends Module {

    private static class TimeZoneDeserializer extends JsonDeserializer<TimeZone> {

        @Override
        public TimeZone deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            return (TimeZone) null;
        }
    }

    private static class TimeZoneDeserializers extends Deserializers.Base {

        @Override
        public JsonDeserializer<?> findBeanDeserializer(JavaType type, DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException {
            return (JsonDeserializer<?>) null;
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
    public void setupModule(SetupContext setupContext) {
        return;
    }

    public int id = 0;

    public static TimeZoneModule getObject(int id) {
        TimeZoneModule obj = (TimeZoneModule) new Object();
        obj.id = id;
        return obj;
    }
}

