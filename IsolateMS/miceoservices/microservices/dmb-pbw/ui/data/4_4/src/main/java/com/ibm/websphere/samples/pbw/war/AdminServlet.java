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
// (C) COPYRIGHT International Business Machines Corp., 2003,2011
// All Rights Reserved * Licensed Materials - Property of IBM
// 
package com.ibm.websphere.samples.pbw.war;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import com.ibm.websphere.samples.pbw.bean.BackOrderMgr;
import com.ibm.websphere.samples.pbw.bean.CatalogMgr;
import com.ibm.websphere.samples.pbw.bean.CustomerMgr;
import com.ibm.websphere.samples.pbw.bean.ResetDBBean;
import com.ibm.websphere.samples.pbw.bean.SuppliersBean;
import com.ibm.websphere.samples.pbw.jpa.BackOrder;
import com.ibm.websphere.samples.pbw.jpa.Inventory;
import com.ibm.websphere.samples.pbw.jpa.Supplier;
import com.ibm.websphere.samples.pbw.utils.Util;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Servlet to handle Administration actions
 */
@Named(value = "admin")
@WebServlet("/servlet/AdminServlet")
public class AdminServlet extends HttpServlet {

    /**
     * @see javax.servlet.Servlet#init(ServletConfig)
     */
    /**
     * Servlet initialization.
     */
    public void init(ServletConfig config) throws ServletException {
        return;
    }

    /**
     * Process incoming HTTP GET requests
     *
     * @param req
     *            Object that encapsulates the request to the servlet
     * @param resp
     *            Object that encapsulates the response from the servlet
     */
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        return;
    }

    /**
     * Process incoming HTTP POST requests
     *
     * @param req
     *            Object that encapsulates the request to the servlet
     * @param resp
     *            Object that encapsulates the response from the servlet
     */
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        return;
    }

    /**
     * Method performTask.
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void performTask(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        return;
    }

    /**
     * @param supplierID
     * @param name
     * @param street
     * @param city
     * @param state
     * @param zip
     * @param phone
     * @param location_url
     * @return supplierInfo
     */
    public Supplier updateSupplierInfo(String supplierID, String name, String street, String city, String state, String zip, String phone, String location_url) {
        return (Supplier) null;
    }

    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void performSupplierConfig(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        return;
    }

    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void performPopulate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        return;
    }

    /**
     * Method performBackOrder.
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void performBackOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        return;
    }

    /**
     * Method getBackOrders.
     *
     * @param session
     */
    public void getBackOrders(HttpSession session) {
        return;
    }

    /**
     * Method sendRedirect.
     *
     * @param resp
     * @param page
     * @throws ServletException
     * @throws IOException
     */
    private void sendRedirect(HttpServletResponse resp, String page) throws ServletException, IOException {
        return;
    }

    /**
     * Method requestDispatch.
     *
     * @param ctx
     * @param req
     * @param resp
     * @param page
     * @throws ServletException
     * @throws IOException
     */
    /**
     * Request dispatch
     */
    private void requestDispatch(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String page) throws ServletException, IOException {
        return;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public void setSuppliers(SuppliersBean suppliers) {
        return;
    }

    public SuppliersBean getSuppliers() {
        return (SuppliersBean) null;
    }

    public void setLogin(CustomerMgr login) {
        return;
    }

    public CustomerMgr getLogin() {
        return (CustomerMgr) null;
    }

    public void setBackOrderStock(BackOrderMgr backOrderStock) {
        return;
    }

    public BackOrderMgr getBackOrderStock() {
        return (BackOrderMgr) null;
    }

    public void setCatalog(CatalogMgr catalog) {
        return;
    }

    public CatalogMgr getCatalog() {
        return (CatalogMgr) null;
    }

    public void setResetDB(ResetDBBean resetDB) {
        return;
    }

    public ResetDBBean getResetDB() {
        return (ResetDBBean) null;
    }

    public int id = 0;

    public static AdminServlet getObject(int id) {
        AdminServlet obj = (AdminServlet) new Object();
        obj.id = id;
        return obj;
    }
}

