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
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * PingHTTPSession3 tests the servers ability to manage and persist large
 * HTTPSession data objects. The servlet creates the large custom java object
 * {@link PingSession3Object}. This large session object is retrieved and stored
 * to the session on each user request. The default settings result in approx
 * 2024 bits being retrieved and stored upon each request.
 */
@WebServlet(name = "PingSession3", urlPatterns = { "/servlet/PingSession3" })
public class PingSession3 extends HttpServlet {

    /**
     * forwards post requests to the doGet method Creation date: (11/6/2000
     * 10:52:39 AM)
     *
     * @param res
     *            javax.servlet.http.HttpServletRequest
     * @param res2
     *            javax.servlet.http.HttpServletResponse
     */
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        String uri = MicroserviceApplication.projectUri + "/ms5/pingsession3/dopost?callerId=" + this.id + "&reqId=req.id&resId=res.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * this is the main method of the servlet that will service all get
     * requests.
     *
     * @param request
     *            HttpServletRequest
     * @param responce
     *            HttpServletResponce
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String uri = MicroserviceApplication.projectUri + "/ms5/pingsession3/doget?callerId=" + this.id + "&requestId=request.id&responseId=response.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * returns a string of information about the servlet
     *
     * @return info String: contains info about the servlet
     */
    @Override
    public String getServletInfo() {
        return (String) null;
    }

    /**
     * called when the class is loaded to initialize the servlet
     *
     * @param config
     *            ServletConfig:
     */
    @Override
    public void init(ServletConfig config) {
        String uri = MicroserviceApplication.projectUri + "/ms5/pingsession3/init?callerId=" + this.id + "&configId=config.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public static void setNUM_OBJECTS(int NUM_OBJECTS) {
        return;
    }

    public static int getNUM_OBJECTS() {
        return (Integer) null;
    }

    public static void setInitTime(String initTime) {
        return;
    }

    public static String getInitTime() {
        return (String) null;
    }

    public static void setHitCount(int hitCount) {
        return;
    }

    public static int getHitCount() {
        return (Integer) null;
    }

    public int id = 0;

    public static PingSession3 getObject(int id) {
        PingSession3 obj = (PingSession3) new Object();
        obj.id = id;
        return obj;
    }
}

