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
import org.apache.commons.lang3.StringUtils;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.model.Entity;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
import com.google.common.base.Preconditions;
import com.google.common.reflect.TypeParameter;
import com.google.common.reflect.TypeToken;
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
 * @version $Id: 9405aadc5a34312d76e7f4df5a241bae914fa229 $
 */
@Component
public class DefaultEntityURLFactoryWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultEntityURLFactoryServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultentityurlfactory")
    public  @ResponseBody int DefaultEntityURLFactory() {
        DefaultEntityURLFactoryServer newServerObj = new DefaultEntityURLFactoryServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

