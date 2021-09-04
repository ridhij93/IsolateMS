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
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Named("accountdata")
@RequestScoped
public class AccountDataJSF {

    public void toggleShowAllRows() {
        String uri = MicroserviceApplication.projectUri + "/ms2/accountdatajsf/toggleshowallrowscallerId=" + this.id + "";
        new RestTemplate().getForObject(uri, void.class);
    }

    @PostConstruct
    public void home() {
        return;
    }

    private void doAccountData(AccountDataBean accountData, Collection<?> holdingDataBeans) {
        return;
    }

    public Date getSessionCreationDate() {
        return (Date) null;
    }

    public void setSessionCreationDate(Date sessionCreationDate) {
        return;
    }

    public Date getCurrentTime() {
        return (Date) null;
    }

    public void setCurrentTime(Date currentTime) {
        return;
    }

    public String getProfileID() {
        return (String) null;
    }

    public void setProfileID(String profileID) {
        return;
    }

    public void setAccountID(Integer accountID) {
        return;
    }

    public Integer getAccountID() {
        return (Integer) null;
    }

    public void setCreationDate(Date creationDate) {
        return;
    }

    public Date getCreationDate() {
        return (Date) null;
    }

    public void setLoginCount(int loginCount) {
        return;
    }

    public int getLoginCount() {
        return (Integer) null;
    }

    public void setBalance(BigDecimal balance) {
        return;
    }

    public BigDecimal getBalance() {
        return (BigDecimal) null;
    }

    public void setOpenBalance(BigDecimal openBalance) {
        return;
    }

    public BigDecimal getOpenBalance() {
        return (BigDecimal) null;
    }

    public void setHoldingsTotal(BigDecimal holdingsTotal) {
        return;
    }

    public BigDecimal getHoldingsTotal() {
        return (BigDecimal) null;
    }

    public void setSumOfCashHoldings(BigDecimal sumOfCashHoldings) {
        return;
    }

    public BigDecimal getSumOfCashHoldings() {
        return (BigDecimal) null;
    }

    public void setGain(BigDecimal gain) {
        return;
    }

    public BigDecimal getGain() {
        return (BigDecimal) null;
    }

    public void setGainPercent(BigDecimal gainPercent) {
        return;
    }

    public BigDecimal getGainPercent() {
        return (BigDecimal) null;
    }

    public void setNumberHoldings(Integer numberHoldings) {
        return;
    }

    public Integer getNumberHoldings() {
        return (Integer) null;
    }

    public OrderData[] getClosedOrders() {
        return (OrderData[]) null;
    }

    public void setClosedOrders(OrderData[] closedOrders) {
        return;
    }

    public void setLastLogin(Date lastLogin) {
        return;
    }

    public Date getLastLogin() {
        return (Date) null;
    }

    public void setLogoutCount(int logoutCount) {
        return;
    }

    public int getLogoutCount() {
        return (Integer) null;
    }

    public void setAllOrders(OrderData[] allOrders) {
        return;
    }

    public OrderData[] getAllOrders() {
        return (OrderData[]) null;
    }

    public String getGainHTML() {
        return (String) null;
    }

    public String getGainPercentHTML() {
        return (String) null;
    }

    public Integer getNumberOfOrderRows() {
        return (Integer) null;
    }

    public void setNumberOfOrderRows(Integer numberOfOrderRows) {
        return;
    }

    public Integer getNumberOfOrders() {
        return (Integer) null;
    }

    public void setNumberOfOrders(Integer numberOfOrders) {
        return;
    }

    public void setFacesExternalContext(ExternalContext facesExternalContext) {
        return;
    }

    public ExternalContext getFacesExternalContext() {
        return (ExternalContext) null;
    }

    public void setTradeAction(TradeAction tradeAction) {
        return;
    }

    public TradeAction getTradeAction() {
        return (TradeAction) null;
    }

    public int id = 0;

    public static AccountDataJSF getObject(int id) {
        AccountDataJSF obj = (AccountDataJSF) new Object();
        obj.id = id;
        return obj;
    }
}

