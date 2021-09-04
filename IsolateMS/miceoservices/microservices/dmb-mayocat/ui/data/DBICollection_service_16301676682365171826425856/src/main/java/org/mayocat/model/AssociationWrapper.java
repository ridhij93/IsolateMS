/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.model;

import java.io.Serializable;
import com.google.common.base.Objects;
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
 * Intended to wrap an entity field in an option style construct that let consumers test whether the field has been
 * loaded or not. Typically loaded will mean "loaded from database". When backed by a RDBMS, this is useful for fields
 * that require sub-querying, or joins, or any costy operation. Those fields would be typically loaded only when
 * needed.
 *
 * @version $Id: c62bf4e97d8915e3075ca784fa99f839c2f286e4 $
 */
@Controller
@RequestMapping("/ms0/association/")
public class AssociationWrapper<T> {

    private static int maxId = 0;

    public static HashMap<Integer, AssociationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "association")
    public  @ResponseBody int Association(@RequestParam int tId) {
        AssociationServer newServerObj = new AssociationServer(T.getObject(tId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

