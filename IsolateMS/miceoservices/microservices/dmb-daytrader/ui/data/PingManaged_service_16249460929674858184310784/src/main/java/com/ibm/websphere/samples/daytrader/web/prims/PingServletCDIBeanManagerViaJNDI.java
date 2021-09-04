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
import javax.inject.Inject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.web.prims.PingCDIBean;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@WebServlet("/servlet/PingServletCDIBeanManagerViaJNDI")
public class PingServletCDIBeanManagerViaJNDI extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String uri = MicroserviceApplication.projectUri + "/ms4/pingservletcdibeanmanagerviajndi/doget?callerId=" + this.id + "&requestId=request.id&responseId=response.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * called when the class is loaded to initialize the servlet
     *
     * @param config
     *            ServletConfig:
     */
    @Override
    public void init(ServletConfig config) {
        String uri = MicroserviceApplication.projectUri + "/ms4/pingservletcdibeanmanagerviajndi/init?callerId=" + this.id + "&configId=config.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public static void setInitTime(String initTime) {
        return;
    }

    public static String getInitTime() {
        return (String) null;
    }

    public void setCdiBean(PingCDIBean cdiBean) {
        return;
    }

    public PingCDIBean getCdiBean() {
        return (PingCDIBean) null;
    }

    public int id = 0;

    public static PingServletCDIBeanManagerViaJNDI getObject(int id) {
        PingServletCDIBeanManagerViaJNDI obj = (PingServletCDIBeanManagerViaJNDI) new Object();
        obj.id = id;
        return obj;
    }
}

