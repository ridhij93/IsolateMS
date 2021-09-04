/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.mail.internal;

import com.google.common.base.Optional;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.context.WebContext;
import org.mayocat.files.FileManager;
import org.mayocat.mail.MailException;
import org.mayocat.mail.MailService;
import org.mayocat.mail.MailTemplate;
import org.mayocat.mail.MailTemplateService;
import org.mayocat.templating.TemplateRenderer;
import org.mayocat.templating.TemplateRenderingException;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
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
 * @version $Id: 3908ae80ab44e43d18f98fd4c015a14dec3fd0b1 $
 */
@Component
public class DefaultMailTemplateServiceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultMailTemplateServiceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultmailtemplateservice")
    public  @ResponseBody int DefaultMailTemplateService() {
        DefaultMailTemplateServiceServer newServerObj = new DefaultMailTemplateServiceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

