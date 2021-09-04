/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.configuration.jackson;

import java.io.IOException;
import java.util.Currency;
import org.xwiki.component.annotation.Component;
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
 * @version $Id: 72da4a8583fde0c57f6f1236aeadee3bbf26a7dd $
 */
@Component("money")
public class MoneyModuleWrapper {

    private static class CurrencyDeserializer extends JsonDeserializer<Currency> {
    }

    private static class MoneyDeserializers extends Deserializers.Base {
    }

    private static int maxId = 0;

    public static HashMap<Integer, MoneyModuleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "moneymodule")
    public  @ResponseBody int MoneyModule() {
        MoneyModuleServer newServerObj = new MoneyModuleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

