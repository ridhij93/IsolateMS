/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.jackson;

/**
 * @version $Id: 29f7da09b7204bc4bec25c80d48d003d1c6cdc9e $
 */
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.google.common.base.CharMatcher;
import com.google.common.collect.Lists;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Temporary solution for @JsonCreator support in DW 0.7 (this is fixed with in 0.8)
 */
public class PermissiveFuzzyEnumModule extends Module {

    private static class PermissiveEnumDeserializer extends StdScalarDeserializer<Enum<?>> {

        private final Enum<?>[] constants;

        private final List<String> acceptedValues;

        @SuppressWarnings("unchecked")
        protected PermissiveEnumDeserializer(Class<Enum<?>> clazz) {
            String uri = MicroserviceApplication.projectUri + "/ms1/permissiveenumdeserializer/permissiveenumdeserializer?callerId=" + this.id + "&clazzId=clazz.id";
            int resultTemp = new RestTemplate().getForObject(uri, int.class);
            this.id = resultTemp;
        }

        @Override
        public Enum<?> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return (Enum<?>) null;
        }
    }

    private static class PermissiveEnumDeserializers extends Deserializers.Base {

        @Override
        @SuppressWarnings("unchecked")
        public JsonDeserializer<?> findEnumDeserializer(Class<?> type, DeserializationConfig config, BeanDescription desc) throws JsonMappingException {
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
    public void setupModule(final SetupContext context) {
        return;
    }

    public int id = 0;

    public static PermissiveFuzzyEnumModule getObject(int id) {
        PermissiveFuzzyEnumModule obj = (PermissiveFuzzyEnumModule) new Object();
        obj.id = id;
        return obj;
    }
}

