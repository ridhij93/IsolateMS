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
import javax.servlet.ReadListener;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpUpgradeHandler;
import javax.servlet.http.WebConnection;
import javax.servlet.annotation.WebServlet;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@WebServlet(name = "PingUpgradeServlet", urlPatterns = { "/servlet/PingUpgradeServlet" }, asyncSupported = true)
public class PingUpgradeServlet extends HttpServlet {

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse res) {
        String uri = MicroserviceApplication.projectUri + "/ms5/pingupgradeservlet/doget?callerId=" + this.id + "&reqId=req.id&resId=res.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse res) {
        String uri = MicroserviceApplication.projectUri + "/ms5/pingupgradeservlet/dopost?callerId=" + this.id + "&reqId=req.id&resId=res.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    public static class Handler implements HttpUpgradeHandler {

        @Override
        public void init(final WebConnection wc) {
            return;
        }

        @Override
        public void destroy() {
            return;
        }
    }

    private static class Listener implements ReadListener {

        private final WebConnection connection;

        private ServletInputStream input = null;

        private ServletOutputStream output = null;

        private Listener(final WebConnection connection) throws IOException {
            String uri = MicroserviceApplication.projectUri + "/msnull/listener/listener?callerId=" + this.id + "&connectionId=connection.id";
            ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
            this.id = resultTemp;
        }

        @Override
        public void onDataAvailable() throws IOException {
            return;
        }

        private void closeConnection() {
            return;
        }

        @Override
        public void onAllDataRead() throws IOException {
            return;
        }

        @Override
        public void onError(final Throwable t) {
            return;
        }
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static PingUpgradeServlet getObject(int id) {
        PingUpgradeServlet obj = (PingUpgradeServlet) new Object();
        obj.id = id;
        return obj;
    }
}

