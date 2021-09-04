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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * TradeConfig is a JavaBean holding all configuration and runtime parameters
 * for the Trade application TradeConfig sets runtime parameters such as the
 * RunTimeMode (EJB, JDBC, EJB_ALT)
 */
public class TradeConfig {

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
    private static String getHostname() {
        return (String) null;
    }

    /**
     * Return a Trade UI Web page based on the current configuration This may
     * return a JSP page or a Servlet page Creation date: (3/14/2000 9:08:34 PM)
     */
    public static String getPage(int pageNumber) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getpage?pageNumber=pageNumber";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    /**
     * Return the list of run time mode names Creation date: (3/8/2000 5:58:34
     * PM)
     *
     * @return java.lang.String[]
     */
    public static java.lang.String[] getRunTimeModeNames() {
        return (String[]) null;
    }

    /**
     * Return a Trade Scenario Operation based on the setting of the current mix
     * (TradeScenarioMix) Creation date: (2/10/2000 9:08:34 PM)
     */
    public static char getScenarioAction(boolean newUser) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getscenarioaction?newUser=newUser";
        char resultTemp = new RestTemplate().getForObject(uri, char.class);
        char result = resultTemp;
        return result;
    }

    public static String getUserID() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getuserid";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static BigDecimal getOrderFee(String orderType) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getorderfee?orderType=orderType";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    /**
     * Increment the sell deficit counter Creation date: (6/21/2000 11:33:45 AM)
     */
    public static synchronized void incrementSellDeficit() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/incrementselldeficit";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static String nextUserID() {
        return (String) null;
    }

    public static double random() {
        return (Double) null;
    }

    public static String rndAddress() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/rndaddress";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String rndBalance() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/rndbalance";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String rndCreditCard() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/rndcreditcard";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String rndEmail(String userID) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/rndemail?userID=userID";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String rndFullName() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/rndfullname";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static int rndInt(int i) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/rndint?i=i";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        int result = resultTemp;
        return result;
    }

    public static float rndFloat(int i) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/rndfloat?i=i";
        float resultTemp = new RestTemplate().getForObject(uri, float.class);
        float result = resultTemp;
        return result;
    }

    public static BigDecimal rndBigDecimal(float f) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/rndbigdecimal?f=f";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public static boolean rndBoolean() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/rndboolean";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    /**
     * Returns a new Trade user Creation date: (2/16/2000 8:50:35 PM)
     */
    public static synchronized String rndNewUserID() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/rndnewuserid";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static float rndPrice() {
        return (Float) null;
    }

    public static BigDecimal getRandomPriceChangeFactor() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getrandompricechangefactor";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public static float rndQuantity() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/rndquantity";
        float resultTemp = new RestTemplate().getForObject(uri, float.class);
        float result = resultTemp;
        return result;
    }

    public static String rndSymbol() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/rndsymbol";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String rndSymbols() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/rndsymbols";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String rndUserID() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/rnduserid";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    private static synchronized String getNextUserIDFromDeck() {
        return (String) null;
    }

    // Trade implements a card deck approach to selecting
    /**
     * Set the list of run time mode names Creation date: (3/8/2000 5:58:34 PM)
     *
     * @param newRunTimeModeNames
     *            java.lang.String[]
     */
    public static void setRunTimeModeNames(java.lang.String[] newRunTimeModeNames) {
        return;
    }

    /**
     * This is a convenience method for servlets to set Trade configuration
     * parameters from servlet initialization parameters. The servlet provides
     * the init param and its value as strings. This method then parses the
     * parameter, converts the value to the correct type and sets the
     * corresponding TradeConfig parameter to the converted value
     */
    public static void setConfigParam(String parm, String value) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setconfigparam?parm=parm&value=value";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the orderProcessingModeNames
     *
     * @return Returns a String[]
     */
    public static String[] getOrderProcessingModeNames() {
        return (String[]) null;
    }

    /**
     * Gets the webInterfaceNames
     *
     * @return Returns a String[]
     */
    public static String[] getWebInterfaceNames() {
        return (String[]) null;
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
     * Gets the scenarioMixes
     *
     * @return Returns a int[][]
     */
    public static int[][] getScenarioMixes() {
        return (int[][]) null;
    }

    /**
     * Gets the trace
     *
     * @return Returns a boolean
     */
    public static boolean getTrace() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/gettrace";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    /**
     * Sets the trace
     *
     * @param trace
     *            The trace to set
     */
    public static void setTrace(boolean traceValue) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/settrace?traceValue=traceValue";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the mAX_USERS.
     *
     * @return Returns a int
     */
    public static int getMAX_USERS() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getmax_users";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        int result = resultTemp;
        return result;
    }

    /**
     * Sets the mAX_USERS.
     *
     * @param mAX_USERS
     *            The mAX_USERS to set
     */
    public static void setMAX_USERS(int mAX_USERS) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setmax_users?mAX_USERS=mAX_USERS";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the mAX_QUOTES.
     *
     * @return Returns a int
     */
    public static int getMAX_QUOTES() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getmax_quotes";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        int result = resultTemp;
        return result;
    }

    /**
     * Sets the mAX_QUOTES.
     *
     * @param mAX_QUOTES
     *            The mAX_QUOTES to set
     */
    public static void setMAX_QUOTES(int mAX_QUOTES) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setmax_quotes?mAX_QUOTES=mAX_QUOTES";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the mAX_HOLDINGS.
     *
     * @return Returns a int
     */
    public static int getMAX_HOLDINGS() {
        return (Integer) null;
    }

    /**
     * Sets the mAX_HOLDINGS.
     *
     * @param mAX_HOLDINGS
     *            The mAX_HOLDINGS to set
     */
    public static void setMAX_HOLDINGS(int mAX_HOLDINGS) {
        return;
    }

    /**
     * Gets the actionTrace.
     *
     * @return Returns a boolean
     */
    public static boolean getActionTrace() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getactiontrace";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    /**
     * Sets the actionTrace.
     *
     * @param actionTrace
     *            The actionTrace to set
     */
    public static void setActionTrace(boolean actionTrace) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setactiontrace?actionTrace=actionTrace";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the scenarioCount.
     *
     * @return Returns a int
     */
    public static int getScenarioCount() {
        return (Integer) null;
    }

    /**
     * Sets the scenarioCount.
     *
     * @param scenarioCount
     *            The scenarioCount to set
     */
    public static void setScenarioCount(int scenarioCount) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setscenariocount?scenarioCount=scenarioCount";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static synchronized void incrementScenarioCount() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/incrementscenariocount";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the jdbc driver needs global transaction Some XA Drivers require a
     * global transaction to be started for all SQL calls. To work around this,
     * set this to true to cause the direct mode to start a user transaction.
     *
     * @return Returns a boolean
     */
    public static boolean getJDBCDriverNeedsGlobalTransation() {
        return (Boolean) null;
    }

    /**
     * Sets the jdbc driver needs global transaction
     *
     * @param JDBCDriverNeedsGlobalTransationVal
     *            the value
     */
    public static void setJDBCDriverNeedsGlobalTransation(boolean JDBCDriverNeedsGlobalTransationVal) {
        return;
    }

    /**
     * Gets the updateQuotePrices.
     *
     * @return Returns a boolean
     */
    public static boolean getUpdateQuotePrices() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getupdatequoteprices";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    /**
     * Sets the updateQuotePrices.
     *
     * @param updateQuotePrices
     *            The updateQuotePrices to set
     */
    public static void setUpdateQuotePrices(boolean updateQuotePrices) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setupdatequoteprices?updateQuotePrices=updateQuotePrices";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static int getPrimIterations() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getprimiterations";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        int result = resultTemp;
        return result;
    }

    public static void setPrimIterations(int iter) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setprimiterations?iter=iter";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static boolean getLongRun() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getlongrun";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    public static void setLongRun(boolean longRun) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setlongrun?longRun=longRun";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void setPublishQuotePriceChange(boolean publishQuotePriceChange) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setpublishquotepricechange?publishQuotePriceChange=publishQuotePriceChange";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static boolean getPublishQuotePriceChange() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getpublishquotepricechange";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    public static void setMarketSummaryInterval(int seconds) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setmarketsummaryinterval?seconds=seconds";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static int getMarketSummaryInterval() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getmarketsummaryinterval";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        int result = resultTemp;
        return result;
    }

    public static void setRunTimeMode(int value) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setruntimemode?value=value";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static int getRunTimeMode() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getruntimemode";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        int result = resultTemp;
        return result;
    }

    public static void setOrderProcessingMode(int value) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setorderprocessingmode?value=value";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static int getOrderProcessingMode() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getorderprocessingmode";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        int result = resultTemp;
        return result;
    }

    public static void setAccessMode(int value) {
        return;
    }

    public static int getAccessMode() {
        return (Integer) null;
    }

    public static void setWebInterface(int value) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setwebinterface?value=value";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static int getWebInterface() {
        return (Integer) null;
    }

    /*public static void setCachingType(int value) {
        cachingType = value;
    }

    public static int getCachingType() {
        return cachingType;
    }
	*/
    public static void setDisplayOrderAlerts(boolean value) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setdisplayorderalerts?value=value";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static boolean getDisplayOrderAlerts() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getdisplayorderalerts";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    /*
    public static void setDistributedMapCacheSize(int value) {
        distributedMapCacheSize = value;
    }

    public static int getDistributedMapCacheSize() {
        return distributedMapCacheSize;
    }*/
    public static void setPercentSentToWebsocket(int value) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setpercentsenttowebsocket?value=value";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static int getPercentSentToWebsocket() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/getpercentsenttowebsocket";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        int result = resultTemp;
        return result;
    }

    public static void setUseRemoteEJBInterface(boolean value) {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/setuseremoteejbinterface?value=value";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static boolean useRemoteEJBInterface() {
        String uri = MicroserviceApplication.projectUri + "/ms7/tradeconfig/useremoteejbinterface";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    public static int getEJB3() {
        return (Integer) null;
    }

    public static int getDIRECT() {
        return (Integer) null;
    }

    public static void setOrderProcessingModeNames(String[] orderProcessingModeNames) {
        return;
    }

    public static int getSYNCH() {
        return (Integer) null;
    }

    public static int getASYNCH_2PHASE() {
        return (Integer) null;
    }

    public static int getASYNCH_MANAGEDTHREAD() {
        return (Integer) null;
    }

    public static void setAccessModeNames(String[] accessModeNames) {
        return;
    }

    public static String[] getAccessModeNames() {
        return (String[]) null;
    }

    public static int getSTANDARD() {
        return (Integer) null;
    }

    public static void setWebInterfaceNames(String[] webInterfaceNames) {
        return;
    }

    public static int getJSP() {
        return (Integer) null;
    }

    public static int getJSP_Images() {
        return (Integer) null;
    }

    public static void setJDBC_UID(String JDBC_UID) {
        return;
    }

    public static String getJDBC_UID() {
        return (String) null;
    }

    public static void setJDBC_PWD(String JDBC_PWD) {
        return;
    }

    public static String getJDBC_PWD() {
        return (String) null;
    }

    public static void setDS_NAME(String DS_NAME) {
        return;
    }

    public static String getDS_NAME() {
        return (String) null;
    }

    public static void setDATASOURCE(String DATASOURCE) {
        return;
    }

    public static String getDATASOURCE() {
        return (String) null;
    }

    public static void setKEYBLOCKSIZE(int KEYBLOCKSIZE) {
        return;
    }

    public static int getKEYBLOCKSIZE() {
        return (Integer) null;
    }

    public static void setQUOTES_PER_PAGE(int QUOTES_PER_PAGE) {
        return;
    }

    public static int getQUOTES_PER_PAGE() {
        return (Integer) null;
    }

    public static void setRND_USER(boolean RND_USER) {
        return;
    }

    public static boolean getRND_USER() {
        return (Boolean) null;
    }

    public static void setCount(int count) {
        return;
    }

    public static int getCount() {
        return (Integer) null;
    }

    public static void setUserID_count_semaphore(Object userID_count_semaphore) {
        return;
    }

    public static Object getUserID_count_semaphore() {
        return (Object) null;
    }

    public static void setUserID_count(int userID_count) {
        return;
    }

    public static int getUserID_count() {
        return (Integer) null;
    }

    public static void setHostName(String hostName) {
        return;
    }

    public static String getHostName() {
        return (String) null;
    }

    public static void setR0(Random r0) {
        return;
    }

    public static Random getR0() {
        return (Random) null;
    }

    public static void setRandomNumberGenerator(Random randomNumberGenerator) {
        return;
    }

    public static Random getRandomNumberGenerator() {
        return (Random) null;
    }

    public static String getNewUserPrefix() {
        return (String) null;
    }

    public static int getVerifyPercent() {
        return (Integer) null;
    }

    public static boolean getUseRemoteEJBInterface() {
        return (Boolean) null;
    }

    public static void setPENNY_STOCK_PRICE(BigDecimal PENNY_STOCK_PRICE) {
        return;
    }

    public static BigDecimal getPENNY_STOCK_PRICE() {
        return (BigDecimal) null;
    }

    public static void setPENNY_STOCK_RECOVERY_MIRACLE_MULTIPLIER(BigDecimal PENNY_STOCK_RECOVERY_MIRACLE_MULTIPLIER) {
        return;
    }

    public static BigDecimal getPENNY_STOCK_RECOVERY_MIRACLE_MULTIPLIER() {
        return (BigDecimal) null;
    }

    public static void setMAXIMUM_STOCK_PRICE(BigDecimal MAXIMUM_STOCK_PRICE) {
        return;
    }

    public static BigDecimal getMAXIMUM_STOCK_PRICE() {
        return (BigDecimal) null;
    }

    public static void setMAXIMUM_STOCK_SPLIT_MULTIPLIER(BigDecimal MAXIMUM_STOCK_SPLIT_MULTIPLIER) {
        return;
    }

    public static BigDecimal getMAXIMUM_STOCK_SPLIT_MULTIPLIER() {
        return (BigDecimal) null;
    }

    public static int getHOME_OP() {
        return (Integer) null;
    }

    public static int getQUOTE_OP() {
        return (Integer) null;
    }

    public static int getLOGIN_OP() {
        return (Integer) null;
    }

    public static int getLOGOUT_OP() {
        return (Integer) null;
    }

    public static int getREGISTER_OP() {
        return (Integer) null;
    }

    public static int getACCOUNT_OP() {
        return (Integer) null;
    }

    public static int getPORTFOLIO_OP() {
        return (Integer) null;
    }

    public static int getBUY_OP() {
        return (Integer) null;
    }

    public static int getSELL_OP() {
        return (Integer) null;
    }

    public static int getUPDATEACCOUNT_OP() {
        return (Integer) null;
    }

    public static void setScenarioMixes(int[][] scenarioMixes) {
        return;
    }

    public static void setActions(char[] actions) {
        return;
    }

    public static char[] getActions() {
        return (char[]) null;
    }

    public static void setSellDeficit(int sellDeficit) {
        return;
    }

    public static int getSellDeficit() {
        return (Integer) null;
    }

    public static int getWELCOME_PAGE() {
        return (Integer) null;
    }

    public static int getREGISTER_PAGE() {
        return (Integer) null;
    }

    public static int getPORTFOLIO_PAGE() {
        return (Integer) null;
    }

    public static int getQUOTE_PAGE() {
        return (Integer) null;
    }

    public static int getHOME_PAGE() {
        return (Integer) null;
    }

    public static int getACCOUNT_PAGE() {
        return (Integer) null;
    }

    public static int getORDER_PAGE() {
        return (Integer) null;
    }

    public static int getCONFIG_PAGE() {
        return (Integer) null;
    }

    public static int getSTATS_PAGE() {
        return (Integer) null;
    }

    public static int getMARKET_SUMMARY_PAGE() {
        return (Integer) null;
    }

    public static void setWebUI(String[][] webUI) {
        return;
    }

    public static String[][] getWebUI() {
        return (String[][]) null;
    }

    public static BigDecimal getCashFee() {
        return (BigDecimal) null;
    }

    public static BigDecimal getONE() {
        return (BigDecimal) null;
    }

    public static void setDeck(ArrayList<Integer> deck) {
        return;
    }

    public static ArrayList<Integer> getDeck() {
        return (ArrayList<Integer>) null;
    }

    public static void setCard(int card) {
        return;
    }

    public static int getCard() {
        return (Integer) null;
    }

    public int id = 0;

    public static TradeConfig getObject(int id) {
        TradeConfig obj = (TradeConfig) new Object();
        obj.id = id;
        return obj;
    }
}

