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
package com.ibm.websphere.samples.daytrader.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;
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
 * TradeConfig is a JavaBean holding all configuration and runtime parameters
 * for the Trade application TradeConfig sets runtime parameters such as the
 * RunTimeMode (EJB, JDBC, EJB_ALT)
 */
@Controller
@RequestMapping("/ms7/tradeconfig/")
public class TradeConfigWrapper {

    /* Trade Runtime Configuration Parameters */
    /* Trade Caching Type parameters 
    public static String[] cachingTypeNames = { "DistributedMap", "No Caching" };
    public static final int DISTRIBUTEDMAP = 0;
    public static final int NO_CACHING = 1;
    public static int cachingType = NO_CACHING;
    public static int distributedMapCacheSize = 100000;
    */
    /*
     * CJB (DAYTRADER-25) - Also need to impose a ceiling on the quote price to
     * ensure prevent account and holding balances from exceeding the databases
     * decimal precision. At some point, this maximum value can be used to
     * trigger a stock split.
     */
    /*
     * Trade Scenario actions mixes. Each of the array rows represents a
     * specific Trade Scenario Mix. The columns give the percentages for each
     * action in the column header. Note: "login" is always 0. logout represents
     * both login and logout (because each logout operation will cause a new
     * login when the user context attempts the next action.
     */
    // Tracks the number of buys over sell when a users portfolio is empty
    // Used to maintain the correct ratio of buys/sells
    /* JSP pages for all Trade Actions */
    // FUTURE:
    // If a "trade2.properties" property file is supplied, reset the default
    // values
    // to match those specified in the file. This provides a persistent runtime
    // property mechanism during server startup
    /**
     * Return the hostname for this system Creation date: (2/16/2000 9:02:25 PM)
     */
    /**
     * Return a Trade UI Web page based on the current configuration This may
     * return a JSP page or a Servlet page Creation date: (3/14/2000 9:08:34 PM)
     */
    @RequestMapping(method = RequestMethod.GET, value = "getpage")
    public static @ResponseBody String getPage(@RequestParam int pageNumber) {
        String result = TradeConfigServer.getPage(pageNumber);
        return result;
    }

    /**
     * Return a Trade Scenario Operation based on the setting of the current mix
     * (TradeScenarioMix) Creation date: (2/10/2000 9:08:34 PM)
     */
    @RequestMapping(method = RequestMethod.GET, value = "getscenarioaction")
    public static  @ResponseBody char getScenarioAction(@RequestParam boolean newUser) {
        char result = TradeConfigServer.getScenarioAction(newUser);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getuserid")
    public static @ResponseBody String getUserID() {
        String result = TradeConfigServer.getUserID();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getorderfee")
    public static @ResponseBody BigDecimal getOrderFee(@RequestParam String orderType) {
        BigDecimal result = TradeConfigServer.getOrderFee(orderType);
        return result;
    }

    /**
     * Increment the sell deficit counter Creation date: (6/21/2000 11:33:45 AM)
     */
    @RequestMapping(method = RequestMethod.GET, value = "incrementselldeficit")
    public static synchronized @ResponseBody ResponseEntity<Void> incrementSellDeficit() {
        TradeConfigServer.incrementSellDeficit();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "rndaddress")
    public static @ResponseBody String rndAddress() {
        String result = TradeConfigServer.rndAddress();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "rndbalance")
    public static @ResponseBody String rndBalance() {
        String result = TradeConfigServer.rndBalance();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "rndcreditcard")
    public static @ResponseBody String rndCreditCard() {
        String result = TradeConfigServer.rndCreditCard();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "rndemail")
    public static @ResponseBody String rndEmail(@RequestParam String userID) {
        String result = TradeConfigServer.rndEmail(userID);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "rndfullname")
    public static @ResponseBody String rndFullName() {
        String result = TradeConfigServer.rndFullName();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "rndint")
    public static  @ResponseBody int rndInt(@RequestParam int i) {
        int result = TradeConfigServer.rndInt(i);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "rndfloat")
    public static  @ResponseBody float rndFloat(@RequestParam int i) {
        float result = TradeConfigServer.rndFloat(i);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "rndbigdecimal")
    public static @ResponseBody BigDecimal rndBigDecimal(@RequestParam float f) {
        BigDecimal result = TradeConfigServer.rndBigDecimal(f);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "rndboolean")
    public static  @ResponseBody boolean rndBoolean() {
        boolean result = TradeConfigServer.rndBoolean();
        return result;
    }

    /**
     * Returns a new Trade user Creation date: (2/16/2000 8:50:35 PM)
     */
    @RequestMapping(method = RequestMethod.GET, value = "rndnewuserid")
    public static synchronized @ResponseBody String rndNewUserID() {
        String result = TradeConfigServer.rndNewUserID();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getrandompricechangefactor")
    public static @ResponseBody BigDecimal getRandomPriceChangeFactor() {
        BigDecimal result = TradeConfigServer.getRandomPriceChangeFactor();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "rndquantity")
    public static  @ResponseBody float rndQuantity() {
        float result = TradeConfigServer.rndQuantity();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "rndsymbol")
    public static @ResponseBody String rndSymbol() {
        String result = TradeConfigServer.rndSymbol();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "rndsymbols")
    public static @ResponseBody String rndSymbols() {
        String result = TradeConfigServer.rndSymbols();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "rnduserid")
    public static @ResponseBody String rndUserID() {
        String result = TradeConfigServer.rndUserID();
        return result;
    }

    // Trade implements a card deck approach to selecting
    /**
     * This is a convenience method for servlets to set Trade configuration
     * parameters from servlet initialization parameters. The servlet provides
     * the init param and its value as strings. This method then parses the
     * parameter, converts the value to the correct type and sets the
     * corresponding TradeConfig parameter to the converted value
     */
    @RequestMapping(method = RequestMethod.GET, value = "setconfigparam")
    public static @ResponseBody ResponseEntity<Void> setConfigParam(@RequestParam String parm, @RequestParam String value) {
        TradeConfigServer.setConfigParam(parm, value);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Gets the webInterfaceNames
     *
     * @return Returns a String[]
     */
    /*public static String[] getCachingTypeNames() {
        return cachingTypeNames;
    }*/
    /**
     * Gets the trace
     *
     * @return Returns a boolean
     */
    @RequestMapping(method = RequestMethod.GET, value = "gettrace")
    public static  @ResponseBody boolean getTrace() {
        boolean result = TradeConfigServer.getTrace();
        return result;
    }

    /**
     * Sets the trace
     *
     * @param trace
     *            The trace to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "settrace")
    public static @ResponseBody ResponseEntity<Void> setTrace(@RequestParam boolean traceValue) {
        TradeConfigServer.setTrace(traceValue);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Gets the mAX_USERS.
     *
     * @return Returns a int
     */
    @RequestMapping(method = RequestMethod.GET, value = "getmax_users")
    public static  @ResponseBody int getMAX_USERS() {
        int result = TradeConfigServer.getMAX_USERS();
        return result;
    }

    /**
     * Sets the mAX_USERS.
     *
     * @param mAX_USERS
     *            The mAX_USERS to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setmax_users")
    public static @ResponseBody ResponseEntity<Void> setMAX_USERS(@RequestParam int mAX_USERS) {
        TradeConfigServer.setMAX_USERS(mAX_USERS);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Gets the mAX_QUOTES.
     *
     * @return Returns a int
     */
    @RequestMapping(method = RequestMethod.GET, value = "getmax_quotes")
    public static  @ResponseBody int getMAX_QUOTES() {
        int result = TradeConfigServer.getMAX_QUOTES();
        return result;
    }

    /**
     * Sets the mAX_QUOTES.
     *
     * @param mAX_QUOTES
     *            The mAX_QUOTES to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setmax_quotes")
    public static @ResponseBody ResponseEntity<Void> setMAX_QUOTES(@RequestParam int mAX_QUOTES) {
        TradeConfigServer.setMAX_QUOTES(mAX_QUOTES);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Gets the actionTrace.
     *
     * @return Returns a boolean
     */
    @RequestMapping(method = RequestMethod.GET, value = "getactiontrace")
    public static  @ResponseBody boolean getActionTrace() {
        boolean result = TradeConfigServer.getActionTrace();
        return result;
    }

    /**
     * Sets the actionTrace.
     *
     * @param actionTrace
     *            The actionTrace to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setactiontrace")
    public static @ResponseBody ResponseEntity<Void> setActionTrace(@RequestParam boolean actionTrace) {
        TradeConfigServer.setActionTrace(actionTrace);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Sets the scenarioCount.
     *
     * @param scenarioCount
     *            The scenarioCount to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setscenariocount")
    public static @ResponseBody ResponseEntity<Void> setScenarioCount(@RequestParam int scenarioCount) {
        TradeConfigServer.setScenarioCount(scenarioCount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "incrementscenariocount")
    public static synchronized @ResponseBody ResponseEntity<Void> incrementScenarioCount() {
        TradeConfigServer.incrementScenarioCount();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Gets the updateQuotePrices.
     *
     * @return Returns a boolean
     */
    @RequestMapping(method = RequestMethod.GET, value = "getupdatequoteprices")
    public static  @ResponseBody boolean getUpdateQuotePrices() {
        boolean result = TradeConfigServer.getUpdateQuotePrices();
        return result;
    }

    /**
     * Sets the updateQuotePrices.
     *
     * @param updateQuotePrices
     *            The updateQuotePrices to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setupdatequoteprices")
    public static @ResponseBody ResponseEntity<Void> setUpdateQuotePrices(@RequestParam boolean updateQuotePrices) {
        TradeConfigServer.setUpdateQuotePrices(updateQuotePrices);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getprimiterations")
    public static  @ResponseBody int getPrimIterations() {
        int result = TradeConfigServer.getPrimIterations();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setprimiterations")
    public static @ResponseBody ResponseEntity<Void> setPrimIterations(@RequestParam int iter) {
        TradeConfigServer.setPrimIterations(iter);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getlongrun")
    public static  @ResponseBody boolean getLongRun() {
        boolean result = TradeConfigServer.getLongRun();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setlongrun")
    public static @ResponseBody ResponseEntity<Void> setLongRun(@RequestParam boolean longRun) {
        TradeConfigServer.setLongRun(longRun);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "setpublishquotepricechange")
    public static @ResponseBody ResponseEntity<Void> setPublishQuotePriceChange(@RequestParam boolean publishQuotePriceChange) {
        TradeConfigServer.setPublishQuotePriceChange(publishQuotePriceChange);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getpublishquotepricechange")
    public static  @ResponseBody boolean getPublishQuotePriceChange() {
        boolean result = TradeConfigServer.getPublishQuotePriceChange();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setmarketsummaryinterval")
    public static @ResponseBody ResponseEntity<Void> setMarketSummaryInterval(@RequestParam int seconds) {
        TradeConfigServer.setMarketSummaryInterval(seconds);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getmarketsummaryinterval")
    public static  @ResponseBody int getMarketSummaryInterval() {
        int result = TradeConfigServer.getMarketSummaryInterval();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setruntimemode")
    public static @ResponseBody ResponseEntity<Void> setRunTimeMode(@RequestParam int value) {
        TradeConfigServer.setRunTimeMode(value);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getruntimemode")
    public static  @ResponseBody int getRunTimeMode() {
        int result = TradeConfigServer.getRunTimeMode();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setorderprocessingmode")
    public static @ResponseBody ResponseEntity<Void> setOrderProcessingMode(@RequestParam int value) {
        TradeConfigServer.setOrderProcessingMode(value);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getorderprocessingmode")
    public static  @ResponseBody int getOrderProcessingMode() {
        int result = TradeConfigServer.getOrderProcessingMode();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setwebinterface")
    public static @ResponseBody ResponseEntity<Void> setWebInterface(@RequestParam int value) {
        TradeConfigServer.setWebInterface(value);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /*public static void setCachingType(int value) {
        cachingType = value;
    }

    public static int getCachingType() {
        return cachingType;
    }
	*/
    @RequestMapping(method = RequestMethod.GET, value = "setdisplayorderalerts")
    public static @ResponseBody ResponseEntity<Void> setDisplayOrderAlerts(@RequestParam boolean value) {
        TradeConfigServer.setDisplayOrderAlerts(value);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getdisplayorderalerts")
    public static  @ResponseBody boolean getDisplayOrderAlerts() {
        boolean result = TradeConfigServer.getDisplayOrderAlerts();
        return result;
    }

    /*
    public static void setDistributedMapCacheSize(int value) {
        distributedMapCacheSize = value;
    }

    public static int getDistributedMapCacheSize() {
        return distributedMapCacheSize;
    }*/
    @RequestMapping(method = RequestMethod.GET, value = "setpercentsenttowebsocket")
    public static @ResponseBody ResponseEntity<Void> setPercentSentToWebsocket(@RequestParam int value) {
        TradeConfigServer.setPercentSentToWebsocket(value);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getpercentsenttowebsocket")
    public static  @ResponseBody int getPercentSentToWebsocket() {
        int result = TradeConfigServer.getPercentSentToWebsocket();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setuseremoteejbinterface")
    public static @ResponseBody ResponseEntity<Void> setUseRemoteEJBInterface(@RequestParam boolean value) {
        TradeConfigServer.setUseRemoteEJBInterface(value);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "useremoteejbinterface")
    public static  @ResponseBody boolean useRemoteEJBInterface() {
        boolean result = TradeConfigServer.useRemoteEJBInterface();
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, TradeConfigServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tradeconfig")
    public  @ResponseBody int TradeConfig() {
        TradeConfigServer newServerObj = new TradeConfigServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

