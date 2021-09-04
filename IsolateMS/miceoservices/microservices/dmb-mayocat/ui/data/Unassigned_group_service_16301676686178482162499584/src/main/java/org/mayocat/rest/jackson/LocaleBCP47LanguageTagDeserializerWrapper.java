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
 * @version $Id: b42683ec2e095885e044e2ef0b4b30169d4dd81a $
 */
@Controller
@RequestMapping("/ms5/localebcp47languagetagdeserializer/")
public class LocaleBCP47LanguageTagDeserializerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, LocaleBCP47LanguageTagDeserializerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "localebcp47languagetagdeserializer")
    public  @ResponseBody int LocaleBCP47LanguageTagDeserializer() {
        LocaleBCP47LanguageTagDeserializerServer newServerObj = new LocaleBCP47LanguageTagDeserializerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

