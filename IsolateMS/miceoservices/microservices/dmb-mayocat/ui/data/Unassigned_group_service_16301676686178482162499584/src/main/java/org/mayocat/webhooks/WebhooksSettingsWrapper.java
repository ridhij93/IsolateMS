/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.webhooks;

import java.util.Collections;
import java.util.List;
import org.mayocat.configuration.Configurable;
import org.mayocat.configuration.ExposedSettings;
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
 * @version $Id: 64467b54dc77fd3fb10bfda00202567aa206637b $
 */
@Component("webhooks")
public class WebhooksSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, WebhooksSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "webhookssettings")
    public  @ResponseBody int WebhooksSettings() {
        WebhooksSettingsServer newServerObj = new WebhooksSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

