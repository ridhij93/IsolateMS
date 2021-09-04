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
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * TradeScenarioServlet emulates a population of web users by generating a
 * specific Trade operation for a randomly chosen user on each access to the
 * URL. Test this servlet by clicking Trade Scenario and hit "Reload" on your
 * browser to step through a Trade Scenario. To benchmark using this URL aim
 * your favorite web load generator (such as AKStress) at the Trade Scenario URL
 * and fire away.
 */
@WebServlet(name = "TradeScenarioServlet", urlPatterns = { "/scenario" })
public class TradeScenarioServlet extends HttpServlet {

    /**
     * Servlet initialization method.
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        return;
    }

    /**
     * Returns a string that contains information about TradeScenarioServlet
     *
     * @return The servlet information
     */
    @Override
    public java.lang.String getServletInfo() {
        return (String) null;
    }

    /**
     * Process incoming HTTP GET requests
     *
     * @param request
     *            Object that encapsulates the request to the servlet
     * @param response
     *            Object that encapsulates the response from the servlet
     */
    @Override
    public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        return;
    }

    /**
     * Process incoming HTTP POST requests
     *
     * @param request
     *            Object that encapsulates the request to the servlet
     * @param response
     *            Object that encapsulates the response from the servlet
     */
    @Override
    public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        return;
    }

    /**
     * Main service method for TradeScenarioServlet
     *
     * @param request
     *            Object that encapsulates the request to the servlet
     * @param response
     *            Object that encapsulates the response from the servlet
     */
    public void performTask(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        return;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public static String getTasPathPrefix() {
        return (String) null;
    }

    public int id = 0;

    public static TradeScenarioServlet getObject(int id) {
        TradeScenarioServlet obj = (TradeScenarioServlet) new Object();
        obj.id = id;
        return obj;
    }
}

