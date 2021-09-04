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
 * TradeServletAction provides servlet specific client side access to each of
 * the Trade brokerage user operations. These include login, logout, buy, sell,
 * getQuote, etc. TradeServletAction manages a web interface to Trade handling
 * HttpRequests/HttpResponse objects and forwarding results to the appropriate
 * JSP page for the web interface. TradeServletAction invokes
 * {@link TradeAction} methods to actually perform each trading operation.
 */
@Controller
@RequestMapping("/ms5/tradeservletaction/")
public class TradeServletActionWrapper {

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
    @RequestMapping(method = RequestMethod.GET, value = "doaccount")
    @ResponseBody ResponseEntity<Void> doAccount(@RequestParam int callerId, @RequestParam int ctxId, @RequestParam int reqId, @RequestParam int respId, @RequestParam String userID, @RequestParam String results) {
        try {
            TradeServletActionServer callerObj = idObjMap.get(callerId);
            callerObj.doAccount(ServletContext.getObject(ctxId), HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(respId), userID, results);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
    @RequestMapping(method = RequestMethod.GET, value = "doaccountupdate")
    @ResponseBody ResponseEntity<Void> doAccountUpdate(@RequestParam int callerId, @RequestParam int ctxId, @RequestParam int reqId, @RequestParam int respId, @RequestParam String userID, @RequestParam String password, @RequestParam String cpassword, @RequestParam String fullName, @RequestParam String address, @RequestParam String creditcard, @RequestParam String email) {
        try {
            TradeServletActionServer callerObj = idObjMap.get(callerId);
            callerObj.doAccountUpdate(ServletContext.getObject(ctxId), HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(respId), userID, password, cpassword, fullName, address, creditcard, email);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
    @RequestMapping(method = RequestMethod.GET, value = "dobuy")
    @ResponseBody ResponseEntity<Void> doBuy(@RequestParam int callerId, @RequestParam int ctxId, @RequestParam int reqId, @RequestParam int respId, @RequestParam String userID, @RequestParam String symbol, @RequestParam String quantity) {
        try {
            TradeServletActionServer callerObj = idObjMap.get(callerId);
            callerObj.doBuy(ServletContext.getObject(ctxId), HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(respId), userID, symbol, quantity);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
    @RequestMapping(method = RequestMethod.GET, value = "dohome")
    @ResponseBody ResponseEntity<Void> doHome(@RequestParam int callerId, @RequestParam int ctxId, @RequestParam int reqId, @RequestParam int respId, @RequestParam String userID, @RequestParam String results) {
        try {
            TradeServletActionServer callerObj = idObjMap.get(callerId);
            callerObj.doHome(ServletContext.getObject(ctxId), HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(respId), userID, results);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
    @RequestMapping(method = RequestMethod.GET, value = "dologin")
    @ResponseBody ResponseEntity<Void> doLogin(@RequestParam int callerId, @RequestParam int ctxId, @RequestParam int reqId, @RequestParam int respId, @RequestParam String userID, @RequestParam String passwd) {
        try {
            TradeServletActionServer callerObj = idObjMap.get(callerId);
            callerObj.doLogin(ServletContext.getObject(ctxId), HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(respId), userID, passwd);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
    @RequestMapping(method = RequestMethod.GET, value = "dologout")
    @ResponseBody ResponseEntity<Void> doLogout(@RequestParam int callerId, @RequestParam int ctxId, @RequestParam int reqId, @RequestParam int respId, @RequestParam String userID) {
        try {
            TradeServletActionServer callerObj = idObjMap.get(callerId);
            callerObj.doLogout(ServletContext.getObject(ctxId), HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(respId), userID);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
    @RequestMapping(method = RequestMethod.GET, value = "doportfolio")
    @ResponseBody ResponseEntity<Void> doPortfolio(@RequestParam int callerId, @RequestParam int ctxId, @RequestParam int reqId, @RequestParam int respId, @RequestParam String userID, @RequestParam String results) {
        try {
            TradeServletActionServer callerObj = idObjMap.get(callerId);
            callerObj.doPortfolio(ServletContext.getObject(ctxId), HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(respId), userID, results);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
    @RequestMapping(method = RequestMethod.GET, value = "doquotes")
    @ResponseBody ResponseEntity<Void> doQuotes(@RequestParam int callerId, @RequestParam int ctxId, @RequestParam int reqId, @RequestParam int respId, @RequestParam String userID, @RequestParam String symbols) {
        try {
            TradeServletActionServer callerObj = idObjMap.get(callerId);
            callerObj.doQuotes(ServletContext.getObject(ctxId), HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(respId), userID, symbols);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
    @RequestMapping(method = RequestMethod.GET, value = "doregister")
    @ResponseBody ResponseEntity<Void> doRegister(@RequestParam int callerId, @RequestParam int ctxId, @RequestParam int reqId, @RequestParam int respId, @RequestParam String userID, @RequestParam String passwd, @RequestParam String cpasswd, @RequestParam String fullname, @RequestParam String ccn, @RequestParam String openBalanceString, @RequestParam String email, @RequestParam String address) {
        try {
            TradeServletActionServer callerObj = idObjMap.get(callerId);
            callerObj.doRegister(ServletContext.getObject(ctxId), HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(respId), userID, passwd, cpasswd, fullname, ccn, openBalanceString, email, address);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
    @RequestMapping(method = RequestMethod.GET, value = "dosell")
    @ResponseBody ResponseEntity<Void> doSell(@RequestParam int callerId, @RequestParam int ctxId, @RequestParam int reqId, @RequestParam int respId, @RequestParam String userID, @RequestParam Integer holdingID) {
        try {
            TradeServletActionServer callerObj = idObjMap.get(callerId);
            callerObj.doSell(ServletContext.getObject(ctxId), HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(respId), userID, holdingID);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "dowelcome")
    @ResponseBody ResponseEntity<Void> doWelcome(@RequestParam int callerId, @RequestParam int ctxId, @RequestParam int reqId, @RequestParam int respId, @RequestParam String status) {
        try {
            TradeServletActionServer callerObj = idObjMap.get(callerId);
            callerObj.doWelcome(ServletContext.getObject(ctxId), HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(respId), status);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "domarketsummary")
    @ResponseBody ResponseEntity<Void> doMarketSummary(@RequestParam int callerId, @RequestParam int ctxId, @RequestParam int reqId, @RequestParam int respId, @RequestParam String userID) {
        try {
            TradeServletActionServer callerObj = idObjMap.get(callerId);
            callerObj.doMarketSummary(ServletContext.getObject(ctxId), HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(respId), userID);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, TradeServletActionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tradeservletaction")
    public  @ResponseBody int TradeServletAction() {
        TradeServletActionServer newServerObj = new TradeServletActionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

