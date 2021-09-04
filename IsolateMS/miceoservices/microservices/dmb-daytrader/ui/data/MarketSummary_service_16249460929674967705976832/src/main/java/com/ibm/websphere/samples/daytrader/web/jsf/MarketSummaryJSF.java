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
import java.math.RoundingMode;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Named("marketdata")
@RequestScoped
public class MarketSummaryJSF {

    @PostConstruct
    public void getMarketSummary() {
        return;
    }

    public void setTSIA(BigDecimal tSIA) {
        return;
    }

    public BigDecimal getTSIA() {
        return (BigDecimal) null;
    }

    public void setOpenTSIA(BigDecimal openTSIA) {
        return;
    }

    public BigDecimal getOpenTSIA() {
        return (BigDecimal) null;
    }

    public void setVolume(double volume) {
        return;
    }

    public double getVolume() {
        return (Double) null;
    }

    public void setTopGainers(QuoteData[] topGainers) {
        return;
    }

    public QuoteData[] getTopGainers() {
        return (QuoteData[]) null;
    }

    public void setTopLosers(QuoteData[] topLosers) {
        return;
    }

    public QuoteData[] getTopLosers() {
        return (QuoteData[]) null;
    }

    public void setSummaryDate(Date summaryDate) {
        return;
    }

    public Date getSummaryDate() {
        return (Date) null;
    }

    public void setGainPercent(BigDecimal gainPercent) {
        return;
    }

    public BigDecimal getGainPercent() {
        return (BigDecimal) null;
    }

    public String getGainPercentHTML() {
        return (String) null;
    }

    public void setTradeAction(TradeAction tradeAction) {
        return;
    }

    public TradeAction getTradeAction() {
        return (TradeAction) null;
    }

    public int id = 0;

    public static MarketSummaryJSF getObject(int id) {
        MarketSummaryJSF obj = (MarketSummaryJSF) new Object();
        obj.id = id;
        return obj;
    }
}

