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
// import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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

@Entity(name = "orderejb")
@Table(name = "orderejb")
@NamedQueries({ @NamedQuery(name = "orderejb.findByOrderfee", query = "SELECT o FROM orderejb o WHERE o.orderFee = :orderfee"), @NamedQuery(name = "orderejb.findByCompletiondate", query = "SELECT o FROM orderejb o WHERE o.completionDate = :completiondate"), @NamedQuery(name = "orderejb.findByOrdertype", query = "SELECT o FROM orderejb o WHERE o.orderType = :ordertype"), @NamedQuery(name = "orderejb.findByOrderstatus", query = "SELECT o FROM orderejb o WHERE o.orderStatus = :orderstatus"), @NamedQuery(name = "orderejb.findByPrice", query = "SELECT o FROM orderejb o WHERE o.price = :price"), @NamedQuery(name = "orderejb.findByQuantity", query = "SELECT o FROM orderejb o WHERE o.quantity = :quantity"), @NamedQuery(name = "orderejb.findByOpendate", query = "SELECT o FROM orderejb o WHERE o.openDate = :opendate"), @NamedQuery(name = "orderejb.findByOrderid", query = "SELECT o FROM orderejb o WHERE o.orderID = :orderid"), @NamedQuery(name = "orderejb.findByAccountAccountid", query = "SELECT o FROM orderejb o WHERE o.account.accountID = :accountAccountid"), @NamedQuery(name = "orderejb.findByQuoteSymbol", query = "SELECT o FROM orderejb o WHERE o.quote.symbol = :quoteSymbol"), @NamedQuery(name = "orderejb.findByHoldingHoldingid", query = "SELECT o FROM orderejb o WHERE o.holding.holdingID = :holdingHoldingid"), @NamedQuery(name = "orderejb.closedOrders", query = "SELECT o FROM orderejb o WHERE o.orderStatus = 'closed' AND o.account.profile.userID  = :userID"), @NamedQuery(name = "orderejb.completeClosedOrders", query = "UPDATE orderejb o SET o.orderStatus = 'completed' WHERE o.orderStatus = 'closed' AND o.account.profile.userID  = :userID") })
public class OrderDataBean implements Serializable {

    /* orderID */
    /* orderType (buy, sell, etc.) */
    /*
                                 * orderStatus (open, processing, completed,
                                 * closed, cancelled)
                                 */
    /* openDate (when the order was entered) */
    /* completionDate */
    /* quantity */
    /* price */
    /* price */
    public OrderDataBean() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/orderdatabeancallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public OrderDataBean(Integer orderID, String orderType, String orderStatus, Date openDate, Date completionDate, double quantity, BigDecimal price, BigDecimal orderFee, String symbol) {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/orderdatabean?callerId=" + this.id + "&orderID=orderID&orderType=orderType&orderStatus=orderStatus&openDate=openDate&completionDate=completionDate&quantity=quantity&price=price&orderFee=orderFee&symbol=symbol";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public OrderDataBean(String orderType, String orderStatus, Date openDate, Date completionDate, double quantity, BigDecimal price, BigDecimal orderFee, AccountDataBean account, QuoteDataBean quote, HoldingDataBean holding) {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/orderdatabean?callerId=" + this.id + "&orderType=orderType&orderStatus=orderStatus&openDate=openDate&completionDate=completionDate&quantity=quantity&price=price&orderFee=orderFee&accountId=account.id&quoteId=quote.id&holdingId=holding.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public static OrderDataBean getRandomInstance() {
        return (OrderDataBean) null;
    }

    @Override
    public String toString() {
        return (String) null;
    }

    public String toHTML() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/tohtmlcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void print() {
        return;
    }

    public Integer getOrderID() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/getorderidcallerId=" + this.id + "";
        Integer resultTemp = new RestTemplate().getForObject(uri, Integer.class);
        Integer result = resultTemp;
        return result;
    }

    public void setOrderID(Integer orderID) {
        return;
    }

    public String getOrderType() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/getordertypecallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setOrderType(String orderType) {
        return;
    }

    public String getOrderStatus() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/getorderstatuscallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setOrderStatus(String orderStatus) {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/setorderstatus?callerId=" + this.id + "&orderStatus=orderStatus";
        new RestTemplate().getForObject(uri, void.class);
    }

    public Date getOpenDate() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/getopendatecallerId=" + this.id + "";
        Date resultTemp = new RestTemplate().getForObject(uri, Date.class);
        Date result = resultTemp;
        return result;
    }

    public void setOpenDate(Date openDate) {
        return;
    }

    public Date getCompletionDate() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/getcompletiondatecallerId=" + this.id + "";
        Date resultTemp = new RestTemplate().getForObject(uri, Date.class);
        Date result = resultTemp;
        return result;
    }

    public void setCompletionDate(Date completionDate) {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/setcompletiondate?callerId=" + this.id + "&completionDate=completionDate";
        new RestTemplate().getForObject(uri, void.class);
    }

    public double getQuantity() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/getquantitycallerId=" + this.id + "";
        double resultTemp = new RestTemplate().getForObject(uri, double.class);
        double result = resultTemp;
        return result;
    }

    public void setQuantity(double quantity) {
        return;
    }

    public BigDecimal getPrice() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/getpricecallerId=" + this.id + "";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public void setPrice(BigDecimal price) {
        return;
    }

    public BigDecimal getOrderFee() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/getorderfeecallerId=" + this.id + "";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public void setOrderFee(BigDecimal orderFee) {
        return;
    }

    public String getSymbol() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/getsymbolcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setSymbol(String symbol) {
        return;
    }

    public AccountDataBean getAccount() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/getaccountcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        AccountDataBean result = AccountDataBean.getObject(resultTemp);
        return result;
    }

    public void setAccount(AccountDataBean account) {
        return;
    }

    public QuoteDataBean getQuote() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/getquotecallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        QuoteDataBean result = QuoteDataBean.getObject(resultTemp);
        return result;
    }

    public void setQuote(QuoteDataBean quote) {
        return;
    }

    public HoldingDataBean getHolding() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/getholdingcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        HoldingDataBean result = HoldingDataBean.getObject(resultTemp);
        return result;
    }

    public void setHolding(HoldingDataBean holding) {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/setholding?callerId=" + this.id + "&holdingId=holding.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    public boolean isBuy() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/isbuycallerId=" + this.id + "";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    public boolean isSell() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/issellcallerId=" + this.id + "";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    public boolean isOpen() {
        return (Boolean) null;
    }

    public boolean isCompleted() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/iscompletedcallerId=" + this.id + "";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    public boolean isCancelled() {
        return (Boolean) null;
    }

    public void cancel() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatabean/cancelcallerId=" + this.id + "";
        new RestTemplate().getForObject(uri, void.class);
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

    public static OrderDataBean getObject(int id) {
        OrderDataBean obj = (OrderDataBean) new Object();
        obj.id = id;
        return obj;
    }
}

