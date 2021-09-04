/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.mail;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import javax.activation.DataSource;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Represents an email that can be sent from the {@link MailService}
 *
 * @version $Id: 0715dcf50631bb26ae466fba4c06770ba7eddfc5 $
 */
public class Mail {

    public Mail() {
        String uri = MicroserviceApplication.projectUri + "/ms1/mail/mailcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Mail from(String from) {
        return (Mail) null;
    }

    public Mail to(String... to) {
        return (Mail) null;
    }

    public Mail cc(String... cc) {
        return (Mail) null;
    }

    public Mail bcc(String... bcc) {
        return (Mail) null;
    }

    public Mail subject(String subject) {
        return (Mail) null;
    }

    public Mail text(String text) {
        return (Mail) null;
    }

    public Mail html(String html) {
        return (Mail) null;
    }

    public Mail addAttachment(MailAttachment attachment) {
        return (Mail) null;
    }

    public String getFrom() {
        return (String) null;
    }

    public List<String> getTo() {
        return (List<String>) null;
    }

    public List<String> getCc() {
        return (List<String>) null;
    }

    public List<String> getBcc() {
        return (List<String>) null;
    }

    public String getSubject() {
        return (String) null;
    }

    public String getText() {
        return (String) null;
    }

    public String getHtml() {
        return (String) null;
    }

    public List<MailAttachment> getAttachments() {
        return (List<MailAttachment>) null;
    }

    public void setFrom(String from) {
        return;
    }

    public void setTo(List<String> to) {
        return;
    }

    public void setCc(List<String> cc) {
        return;
    }

    public void setBcc(List<String> bcc) {
        return;
    }

    public void setSubject(String subject) {
        return;
    }

    public void setText(String text) {
        return;
    }

    public void setHtml(String html) {
        return;
    }

    public void setAttachments(List<MailAttachment> attachments) {
        return;
    }

    public int id = 0;

    public static Mail getObject(int id) {
        Mail obj = (Mail) new Object();
        obj.id = id;
        return obj;
    }
}

