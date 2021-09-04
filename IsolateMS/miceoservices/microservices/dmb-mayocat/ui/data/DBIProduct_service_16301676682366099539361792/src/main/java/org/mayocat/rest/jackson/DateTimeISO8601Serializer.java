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
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class DateTimeISO8601Serializer extends StdSerializer<DateTime> {

    public DateTimeISO8601Serializer() {
        String uri = MicroserviceApplication.projectUri + "/ms1/datetimeiso8601serializer/datetimeiso8601serializercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public void serialize(DateTime value, JsonGenerator jsonGenerator, SerializerProvider provider) throws IOException {
        return;
    }

    public int id = 0;

    public static DateTimeISO8601Serializer getObject(int id) {
        DateTimeISO8601Serializer obj = (DateTimeISO8601Serializer) new Object();
        obj.id = id;
        return obj;
    }
}

