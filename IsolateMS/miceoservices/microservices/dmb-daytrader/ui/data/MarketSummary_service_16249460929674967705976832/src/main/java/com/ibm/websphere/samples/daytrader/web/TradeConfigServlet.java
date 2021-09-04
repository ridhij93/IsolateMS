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
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean;
import com.ibm.websphere.samples.daytrader.direct.TradeDirect;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * TradeConfigServlet provides a servlet interface to adjust DayTrader runtime parameters.
 * TradeConfigServlet updates values in the {@link com.ibm.websphere.samples.daytrader.web.TradeConfig} JavaBean holding
 * all configuration and runtime parameters for the Trade application
 */
@WebServlet(name = "TradeConfigServlet", urlPatterns = { "/config" })
public class TradeConfigServlet extends HttpServlet {

    /**
     * Servlet initialization method.
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        return;
    }

    /**
     * Create the TradeConfig bean and pass it the config.jsp page
     * to display the current Trade runtime configuration
     * Creation date: (2/8/2000 3:43:59 PM)
     */
    void doConfigDisplay(HttpServletRequest req, HttpServletResponse resp, String results) throws Exception {
        return;
    }

    void doResetTrade(HttpServletRequest req, HttpServletResponse resp, String results) throws Exception {
        return;
    }

    /**
     * Update Trade runtime configuration paramaters
     * Creation date: (2/8/2000 3:44:24 PM)
     */
    void doConfigUpdate(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        return;
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        return;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static TradeConfigServlet getObject(int id) {
        TradeConfigServlet obj = (TradeConfigServlet) new Object();
        obj.id = id;
        return obj;
    }
}

