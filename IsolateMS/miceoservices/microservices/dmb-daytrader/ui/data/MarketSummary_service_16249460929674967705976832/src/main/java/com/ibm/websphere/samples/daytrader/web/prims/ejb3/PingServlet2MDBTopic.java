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
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import java.io.IOException;
import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * This primitive is designed to run inside the TradeApplication and relies upon
 * the {@link com.ibm.websphere.samples.daytrader.util.TradeConfig} class to set
 * configuration parameters. PingServlet2MDBQueue tests key functionality of a
 * servlet call to a post a message to an MDB Topic. The TradeStreamerMDB (and
 * any other subscribers) receives the message This servlet makes use of the MDB
 * EJB {@link com.ibm.websphere.samples.daytrader.ejb3.DTStreamer3MDB} by
 * posting a message to the MDB Topic
 */
@WebServlet(name = "ejb3.PingServlet2MDBTopic", urlPatterns = { "/ejb3/PingServlet2MDBTopic" })
public class PingServlet2MDBTopic extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        String uri = MicroserviceApplication.projectUri + "/ms5/pingservlet2mdbtopic/dopost?callerId=" + this.id + "&reqId=req.id&resId=res.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        String uri = MicroserviceApplication.projectUri + "/ms5/pingservlet2mdbtopic/doget?callerId=" + this.id + "&reqId=req.id&resId=res.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    @Override
    public String getServletInfo() {
        return (String) null;
    }

    @Override
    public void init(ServletConfig config) {
        String uri = MicroserviceApplication.projectUri + "/ms5/pingservlet2mdbtopic/init?callerId=" + this.id + "&configId=config.id";
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

    public void setTopicConnectionFactory(ConnectionFactory topicConnectionFactory) {
        return;
    }

    public ConnectionFactory getTopicConnectionFactory() {
        return (ConnectionFactory) null;
    }

    public void setTradeStreamerTopic(Topic tradeStreamerTopic) {
        return;
    }

    public Topic getTradeStreamerTopic() {
        return (Topic) null;
    }

    public int id = 0;

    public static PingServlet2MDBTopic getObject(int id) {
        PingServlet2MDBTopic obj = (PingServlet2MDBTopic) new Object();
        obj.id = id;
        return obj;
    }
}

