/**
 * (C) Copyright IBM Corporation 2015.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.websphere.samples.daytrader.web;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.TradeServices;
import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountProfileDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * TradeServletAction provides servlet specific client side access to each of
 * the Trade brokerage user operations. These include login, logout, buy, sell,
 * getQuote, etc. TradeServletAction manages a web interface to Trade handling
 * HttpRequests/HttpResponse objects and forwarding results to the appropriate
 * JSP page for the web interface. TradeServletAction invokes
 * {@link TradeAction} methods to actually perform each trading operation.
 */
public class TradeServletAction {

    TradeServletAction() {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeservletaction/tradeservletactioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * Display User Profile information such as address, email, etc. for the
     * given Trader Dispatch to the Trade Account JSP for display
     *
     * @param userID
     *            The User to display profile info
     * @param ctx
     *            the servlet context
     * @param req
     *            the HttpRequest object
     * @param resp
     *            the HttpResponse object
     * @param results
     *            A short description of the results/success of this web request
     *            provided on the web page
     * @exception javax.servlet.ServletException
     *                If a servlet specific exception is encountered
     * @exception javax.io.IOException
     *                If an exception occurs while writing results back to the
     *                user
     */
    void doAccount(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String userID, String results) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeservletaction/doaccount?callerId=" + this.id + "&ctxId=ctx.id&reqId=req.id&respId=resp.id&userID=userID&results=results";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * Update User Profile information such as address, email, etc. for the
     * given Trader Dispatch to the Trade Account JSP for display If any in put
     * is incorrect revert back to the account page w/ an appropriate message
     *
     * @param userID
     *            The User to upddate profile info
     * @param password
     *            The new User password
     * @param cpassword
     *            Confirm password
     * @param fullname
     *            The new User fullname info
     * @param address
     *            The new User address info
     * @param cc
     *            The new User credit card info
     * @param email
     *            The new User email info
     * @param ctx
     *            the servlet context
     * @param req
     *            the HttpRequest object
     * @param resp
     *            the HttpResponse object
     * @exception javax.servlet.ServletException
     *                If a servlet specific exception is encountered
     * @exception javax.io.IOException
     *                If an exception occurs while writing results back to the
     *                user
     */
    void doAccountUpdate(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String userID, String password, String cpassword, String fullName, String address, String creditcard, String email) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeservletaction/doaccountupdate?callerId=" + this.id + "&ctxId=ctx.id&reqId=req.id&respId=resp.id&userID=userID&password=password&cpassword=cpassword&fullName=fullName&address=address&creditcard=creditcard&email=email";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * Buy a new holding of shares for the given trader Dispatch to the Trade
     * Portfolio JSP for display
     *
     * @param userID
     *            The User buying shares
     * @param symbol
     *            The stock to purchase
     * @param amount
     *            The quantity of shares to purchase
     * @param ctx
     *            the servlet context
     * @param req
     *            the HttpRequest object
     * @param resp
     *            the HttpResponse object
     * @exception javax.servlet.ServletException
     *                If a servlet specific exception is encountered
     * @exception javax.io.IOException
     *                If an exception occurs while writing results back to the
     *                user
     */
    void doBuy(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String userID, String symbol, String quantity) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeservletaction/dobuy?callerId=" + this.id + "&ctxId=ctx.id&reqId=req.id&respId=resp.id&userID=userID&symbol=symbol&quantity=quantity";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * Create the Trade Home page with personalized information such as the
     * traders account balance Dispatch to the Trade Home JSP for display
     *
     * @param ctx
     *            the servlet context
     * @param req
     *            the HttpRequest object
     * @param resp
     *            the HttpResponse object
     * @param results
     *            A short description of the results/success of this web request
     *            provided on the web page
     * @exception javax.servlet.ServletException
     *                If a servlet specific exception is encountered
     * @exception javax.io.IOException
     *                If an exception occurs while writing results back to the
     *                user
     */
    void doHome(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String userID, String results) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeservletaction/dohome?callerId=" + this.id + "&ctxId=ctx.id&reqId=req.id&respId=resp.id&userID=userID&results=results";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * Login a Trade User. Dispatch to the Trade Home JSP for display
     *
     * @param userID
     *            The User to login
     * @param passwd
     *            The password supplied by the trader used to authenticate
     * @param ctx
     *            the servlet context
     * @param req
     *            the HttpRequest object
     * @param resp
     *            the HttpResponse object
     * @param results
     *            A short description of the results/success of this web request
     *            provided on the web page
     * @exception javax.servlet.ServletException
     *                If a servlet specific exception is encountered
     * @exception javax.io.IOException
     *                If an exception occurs while writing results back to the
     *                user
     */
    void doLogin(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String userID, String passwd) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeservletaction/dologin?callerId=" + this.id + "&ctxId=ctx.id&reqId=req.id&respId=resp.id&userID=userID&passwd=passwd";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * Logout a Trade User Dispatch to the Trade Welcome JSP for display
     *
     * @param userID
     *            The User to logout
     * @param ctx
     *            the servlet context
     * @param req
     *            the HttpRequest object
     * @param resp
     *            the HttpResponse object
     * @param results
     *            A short description of the results/success of this web request
     *            provided on the web page
     * @exception javax.servlet.ServletException
     *                If a servlet specific exception is encountered
     * @exception javax.io.IOException
     *                If an exception occurs while writing results back to the
     *                user
     */
    void doLogout(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String userID) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeservletaction/dologout?callerId=" + this.id + "&ctxId=ctx.id&reqId=req.id&respId=resp.id&userID=userID";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * Retrieve the current portfolio of stock holdings for the given trader
     * Dispatch to the Trade Portfolio JSP for display
     *
     * @param userID
     *            The User requesting to view their portfolio
     * @param ctx
     *            the servlet context
     * @param req
     *            the HttpRequest object
     * @param resp
     *            the HttpResponse object
     * @param results
     *            A short description of the results/success of this web request
     *            provided on the web page
     * @exception javax.servlet.ServletException
     *                If a servlet specific exception is encountered
     * @exception javax.io.IOException
     *                If an exception occurs while writing results back to the
     *                user
     */
    void doPortfolio(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String userID, String results) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeservletaction/doportfolio?callerId=" + this.id + "&ctxId=ctx.id&reqId=req.id&respId=resp.id&userID=userID&results=results";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * Retrieve the current Quote for the given stock symbol Dispatch to the
     * Trade Quote JSP for display
     *
     * @param userID
     *            The stock symbol used to get the current quote
     * @param ctx
     *            the servlet context
     * @param req
     *            the HttpRequest object
     * @param resp
     *            the HttpResponse object
     * @exception javax.servlet.ServletException
     *                If a servlet specific exception is encountered
     * @exception javax.io.IOException
     *                If an exception occurs while writing results back to the
     *                user
     */
    void doQuotes(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String userID, String symbols) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeservletaction/doquotes?callerId=" + this.id + "&ctxId=ctx.id&reqId=req.id&respId=resp.id&userID=userID&symbols=symbols";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * Register a new trader given the provided user Profile information such as
     * address, email, etc. Dispatch to the Trade Home JSP for display
     *
     * @param userID
     *            The User to create
     * @param passwd
     *            The User password
     * @param fullname
     *            The new User fullname info
     * @param ccn
     *            The new User credit card info
     * @param money
     *            The new User opening account balance
     * @param address
     *            The new User address info
     * @param email
     *            The new User email info
     * @return The userID of the new trader
     * @param ctx
     *            the servlet context
     * @param req
     *            the HttpRequest object
     * @param resp
     *            the HttpResponse object
     * @exception javax.servlet.ServletException
     *                If a servlet specific exception is encountered
     * @exception javax.io.IOException
     *                If an exception occurs while writing results back to the
     *                user
     */
    void doRegister(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String userID, String passwd, String cpasswd, String fullname, String ccn, String openBalanceString, String email, String address) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeservletaction/doregister?callerId=" + this.id + "&ctxId=ctx.id&reqId=req.id&respId=resp.id&userID=userID&passwd=passwd&cpasswd=cpasswd&fullname=fullname&ccn=ccn&openBalanceString=openBalanceString&email=email&address=address";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * Sell a current holding of stock shares for the given trader. Dispatch to
     * the Trade Portfolio JSP for display
     *
     * @param userID
     *            The User buying shares
     * @param symbol
     *            The stock to sell
     * @param indx
     *            The unique index identifying the users holding to sell
     * @param ctx
     *            the servlet context
     * @param req
     *            the HttpRequest object
     * @param resp
     *            the HttpResponse object
     * @exception javax.servlet.ServletException
     *                If a servlet specific exception is encountered
     * @exception javax.io.IOException
     *                If an exception occurs while writing results back to the
     *                user
     */
    void doSell(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String userID, Integer holdingID) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeservletaction/dosell?callerId=" + this.id + "&ctxId=ctx.id&reqId=req.id&respId=resp.id&userID=userID&holdingID=holdingID";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    void doWelcome(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String status) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeservletaction/dowelcome?callerId=" + this.id + "&ctxId=ctx.id&reqId=req.id&respId=resp.id&status=status";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    private void requestDispatch(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String userID, String page) throws ServletException, IOException {
        return;
    }

    void doMarketSummary(ServletContext ctx, HttpServletRequest req, HttpServletResponse resp, String userID) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeservletaction/domarketsummary?callerId=" + this.id + "&ctxId=ctx.id&reqId=req.id&respId=resp.id&userID=userID";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    public void setTAction(TradeServices tAction) {
        return;
    }

    public TradeServices getTAction() {
        return (TradeServices) null;
    }

    public int id = 0;

    public static TradeServletAction getObject(int id) {
        TradeServletAction obj = (TradeServletAction) new Object();
        obj.id = id;
        return obj;
    }
}

