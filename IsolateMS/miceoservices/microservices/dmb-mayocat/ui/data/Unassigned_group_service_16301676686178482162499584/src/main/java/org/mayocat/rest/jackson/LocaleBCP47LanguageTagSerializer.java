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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: c82f633d246521ef4acf9365abeb7d16b46aa6e3 $
 */
public class LocaleBCP47LanguageTagSerializer extends StdSerializer<Locale> {

    protected LocaleBCP47LanguageTagSerializer() {
        String uri = MicroserviceApplication.projectUri + "/ms5/localebcp47languagetagserializer/localebcp47languagetagserializercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public void serialize(Locale locale, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonGenerationException {
        return;
    }

    public int id = 0;

    public static LocaleBCP47LanguageTagSerializer getObject(int id) {
        LocaleBCP47LanguageTagSerializer obj = (LocaleBCP47LanguageTagSerializer) new Object();
        obj.id = id;
        return obj;
    }
}

