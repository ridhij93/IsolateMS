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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ms1/datetimeiso8601serializer/")
public class DateTimeISO8601SerializerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DateTimeISO8601SerializerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "datetimeiso8601serializer")
    public  @ResponseBody int DateTimeISO8601Serializer() {
        DateTimeISO8601SerializerServer newServerObj = new DateTimeISO8601SerializerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

