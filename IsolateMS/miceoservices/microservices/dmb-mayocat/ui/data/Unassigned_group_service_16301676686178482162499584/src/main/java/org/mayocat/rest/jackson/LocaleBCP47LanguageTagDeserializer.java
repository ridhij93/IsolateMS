/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.jackson;

import java.io.IOException;
import java.util.Locale;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.base.Strings;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: b42683ec2e095885e044e2ef0b4b30169d4dd81a $
 */
public class LocaleBCP47LanguageTagDeserializer extends JsonDeserializer<Locale> {

    @Override
    public Locale deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return (Locale) null;
    }

    public int id = 0;

    public static LocaleBCP47LanguageTagDeserializer getObject(int id) {
        LocaleBCP47LanguageTagDeserializer obj = (LocaleBCP47LanguageTagDeserializer) new Object();
        obj.id = id;
        return obj;
    }
}

