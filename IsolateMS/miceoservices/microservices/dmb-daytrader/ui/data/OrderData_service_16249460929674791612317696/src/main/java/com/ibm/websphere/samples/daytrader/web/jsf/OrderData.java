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
import java.util.Date;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class OrderData {

    public OrderData(Integer orderID, String orderStatus, Date openDate, Date completeDate, BigDecimal orderFee, String orderType, double quantity, String symbol) {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdata/orderdata?callerId=" + this.id + "&orderID=orderID&orderStatus=orderStatus&openDate=openDate&completeDate=completeDate&orderFee=orderFee&orderType=orderType&quantity=quantity&symbol=symbol";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public OrderData(Integer orderID, String orderStatus, Date openDate, Date completeDate, BigDecimal orderFee, String orderType, double quantity, String symbol, BigDecimal price) {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdata/orderdata?callerId=" + this.id + "&orderID=orderID&orderStatus=orderStatus&openDate=openDate&completeDate=completeDate&orderFee=orderFee&orderType=orderType&quantity=quantity&symbol=symbol&price=price";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public void setOrderID(Integer orderID) {
        return;
    }

    public Integer getOrderID() {
        return (Integer) null;
    }

    public void setOrderStatus(String orderStatus) {
        return;
    }

    public String getOrderStatus() {
        return (String) null;
    }

    public void setOpenDate(Date openDate) {
        return;
    }

    public Date getOpenDate() {
        return (Date) null;
    }

    public void setCompletionDate(Date completionDate) {
        return;
    }

    public Date getCompletionDate() {
        return (Date) null;
    }

    public void setOrderFee(BigDecimal orderFee) {
        return;
    }

    public BigDecimal getOrderFee() {
        return (BigDecimal) null;
    }

    public void setOrderType(String orderType) {
        return;
    }

    public String getOrderType() {
        return (String) null;
    }

    public void setQuantity(double quantity) {
        return;
    }

    public double getQuantity() {
        return (Double) null;
    }

    public void setSymbol(String symbol) {
        return;
    }

    public String getSymbol() {
        return (String) null;
    }

    public void setTotal(BigDecimal total) {
        return;
    }

    public BigDecimal getTotal() {
        return (BigDecimal) null;
    }

    public void setPrice(BigDecimal price) {
        return;
    }

    public BigDecimal getPrice() {
        return (BigDecimal) null;
    }

    public int id = 0;

    public static OrderData getObject(int id) {
        OrderData obj = (OrderData) new Object();
        obj.id = id;
        return obj;
    }
}

