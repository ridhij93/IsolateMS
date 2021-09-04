/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.addons;

import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javax.inject.Inject;
import org.apache.commons.lang3.StringUtils;
import org.mayocat.addons.model.AddonFieldDefinition;
import org.mayocat.addons.web.AddonFieldValueWebObject;
import org.mayocat.attachment.AttachmentLoadingOptions;
import org.mayocat.context.WebContext;
import org.mayocat.entity.EntityData;
import org.mayocat.entity.EntityDataLoader;
import org.mayocat.entity.EntityLoader;
import org.mayocat.entity.StandardOptions;
import org.mayocat.model.Entity;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
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
 * @version $Id: 821ee7a364a903e291803d6a251f651e2012d3f3 $
 */
@Component("entityList")
public class EntityListAddonTransformerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, EntityListAddonTransformerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "entitylistaddontransformer")
    public  @ResponseBody int EntityListAddonTransformer() {
        EntityListAddonTransformerServer newServerObj = new EntityListAddonTransformerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

