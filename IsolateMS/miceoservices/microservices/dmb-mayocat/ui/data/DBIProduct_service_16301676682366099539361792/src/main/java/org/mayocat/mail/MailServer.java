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

/**
 * Represents an email that can be sent from the {@link MailService}
 *
 * @version $Id: 0715dcf50631bb26ae466fba4c06770ba7eddfc5 $
 */
public class MailServer {

    private String from;

    private List<String> to;

    private List<String> cc;

    private List<String> bcc;

    private String subject;

    private String text;

    private String html;

    private List<MailAttachment> attachments;

    public MailServer() {
        to = Lists.newArrayList();
        cc = Lists.newArrayList();
        bcc = Lists.newArrayList();
        attachments = Lists.newArrayList();
    }

    public Mail from(String from) {
        this.from = from;
        return this;
    }

    public Mail to(String... to) {
        this.to = Arrays.asList(to);
        return this;
    }

    public Mail cc(String... cc) {
        this.cc = Arrays.asList(cc);
        return this;
    }

    public Mail bcc(String... bcc) {
        this.bcc = Arrays.asList(bcc);
        return this;
    }

    public Mail subject(String subject) {
        this.subject = subject;
        return this;
    }

    public Mail text(String text) {
        this.text = text;
        return this;
    }

    public Mail html(String html) {
        this.html = html;
        return this;
    }

    public Mail addAttachment(MailAttachment attachment) {
        this.attachments.add(attachment);
        return this;
    }

    public String getFrom() {
        return from;
    }

    public List<String> getTo() {
        return to;
    }

    public List<String> getCc() {
        return cc;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public String getHtml() {
        return html;
    }

    public List<MailAttachment> getAttachments() {
        return attachments;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public void setCc(List<String> cc) {
        this.cc = cc;
    }

    public void setBcc(List<String> bcc) {
        this.bcc = bcc;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public void setAttachments(List<MailAttachment> attachments) {
        this.attachments = attachments;
    }
}

