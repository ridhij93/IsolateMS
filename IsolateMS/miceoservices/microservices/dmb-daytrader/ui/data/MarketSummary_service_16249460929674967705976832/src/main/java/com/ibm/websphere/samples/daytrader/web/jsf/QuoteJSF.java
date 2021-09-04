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

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Named("quotedata")
@RequestScoped
public class QuoteJSF {

    @PostConstruct
    public void getAllQuotes() {
        return;
    }

    public String getQuotesBySymbols() {
        String uri = MicroserviceApplication.projectUri + "/ms5/quotejsf/getquotesbysymbolscallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public String buy() {
        String uri = MicroserviceApplication.projectUri + "/ms5/quotejsf/buycallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setQuotes(QuoteData[] quotes) {
        return;
    }

    public QuoteData[] getQuotes() {
        return (QuoteData[]) null;
    }

    public void setSymbols(String symbols) {
        return;
    }

    public String getSymbols() {
        return (String) null;
    }

    public void setDataTable(HtmlDataTable dataTable) {
        return;
    }

    public HtmlDataTable getDataTable() {
        return (HtmlDataTable) null;
    }

    public void setQuantity(Integer quantity) {
        return;
    }

    public Integer getQuantity() {
        return (Integer) null;
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

    public static QuoteJSF getObject(int id) {
        QuoteJSF obj = (QuoteJSF) new Object();
        obj.id = id;
        return obj;
    }
}

