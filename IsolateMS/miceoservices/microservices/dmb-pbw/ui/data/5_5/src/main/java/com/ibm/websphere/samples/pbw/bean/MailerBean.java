// 
// COPYRIGHT LICENSE: This information contains sample code provided in source code form. You may copy,
// modify, and distribute these sample programs in any form without payment to IBM for the purposes of
// developing, using, marketing or distributing application programs conforming to the application
// programming interface for the operating platform for which the sample code is written.
// Notwithstanding anything to the contrary, IBM PROVIDES THE SAMPLE SOURCE CODE ON AN "AS IS" BASIS
// AND IBM DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, ANY IMPLIED
// WARRANTIES OR CONDITIONS OF MERCHANTABILITY, SATISFACTORY QUALITY, FITNESS FOR A PARTICULAR PURPOSE,
// TITLE, AND ANY WARRANTY OR CONDITION OF NON-INFRINGEMENT. IBM SHALL NOT BE LIABLE FOR ANY DIRECT,
// INDIRECT, INCIDENTAL, SPECIAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR OPERATION OF THE
// SAMPLE SOURCE CODE. IBM HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS
// OR MODIFICATIONS TO THE SAMPLE SOURCE CODE.
// 
// (C) COPYRIGHT International Business Machines Corp., 2001,2011
// All Rights Reserved * Licensed Materials - Property of IBM
// 
package com.ibm.websphere.samples.pbw.bean;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Resource;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.ibm.websphere.samples.pbw.jpa.Customer;
import com.ibm.websphere.samples.pbw.jpa.Order;
import com.ibm.websphere.samples.pbw.utils.Util;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * MailerBean provides a transactional facade for access to Order information and notification of
 * the buyer of order state.
 */
@Named(value = "mailerbean")
@Dependent
public class MailerBean implements Serializable {

    /**
     * Create the email message.
     *
     * @param orderKey
     *            The order number.
     * @return The email message.
     */
    private String createMessage(String orderKey) {
        return (String) null;
    }

    /**
     * Create the Subject line.
     *
     * @param orderKey
     *            The order number.
     * @return The Order number string.
     */
    private String createSubjectLine(String orderKey) {
        return (String) null;
    }

    /**
     * Create a mail message and send it.
     *
     * @param customerInfo
     *            Customer information.
     * @param orderKey
     * @throws MailerAppException
     */
    public void createAndSendMail(Customer customerInfo, String orderKey) throws MailerAppException {
        return;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public void setMailSession(Session mailSession) {
        return;
    }

    public Session getMailSession() {
        return (Session) null;
    }

    public void setEm(EntityManager em) {
        return;
    }

    public EntityManager getEm() {
        return (EntityManager) null;
    }

    public int id = 0;

    public static MailerBean getObject(int id) {
        MailerBean obj = (MailerBean) new Object();
        obj.id = id;
        return obj;
    }
}

