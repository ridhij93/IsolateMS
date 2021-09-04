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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * A theme model is a configurable layout template that can be applied to entities. For example, a theme can declare
 * several different models for different kinds of products.
 *
 * @version $Id: 1bd3349e61f3e4572bd85f30b39fc701cb19d799 $
 */
public class Model {

    public String getFile() {
        return (String) null;
    }

    public String getName() {
        return (String) null;
    }

    public Optional<List<String>> getEntities() {
        return (Optional<List<String>>) null;
    }

    public void setFile(String file) {
        return;
    }

    public void setName(String name) {
        return;
    }

    public void setEntities(Optional<List<String>> entities) {
        return;
    }

    public int id = 0;

    public static Model getObject(int id) {
        Model obj = (Model) new Object();
        obj.id = id;
        return obj;
    }
}

