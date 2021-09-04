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
package com.ibm.websphere.samples.daytrader.web;

import java.io.IOException;
import java.util.Collection;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.TradeServices;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@WebFilter(filterName = "OrdersAlertFilter", urlPatterns = "/app")
public class OrdersAlertFilter implements Filter {

    /**
     * Constructor for CompletedOrdersAlertFilter
     */
    public OrdersAlertFilter() {
        String uri = MicroserviceApplication.projectUri + "/ms5/ordersalertfilter/ordersalertfiltercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public void init(FilterConfig filterConfig) {
        String uri = MicroserviceApplication.projectUri + "/ms5/ordersalertfilter/init?callerId=" + this.id + "&filterConfigId=filterConfig.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) {
        String uri = MicroserviceApplication.projectUri + "/ms5/ordersalertfilter/dofilter?callerId=" + this.id + "&reqId=req.id&respId=resp.id&chainId=chain.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * @see Filter#destroy()
     */
    @Override
    public void destroy() {
        return;
    }

    public void setFilterConfig(FilterConfig filterConfig) {
        return;
    }

    public FilterConfig getFilterConfig() {
        return (FilterConfig) null;
    }

    public int id = 0;

    public static OrdersAlertFilter getObject(int id) {
        OrdersAlertFilter obj = (OrdersAlertFilter) new Object();
        obj.id = id;
        return obj;
    }
}

