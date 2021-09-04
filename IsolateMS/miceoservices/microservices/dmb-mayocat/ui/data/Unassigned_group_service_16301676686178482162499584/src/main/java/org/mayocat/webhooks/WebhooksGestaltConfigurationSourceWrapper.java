/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.webhooks;

import javax.inject.Inject;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.xwiki.component.annotation.Component;
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
 * @version $Id: d9c437db98145cc30ab8027acdd52866f84cd9c3 $
 */
@Component("webhooks")
public class WebhooksGestaltConfigurationSourceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, WebhooksGestaltConfigurationSourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "webhooksgestaltconfigurationsource")
    public  @ResponseBody int WebhooksGestaltConfigurationSource() {
        WebhooksGestaltConfigurationSourceServer newServerObj = new WebhooksGestaltConfigurationSourceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

