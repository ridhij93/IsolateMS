/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.theme;

import java.util.List;
import org.mayocat.jackson.OptionalStringListDeserializer;
import org.mayocat.jackson.PasswordSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
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
 * A theme model is a configurable layout template that can be applied to entities. For example, a theme can declare
 * several different models for different kinds of products.
 *
 * @version $Id: 1bd3349e61f3e4572bd85f30b39fc701cb19d799 $
 */
@Controller
@RequestMapping("/ms2/model/")
public class ModelWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ModelServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "model")
    public  @ResponseBody int Model() {
        ModelServer newServerObj = new ModelServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

