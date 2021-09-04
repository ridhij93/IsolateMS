/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.url;

import com.google.common.base.Strings;
import java.net.MalformedURLException;
import java.net.URL;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.configuration.MultitenancySettings;
import org.mayocat.configuration.SiteSettings;
import org.mayocat.context.WebContext;
import org.mayocat.context.internal.ThreadLocalWebContext;
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
 * @version $Id: 299ccc9e9285e9f929d9080269fe99aeee83ec59 $
 */
@Component
public class DefaultURLHelperWrapper {

    // Private helpers
    // -----------------------------------------------------------------------------------------------------------------
    private static int maxId = 0;

    public static HashMap<Integer, DefaultURLHelperServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaulturlhelper")
    public  @ResponseBody int DefaultURLHelper() {
        DefaultURLHelperServer newServerObj = new DefaultURLHelperServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // Private helpers
    // -----------------------------------------------------------------------------------------------------------------
}

