/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.mail;

import java.util.Locale;
import com.google.common.base.Optional;
import javax.activation.DataSource;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 3a17a8abbaee2776ff1d44876f8d66025043e9e4 $
 */
public class MailTemplate extends Mail {

    @Override
    public MailTemplate from(String from) {
        return (MailTemplate) null;
    }

    @Override
    public MailTemplate to(String... to) {
        return (MailTemplate) null;
    }

    @Override
    public MailTemplate cc(String... cc) {
        return (MailTemplate) null;
    }

    @Override
    public MailTemplate bcc(String... bcc) {
        return (MailTemplate) null;
    }

    @Override
    public MailTemplate subject(String subject) {
        return (MailTemplate) null;
    }

    @Override
    public MailTemplate text(String subject) {
        return (MailTemplate) null;
    }

    @Override
    public MailTemplate html(String subject) {
        return (MailTemplate) null;
    }

    @Override
    public MailTemplate addAttachment(MailAttachment attachment) {
        return (MailTemplate) null;
    }

    public MailTemplate template(String template) {
        return (MailTemplate) null;
    }

    public MailTemplate locale(Locale locale) {
        return (MailTemplate) null;
    }

    public String template() {
        return (String) null;
    }

    public Optional<Locale> locale() {
        return (Optional<Locale>) null;
    }

    public void setTemplate(String template) {
        return;
    }

    public String getTemplate() {
        return (String) null;
    }

    public void setLocale(Optional<Locale> locale) {
        return;
    }

    public Optional<Locale> getLocale() {
        return (Optional<Locale>) null;
    }

    public int id = 0;

    public static MailTemplate getObject(int id) {
        MailTemplate obj = (MailTemplate) new Object();
        obj.id = id;
        return obj;
    }
}

