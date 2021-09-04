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
import java.text.DecimalFormat;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class QuoteData {

    public QuoteData(BigDecimal price, BigDecimal open, String symbol) {
        String uri = MicroserviceApplication.projectUri + "/ms5/quotedata/quotedata?callerId=" + this.id + "&price=price&open=open&symbol=symbol";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public QuoteData(BigDecimal open, BigDecimal price, String symbol, BigDecimal high, BigDecimal low, String companyName, Double volume, Double change) {
        String uri = MicroserviceApplication.projectUri + "/ms5/quotedata/quotedata?callerId=" + this.id + "&open=open&price=price&symbol=symbol&high=high&low=low&companyName=companyName&volume=volume&change=change";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public void setSymbol(String symbol) {
        return;
    }

    public String getSymbol() {
        return (String) null;
    }

    public void setPrice(BigDecimal price) {
        return;
    }

    public BigDecimal getPrice() {
        return (BigDecimal) null;
    }

    public void setOpen(BigDecimal open) {
        return;
    }

    public BigDecimal getOpen() {
        return (BigDecimal) null;
    }

    public void setHigh(BigDecimal high) {
        return;
    }

    public BigDecimal getHigh() {
        return (BigDecimal) null;
    }

    public void setLow(BigDecimal low) {
        return;
    }

    public BigDecimal getLow() {
        return (BigDecimal) null;
    }

    public void setCompanyName(String companyName) {
        return;
    }

    public String getCompanyName() {
        return (String) null;
    }

    public void setVolume(double volume) {
        return;
    }

    public double getVolume() {
        return (Double) null;
    }

    public void setChange(double change) {
        return;
    }

    public double getChange() {
        return (Double) null;
    }

    public void setRange(String range) {
        return;
    }

    public String getRange() {
        return (String) null;
    }

    public void setGainPercent(BigDecimal gainPercent) {
        return;
    }

    public BigDecimal getGainPercent() {
        return (BigDecimal) null;
    }

    public void setGain(BigDecimal gain) {
        return;
    }

    public BigDecimal getGain() {
        return (BigDecimal) null;
    }

    public String getGainPercentHTML() {
        return (String) null;
    }

    public String getGainHTML() {
        return (String) null;
    }

    public String getChangeHTML() {
        return (String) null;
    }

    public int id = 0;

    public static QuoteData getObject(int id) {
        QuoteData obj = (QuoteData) new Object();
        obj.id = id;
        return obj;
    }
}

