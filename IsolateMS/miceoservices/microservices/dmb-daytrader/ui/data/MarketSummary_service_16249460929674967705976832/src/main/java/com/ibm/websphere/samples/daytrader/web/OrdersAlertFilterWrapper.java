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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@WebFilter(filterName = "OrdersAlertFilter", urlPatterns = "/app")
public class OrdersAlertFilterWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "init")
    public @ResponseBody ResponseEntity<Void> init(@RequestParam int callerId, @RequestParam int filterConfigId) {
        try {
            OrdersAlertFilterServer callerObj = idObjMap.get(callerId);
            callerObj.init(FilterConfig.getObject(filterConfigId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    @RequestMapping(method = RequestMethod.GET, value = "dofilter")
    public @ResponseBody ResponseEntity<Void> doFilter(@RequestParam int callerId, @RequestParam int reqId, @RequestParam int respId, @RequestParam int chainId) {
        try {
            OrdersAlertFilterServer callerObj = idObjMap.get(callerId);
            callerObj.doFilter(ServletRequest.getObject(reqId), ServletResponse.getObject(respId), FilterChain.getObject(chainId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, OrdersAlertFilterServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "ordersalertfilter")
    public  @ResponseBody int OrdersAlertFilter() {
        OrdersAlertFilterServer newServerObj = new OrdersAlertFilterServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

