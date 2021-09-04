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
package com.ibm.websphere.samples.daytrader.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Entity(name = "holdingejb")
@Table(name = "holdingejb")
public class HoldingDataBean implements Serializable {

    /* persistent/relationship fields */
    /* holdingID */
    /* quantity */
    /* purchasePrice */
    /* purchaseDate */
    /* Holding(*) ---> Quote(1) */
    public HoldingDataBean() {
        String uri = MicroserviceApplication.projectUri + "/ms4/holdingdatabean/holdingdatabeancallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public HoldingDataBean(Integer holdingID, double quantity, BigDecimal purchasePrice, Date purchaseDate, String quoteID) {
        String uri = MicroserviceApplication.projectUri + "/ms4/holdingdatabean/holdingdatabean?callerId=" + this.id + "&holdingID=holdingID&quantity=quantity&purchasePrice=purchasePrice&purchaseDate=purchaseDate&quoteID=quoteID";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public HoldingDataBean(double quantity, BigDecimal purchasePrice, Date purchaseDate, AccountDataBean account, QuoteDataBean quote) {
        String uri = MicroserviceApplication.projectUri + "/ms4/holdingdatabean/holdingdatabean?callerId=" + this.id + "&quantity=quantity&purchasePrice=purchasePrice&purchaseDate=purchaseDate&accountId=account.id&quoteId=quote.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public static HoldingDataBean getRandomInstance() {
        return (HoldingDataBean) null;
    }

    @Override
    public String toString() {
        return (String) null;
    }

    public String toHTML() {
        String uri = MicroserviceApplication.projectUri + "/ms4/holdingdatabean/tohtmlcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void print() {
        return;
    }

    public Integer getHoldingID() {
        String uri = MicroserviceApplication.projectUri + "/ms4/holdingdatabean/getholdingidcallerId=" + this.id + "";
        Integer resultTemp = new RestTemplate().getForObject(uri, Integer.class);
        Integer result = resultTemp;
        return result;
    }

    public void setHoldingID(Integer holdingID) {
        return;
    }

    public double getQuantity() {
        String uri = MicroserviceApplication.projectUri + "/ms4/holdingdatabean/getquantitycallerId=" + this.id + "";
        double resultTemp = new RestTemplate().getForObject(uri, double.class);
        double result = resultTemp;
        return result;
    }

    public void setQuantity(double quantity) {
        return;
    }

    public BigDecimal getPurchasePrice() {
        String uri = MicroserviceApplication.projectUri + "/ms4/holdingdatabean/getpurchasepricecallerId=" + this.id + "";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        return;
    }

    public Date getPurchaseDate() {
        String uri = MicroserviceApplication.projectUri + "/ms4/holdingdatabean/getpurchasedatecallerId=" + this.id + "";
        Date resultTemp = new RestTemplate().getForObject(uri, Date.class);
        Date result = resultTemp;
        return result;
    }

    public void setPurchaseDate(Date purchaseDate) {
        String uri = MicroserviceApplication.projectUri + "/ms4/holdingdatabean/setpurchasedate?callerId=" + this.id + "&purchaseDate=purchaseDate";
        new RestTemplate().getForObject(uri, void.class);
    }

    public String getQuoteID() {
        String uri = MicroserviceApplication.projectUri + "/ms4/holdingdatabean/getquoteidcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setQuoteID(String quoteID) {
        return;
    }

    public AccountDataBean getAccount() {
        return (AccountDataBean) null;
    }

    public void setAccount(AccountDataBean account) {
        return;
    }

    public QuoteDataBean getQuote() {
        String uri = MicroserviceApplication.projectUri + "/ms4/holdingdatabean/getquotecallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        QuoteDataBean result = QuoteDataBean.getObject(resultTemp);
        return result;
    }

    public void setQuote(QuoteDataBean quote) {
        return;
    }

    @Override
    public int hashCode() {
        return (Integer) null;
    }

    @Override
    public boolean equals(Object object) {
        return (Boolean) null;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static HoldingDataBean getObject(int id) {
        HoldingDataBean obj = (HoldingDataBean) new Object();
        obj.id = id;
        return obj;
    }
}

