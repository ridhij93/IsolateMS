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
 * Temporary solution for @JsonCreator support in DW 0.7 (this is fixed with in 0.8)
 */
@Controller
@RequestMapping("/ms1/permissivefuzzyenummodule/")
public class PermissiveFuzzyEnumModuleWrapper {

    private static class PermissiveEnumDeserializer extends StdScalarDeserializer<Enum<?>> {

        private final Enum<?>[] constants;

        private final List<String> acceptedValues;

        @SuppressWarnings("unchecked")
        protected PermissiveEnumDeserializer(Class<Enum<?>> clazz) {
            super(clazz);
            this.constants = ((Class<Enum<?>>) handledType()).getEnumConstants();
            this.acceptedValues = Lists.newArrayList();
            for (Enum<?> constant : constants) {
                acceptedValues.add(constant.name());
            }
        }
    }

    private static class PermissiveEnumDeserializers extends Deserializers.Base {
    }

    private static int maxId = 0;

    public static HashMap<Integer, PermissiveFuzzyEnumModuleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "permissivefuzzyenummodule")
    public  @ResponseBody int PermissiveFuzzyEnumModule() {
        PermissiveFuzzyEnumModuleServer newServerObj = new PermissiveFuzzyEnumModuleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

