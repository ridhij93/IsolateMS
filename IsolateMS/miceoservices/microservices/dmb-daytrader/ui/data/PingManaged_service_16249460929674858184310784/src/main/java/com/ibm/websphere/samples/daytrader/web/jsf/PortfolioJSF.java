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
import java.util.Iterator;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Named("portfolio")
@RequestScoped
public class PortfolioJSF {

    @PostConstruct
    public void getPortfolio() {
        return;
    }

    public String sell() {
        String uri = MicroserviceApplication.projectUri + "/ms4/portfoliojsf/sellcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setDataTable(HtmlDataTable dataTable) {
        return;
    }

    public HtmlDataTable getDataTable() {
        return (HtmlDataTable) null;
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

    public void setNumberHoldings(Integer numberHoldings) {
        return;
    }

    public Integer getNumberHoldings() {
        return (Integer) null;
    }

    public void setTotalGain(BigDecimal totalGain) {
        return;
    }

    public BigDecimal getTotalGain() {
        return (BigDecimal) null;
    }

    public void setTotalValue(BigDecimal totalValue) {
        return;
    }

    public BigDecimal getTotalValue() {
        return (BigDecimal) null;
    }

    public void setTotalBasis(BigDecimal totalBasis) {
        return;
    }

    public BigDecimal getTotalBasis() {
        return (BigDecimal) null;
    }

    public void setHoldingDatas(ArrayList<HoldingData> holdingDatas) {
        return;
    }

    public ArrayList<HoldingData> getHoldingDatas() {
        return (ArrayList<HoldingData>) null;
    }

    public void setTotalGainPercent(BigDecimal totalGainPercent) {
        return;
    }

    public BigDecimal getTotalGainPercent() {
        return (BigDecimal) null;
    }

    public String getTotalGainPercentHTML() {
        return (String) null;
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

    public static PortfolioJSF getObject(int id) {
        PortfolioJSF obj = (PortfolioJSF) new Object();
        obj.id = id;
        return obj;
    }
}

