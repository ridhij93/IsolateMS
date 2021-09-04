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
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.servlet.AsyncContext;
import javax.servlet.ReadListener;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

// import com.ibm.websphere.samples.daytrader.util.Log;
/**
 * PingServlet31Async tests fundamental dynamic HTML creation functionality through
 * server side servlet processing asynchronously with non-blocking i/o.
 */
@WebServlet(name = "PingServlet31Async", urlPatterns = { "/servlet/PingServlet31Async" }, asyncSupported = true)
public class PingServlet31Async extends HttpServlet {

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
        String uri = MicroserviceApplication.projectUri + "/ms0/pingservlet31async/dopost?callerId=" + this.id + "&reqId=req.id&resId=res.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    class ReadListenerImpl implements ReadListener {

        private ServletInputStream input = null;

        private HttpServletResponse res = null;

        private AsyncContext ac = null;

        private Queue<String> queue = new LinkedBlockingQueue<String>();

        ReadListenerImpl(ServletInputStream in, HttpServletResponse r, AsyncContext c) {
            String uri = MicroserviceApplication.projectUri + "/msnull/readlistenerimpl/readlistenerimpl?callerId=" + this.id + "&inId=in.id&rId=r.id&cId=c.id";
            int resultTemp = new RestTemplate().getForObject(uri, int.class);
            this.id = resultTemp;
        }

        public void onDataAvailable() throws IOException {
            return;
        }

        public void onAllDataRead() throws IOException {
            return;
        }

        public void onError(final Throwable t) {
            return;
        }
    }

    class WriteListenerImpl implements WriteListener {

        private ServletOutputStream output = null;

        private Queue<String> queue = null;

        private AsyncContext ac = null;

        WriteListenerImpl(ServletOutputStream sos, Queue<String> q, AsyncContext c) {
            String uri = MicroserviceApplication.projectUri + "/msnull/writelistenerimpl/writelistenerimpl?callerId=" + this.id + "&sosId=sos.id&qId=q.id&cId=c.id";
            int resultTemp = new RestTemplate().getForObject(uri, int.class);
            this.id = resultTemp;
        }

        public void onWritePossible() throws IOException {
            return;
        }

        public void onError(final Throwable t) {
            ac.complete();
            t.printStackTrace();
        }
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
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        String uri = MicroserviceApplication.projectUri + "/ms0/pingservlet31async/doget?callerId=" + this.id + "&reqId=req.id&resId=res.id";
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
        String uri = MicroserviceApplication.projectUri + "/ms0/pingservlet31async/init?callerId=" + this.id + "&configId=config.id";
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

    public static void setHitCount(int hitCount) {
        return;
    }

    public static int getHitCount() {
        return (Integer) null;
    }

    public int id = 0;

    public static PingServlet31Async getObject(int id) {
        PingServlet31Async obj = (PingServlet31Async) new Object();
        obj.id = id;
        return obj;
    }
}

