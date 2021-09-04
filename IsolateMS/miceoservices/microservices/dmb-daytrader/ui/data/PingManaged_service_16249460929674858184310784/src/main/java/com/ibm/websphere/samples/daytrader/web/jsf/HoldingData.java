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

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Named
@SessionScoped
public class HoldingData implements Serializable {

    public void setHoldingID(Integer holdingID) {
        return;
    }

    public Integer getHoldingID() {
        return (Integer) null;
    }

    public void setQuantity(double quantity) {
        return;
    }

    public double getQuantity() {
        return (Double) null;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        return;
    }

    public BigDecimal getPurchasePrice() {
        return (BigDecimal) null;
    }

    public void setPurchaseDate(Date purchaseDate) {
        return;
    }

    public Date getPurchaseDate() {
        return (Date) null;
    }

    public void setQuoteID(String quoteID) {
        return;
    }

    public String getQuoteID() {
        return (String) null;
    }

    public void setPrice(BigDecimal price) {
        return;
    }

    public BigDecimal getPrice() {
        return (BigDecimal) null;
    }

    public void setBasis(BigDecimal basis) {
        return;
    }

    public BigDecimal getBasis() {
        return (BigDecimal) null;
    }

    public void setMarketValue(BigDecimal marketValue) {
        return;
    }

    public BigDecimal getMarketValue() {
        return (BigDecimal) null;
    }

    public void setGain(BigDecimal gain) {
        return;
    }

    public BigDecimal getGain() {
        return (BigDecimal) null;
    }

    public String getGainHTML() {
        return (String) null;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static HoldingData getObject(int id) {
        HoldingData obj = (HoldingData) new Object();
        obj.id = id;
        return obj;
    }
}

