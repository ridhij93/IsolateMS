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
import java.math.BigDecimal;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@WebServlet(name = "TestServlet", urlPatterns = { "/TestServlet" })
public class TestServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) {
        String uri = MicroserviceApplication.projectUri + "/ms5/testservlet/init?callerId=" + this.id + "&configId=config.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
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
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String uri = MicroserviceApplication.projectUri + "/ms5/testservlet/doget?callerId=" + this.id + "&requestId=request.id&responseId=response.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
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
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String uri = MicroserviceApplication.projectUri + "/ms5/testservlet/dopost?callerId=" + this.id + "&requestId=request.id&responseId=response.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * Main service method for TradeAppServlet
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

    public int id = 0;

    public static TestServlet getObject(int id) {
        TestServlet obj = (TestServlet) new Object();
        obj.id = id;
        return obj;
    }
}

