/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.jackson;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.deser.Deserializers;
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
 * Serializer and deserializer related to NIO.
 */
@Controller
@RequestMapping("/ms2/niomodule/")
public class NIOModuleWrapper {

    private static class PathDeserializer extends JsonDeserializer<Path> {
    }

    private static class NIODeserializers extends Deserializers.Base {
    }

    private static int maxId = 0;

    public static HashMap<Integer, NIOModuleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "niomodule")
    public  @ResponseBody int NIOModule() {
        NIOModuleServer newServerObj = new NIOModuleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

