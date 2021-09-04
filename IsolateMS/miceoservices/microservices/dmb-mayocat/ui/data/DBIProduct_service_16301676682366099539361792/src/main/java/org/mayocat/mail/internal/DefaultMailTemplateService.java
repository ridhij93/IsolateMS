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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 3908ae80ab44e43d18f98fd4c015a14dec3fd0b1 $
 */
@Component
public class DefaultMailTemplateService implements MailTemplateService {

    @Override
    public void sendTemplateMail(MailTemplate mail, Map<String, Object> context) throws MailException {
        return;
    }

    @Override
    public void sendTemplateMail(MailTemplate mail, Map<String, Object> context, Tenant tenant) throws MailException {
        return;
    }

    private Optional<Path> resolveDefaultTemplate(MailTemplate mail) {
        return (Optional<Path>) null;
    }

    private Optional<Path> resolveTenantTemplate(MailTemplate mail, Tenant tenant) {
        return (Optional<Path>) null;
    }

    private Optional<Path> resolveTemplate(Path base, MailTemplate mail) {
        return (Optional<Path>) null;
    }

    public void setFileManager(FileManager fileManager) {
        return;
    }

    public FileManager getFileManager() {
        return (FileManager) null;
    }

    public void setMailService(MailService mailService) {
        return;
    }

    public MailService getMailService() {
        return (MailService) null;
    }

    public void setTemplateRenderer(TemplateRenderer templateRenderer) {
        return;
    }

    public TemplateRenderer getTemplateRenderer() {
        return (TemplateRenderer) null;
    }

    public void setContext(WebContext context) {
        return;
    }

    public WebContext getContext() {
        return (WebContext) null;
    }

    public static String getDELIMITER() {
        return (String) null;
    }

    public int id = 0;

    public static DefaultMailTemplateService getObject(int id) {
        DefaultMailTemplateService obj = (DefaultMailTemplateService) new Object();
        obj.id = id;
        return obj;
    }
}

