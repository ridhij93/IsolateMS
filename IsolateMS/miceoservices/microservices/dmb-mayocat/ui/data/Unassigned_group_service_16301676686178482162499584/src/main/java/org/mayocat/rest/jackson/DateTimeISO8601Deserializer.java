/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.jackson;

import java.io.IOException;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.mayocat.util.Utils;
import org.mayocat.configuration.ConfigurationService;
import org.mayocat.configuration.general.GeneralSettings;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.base.Strings;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class DateTimeISO8601Deserializer extends JsonDeserializer<DateTime> {

    @Override
    public DateTime deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return (DateTime) null;
    }

    public int id = 0;

    public static DateTimeISO8601Deserializer getObject(int id) {
        DateTimeISO8601Deserializer obj = (DateTimeISO8601Deserializer) new Object();
        obj.id = id;
        return obj;
    }
}

