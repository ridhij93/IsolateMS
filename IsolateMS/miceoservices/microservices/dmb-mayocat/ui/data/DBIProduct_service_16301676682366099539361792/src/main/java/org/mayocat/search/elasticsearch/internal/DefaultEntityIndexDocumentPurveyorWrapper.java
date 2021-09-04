/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.search.elasticsearch.internal;

import java.util.Map;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.model.Entity;
import org.mayocat.search.EntityIndexDocumentPurveyor;
import org.mayocat.search.elasticsearch.AbstractGenericEntityIndexDocumentPurveyor;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
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
 * @version $Id: 58900237be0edced16dc9fe5090a5daff8e03d3e $
 */
@Component
public class DefaultEntityIndexDocumentPurveyorWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultEntityIndexDocumentPurveyorServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultentityindexdocumentpurveyor")
    public  @ResponseBody int DefaultEntityIndexDocumentPurveyor() {
        DefaultEntityIndexDocumentPurveyorServer newServerObj = new DefaultEntityIndexDocumentPurveyorServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

