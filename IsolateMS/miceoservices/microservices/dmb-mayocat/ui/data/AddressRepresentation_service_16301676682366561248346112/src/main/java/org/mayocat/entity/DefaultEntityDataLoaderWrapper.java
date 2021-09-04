/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.entity;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import org.mayocat.localization.EntityLocalizationService;
import org.mayocat.model.Entity;
import org.mayocat.model.Localized;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;
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
 * @version $Id: 72b43e1cf80333325085b6842f74e830408309db $
 */
@Component
public class DefaultEntityDataLoaderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultEntityDataLoaderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultentitydataloader")
    public  @ResponseBody int DefaultEntityDataLoader() {
        DefaultEntityDataLoaderServer newServerObj = new DefaultEntityDataLoaderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

