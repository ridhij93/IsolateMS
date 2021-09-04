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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Serializer that transforms a Groovy GString into a regalur Java String.
 *
 * /`Y`\
 *
 * @version $Id: ebe896854062315619774ad4187b07777882428b $
 */
public class MayocatGroovyGStringSerializer extends StdSerializer<GString> {

    protected MayocatGroovyGStringSerializer() {
        String uri = MicroserviceApplication.projectUri + "/ms0/mayocatgroovygstringserializer/mayocatgroovygstringserializercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public void serialize(GString gString, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonGenerationException {
        return;
    }

    public int id = 0;

    public static MayocatGroovyGStringSerializer getObject(int id) {
        MayocatGroovyGStringSerializer obj = (MayocatGroovyGStringSerializer) new Object();
        obj.id = id;
        return obj;
    }
}

