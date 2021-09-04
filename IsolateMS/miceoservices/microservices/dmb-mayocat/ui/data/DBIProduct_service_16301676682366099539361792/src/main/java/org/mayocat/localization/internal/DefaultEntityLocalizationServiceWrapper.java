/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.localization.internal;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import org.apache.commons.lang3.SerializationUtils;
import org.mayocat.attachment.model.LoadedAttachment;
import org.mayocat.context.WebContext;
import org.mayocat.localization.EntityLocalizationService;
import org.mayocat.model.AddonGroup;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.attachment.model.AttachmentData;
import org.mayocat.model.Entity;
import org.mayocat.model.HasAddons;
import org.mayocat.model.Localized;
import org.mayocat.model.annotation.LocalizedField;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Strings;
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
 * @version $Id: 5c0656391234ebf2ac507e8f75583e69eb305553 $
 */
@Component
public class DefaultEntityLocalizationServiceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultEntityLocalizationServiceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultentitylocalizationservice")
    public  @ResponseBody int DefaultEntityLocalizationService() {
        DefaultEntityLocalizationServiceServer newServerObj = new DefaultEntityLocalizationServiceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

