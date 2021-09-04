/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.url;

import java.net.URL;
import javax.inject.Inject;
import org.jvnet.inflector.Noun;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.context.WebContext;
import org.mayocat.model.Entity;
import org.mayocat.model.annotation.PluralForm;
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
 * @version $Id: 4ebde75bb06f608d70b85a6146aa1cf77d0df928 $
 */
@Controller
@RequestMapping("/ms0/abstractgenericentityurlfactory/")
public abstract class AbstractGenericEntityURLFactoryWrapper<E extends Entity> {

    private static int maxId = 0;

    public static HashMap<Integer, AbstractGenericEntityURLFactoryServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "abstractgenericentityurlfactory")
    public  @ResponseBody int AbstractGenericEntityURLFactory() {
        AbstractGenericEntityURLFactoryServer newServerObj = new AbstractGenericEntityURLFactoryServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

