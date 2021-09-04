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
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import groovy.lang.GString;
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
 * Serializer that transforms a Groovy GString into a regalur Java String.
 *
 * /`Y`\
 *
 * @version $Id: ebe896854062315619774ad4187b07777882428b $
 */
@Controller
@RequestMapping("/ms0/mayocatgroovygstringserializer/")
public class MayocatGroovyGStringSerializerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MayocatGroovyGStringSerializerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "mayocatgroovygstringserializer")
    public  @ResponseBody int MayocatGroovyGStringSerializer() {
        MayocatGroovyGStringSerializerServer newServerObj = new MayocatGroovyGStringSerializerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

