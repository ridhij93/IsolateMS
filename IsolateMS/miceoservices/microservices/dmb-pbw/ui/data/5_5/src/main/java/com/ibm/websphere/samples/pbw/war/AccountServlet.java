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
package com.ibm.websphere.samples.pbw.war;

import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.ibm.websphere.samples.pbw.bean.CatalogMgr;
import com.ibm.websphere.samples.pbw.bean.CustomerMgr;
import com.ibm.websphere.samples.pbw.jpa.Customer;
import com.ibm.websphere.samples.pbw.utils.Util;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Servlet to handle customer account actions, such as login and register.
 */
@Named(value = "accountservlet")
@WebServlet("/servlet/AccountServlet")
public class AccountServlet extends HttpServlet {

    /**
     * Servlet initialization.
     */
    public void init(ServletConfig config) throws ServletException {
        return;
    }

    /**
     * Process incoming HTTP GET requests
     *
     * @param request
     *            Object that encapsulates the request to the servlet
     * @param response
     *            Object that encapsulates the response from the servlet
     */
    public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        return;
    }

    /**
     * Process incoming HTTP POST requests
     *
     * @param request
     *            Object that encapsulates the request to the servlet
     * @param response
     *            Object that encapsulates the response from the servlet
     */
    public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        return;
    }

    /**
     * Main service method for AccountServlet
     *
     * @param request
     *            Object that encapsulates the request to the servlet
     * @param response
     *            Object that encapsulates the response from the servlet
     */
    private void performTask(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        return;
    }

    /**
     * Request dispatch.
     */
    private void requestDispatch(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String page) throws ServletException, IOException {
        return;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public static String getACTION_ACCOUNT() {
        return (String) null;
    }

    public static String getACTION_ACCOUNTUPDATE() {
        return (String) null;
    }

    public static String getACTION_LOGIN() {
        return (String) null;
    }

    public static String getACTION_REGISTER() {
        return (String) null;
    }

    public static String getACTION_SETLOGGING() {
        return (String) null;
    }

    public void setLogin(CustomerMgr login) {
        return;
    }

    public CustomerMgr getLogin() {
        return (CustomerMgr) null;
    }

    public void setCatalog(CatalogMgr catalog) {
        return;
    }

    public CatalogMgr getCatalog() {
        return (CatalogMgr) null;
    }

    public int id = 0;

    public static AccountServlet getObject(int id) {
        AccountServlet obj = (AccountServlet) new Object();
        obj.id = id;
        return obj;
    }
}

