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
import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Named("orderdata")
public class OrderDataJSF {

    public OrderDataJSF() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderdatajsf/orderdatajsfcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public void getAllOrder() {
        return;
    }

    @PostConstruct
    public void getOrder() {
        return;
    }

    public void setAllOrders(OrderData[] allOrders) {
        return;
    }

    public OrderData[] getAllOrders() {
        return (OrderData[]) null;
    }

    public void setOrderData(OrderData orderData) {
        return;
    }

    public OrderData getOrderData() {
        return (OrderData) null;
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

    public static OrderDataJSF getObject(int id) {
        OrderDataJSF obj = (OrderDataJSF) new Object();
        obj.id = id;
        return obj;
    }
}

