/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.mail.internal;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.FluentIterable;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.inject.Inject;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.mayocat.configuration.general.GeneralSettings;
import org.mayocat.context.WebContext;
import org.mayocat.mail.Mail;
import org.mayocat.mail.MailAttachment;
import org.mayocat.mail.MailException;
import org.mayocat.mail.MailService;
import org.mayocat.mail.SmtpSettings;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Implementation of {@link org.mayocat.mail.MailService} based on JavaMail/SMTP
 *
 * @version $Id: 3cbee746488972e86a66f0a0d4c54d0fc0985c17 $
 */
@Component
public class JavaMailMailService implements MailService {

    @Override
    public Mail emailToTenant() {
        return (Mail) null;
    }

    @Override
    public void sendEmail(Mail mail) throws MailException {
        return;
    }

    public void setSmtpSettings(SmtpSettings smtpSettings) {
        return;
    }

    public SmtpSettings getSmtpSettings() {
        return (SmtpSettings) null;
    }

    public void setGeneralSettings(GeneralSettings generalSettings) {
        return;
    }

    public GeneralSettings getGeneralSettings() {
        return (GeneralSettings) null;
    }

    public void setContext(WebContext context) {
        return;
    }

    public WebContext getContext() {
        return (WebContext) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static JavaMailMailService getObject(int id) {
        JavaMailMailService obj = (JavaMailMailService) new Object();
        obj.id = id;
        return obj;
    }
}

