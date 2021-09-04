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
package com.ibm.websphere.samples.daytrader.beans;

import java.io.Serializable;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RunStatsDataBean implements Serializable {

    // Constructors
    public RunStatsDataBean() {
        String uri = MicroserviceApplication.projectUri + "/ms0/runstatsdatabean/runstatsdatabeancallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    // count of new registered users in this run (users w/ userID like 'ru:%')
    @Override
    public String toString() {
        return (String) null;
    }

    /**
     * Gets the tradeUserCount
     *
     * @return Returns a int
     */
    public int getTradeUserCount() {
        return (Integer) null;
    }

    /**
     * Sets the tradeUserCount
     *
     * @param tradeUserCount
     *            The tradeUserCount to set
     */
    public void setTradeUserCount(int tradeUserCount) {
        String uri = MicroserviceApplication.projectUri + "/ms0/runstatsdatabean/settradeusercount?callerId=" + this.id + "&tradeUserCount=tradeUserCount";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the newUserCount
     *
     * @return Returns a int
     */
    public int getNewUserCount() {
        return (Integer) null;
    }

    /**
     * Sets the newUserCount
     *
     * @param newUserCount
     *            The newUserCount to set
     */
    public void setNewUserCount(int newUserCount) {
        String uri = MicroserviceApplication.projectUri + "/ms0/runstatsdatabean/setnewusercount?callerId=" + this.id + "&newUserCount=newUserCount";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the sumLoginCount
     *
     * @return Returns a int
     */
    public int getSumLoginCount() {
        return (Integer) null;
    }

    /**
     * Sets the sumLoginCount
     *
     * @param sumLoginCount
     *            The sumLoginCount to set
     */
    public void setSumLoginCount(int sumLoginCount) {
        String uri = MicroserviceApplication.projectUri + "/ms0/runstatsdatabean/setsumlogincount?callerId=" + this.id + "&sumLoginCount=sumLoginCount";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the sumLogoutCount
     *
     * @return Returns a int
     */
    public int getSumLogoutCount() {
        return (Integer) null;
    }

    /**
     * Sets the sumLogoutCount
     *
     * @param sumLogoutCount
     *            The sumLogoutCount to set
     */
    public void setSumLogoutCount(int sumLogoutCount) {
        String uri = MicroserviceApplication.projectUri + "/ms0/runstatsdatabean/setsumlogoutcount?callerId=" + this.id + "&sumLogoutCount=sumLogoutCount";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the holdingCount
     *
     * @return Returns a int
     */
    public int getHoldingCount() {
        return (Integer) null;
    }

    /**
     * Sets the holdingCount
     *
     * @param holdingCount
     *            The holdingCount to set
     */
    public void setHoldingCount(int holdingCount) {
        String uri = MicroserviceApplication.projectUri + "/ms0/runstatsdatabean/setholdingcount?callerId=" + this.id + "&holdingCount=holdingCount";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the buyOrderCount
     *
     * @return Returns a int
     */
    public int getBuyOrderCount() {
        return (Integer) null;
    }

    /**
     * Sets the buyOrderCount
     *
     * @param buyOrderCount
     *            The buyOrderCount to set
     */
    public void setBuyOrderCount(int buyOrderCount) {
        String uri = MicroserviceApplication.projectUri + "/ms0/runstatsdatabean/setbuyordercount?callerId=" + this.id + "&buyOrderCount=buyOrderCount";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the sellOrderCount
     *
     * @return Returns a int
     */
    public int getSellOrderCount() {
        return (Integer) null;
    }

    /**
     * Sets the sellOrderCount
     *
     * @param sellOrderCount
     *            The sellOrderCount to set
     */
    public void setSellOrderCount(int sellOrderCount) {
        String uri = MicroserviceApplication.projectUri + "/ms0/runstatsdatabean/setsellordercount?callerId=" + this.id + "&sellOrderCount=sellOrderCount";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the cancelledOrderCount
     *
     * @return Returns a int
     */
    public int getCancelledOrderCount() {
        return (Integer) null;
    }

    /**
     * Sets the cancelledOrderCount
     *
     * @param cancelledOrderCount
     *            The cancelledOrderCount to set
     */
    public void setCancelledOrderCount(int cancelledOrderCount) {
        String uri = MicroserviceApplication.projectUri + "/ms0/runstatsdatabean/setcancelledordercount?callerId=" + this.id + "&cancelledOrderCount=cancelledOrderCount";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the openOrderCount
     *
     * @return Returns a int
     */
    public int getOpenOrderCount() {
        return (Integer) null;
    }

    /**
     * Sets the openOrderCount
     *
     * @param openOrderCount
     *            The openOrderCount to set
     */
    public void setOpenOrderCount(int openOrderCount) {
        String uri = MicroserviceApplication.projectUri + "/ms0/runstatsdatabean/setopenordercount?callerId=" + this.id + "&openOrderCount=openOrderCount";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the deletedOrderCount
     *
     * @return Returns a int
     */
    public int getDeletedOrderCount() {
        return (Integer) null;
    }

    /**
     * Sets the deletedOrderCount
     *
     * @param deletedOrderCount
     *            The deletedOrderCount to set
     */
    public void setDeletedOrderCount(int deletedOrderCount) {
        String uri = MicroserviceApplication.projectUri + "/ms0/runstatsdatabean/setdeletedordercount?callerId=" + this.id + "&deletedOrderCount=deletedOrderCount";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the orderCount
     *
     * @return Returns a int
     */
    public int getOrderCount() {
        return (Integer) null;
    }

    /**
     * Sets the orderCount
     *
     * @param orderCount
     *            The orderCount to set
     */
    public void setOrderCount(int orderCount) {
        String uri = MicroserviceApplication.projectUri + "/ms0/runstatsdatabean/setordercount?callerId=" + this.id + "&orderCount=orderCount";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Gets the tradeStockCount
     *
     * @return Returns a int
     */
    public int getTradeStockCount() {
        return (Integer) null;
    }

    /**
     * Sets the tradeStockCount
     *
     * @param tradeStockCount
     *            The tradeStockCount to set
     */
    public void setTradeStockCount(int tradeStockCount) {
        String uri = MicroserviceApplication.projectUri + "/ms0/runstatsdatabean/settradestockcount?callerId=" + this.id + "&tradeStockCount=tradeStockCount";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static RunStatsDataBean getObject(int id) {
        RunStatsDataBean obj = (RunStatsDataBean) new Object();
        obj.id = id;
        return obj;
    }
}

