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
 * Implementation of {@link org.mayocat.mail.MailService} based on JavaMail/SMTP
 *
 * @version $Id: 3cbee746488972e86a66f0a0d4c54d0fc0985c17 $
 */
@Component
public class JavaMailMailServiceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, JavaMailMailServiceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "javamailmailservice")
    public  @ResponseBody int JavaMailMailService() {
        JavaMailMailServiceServer newServerObj = new JavaMailMailServiceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

