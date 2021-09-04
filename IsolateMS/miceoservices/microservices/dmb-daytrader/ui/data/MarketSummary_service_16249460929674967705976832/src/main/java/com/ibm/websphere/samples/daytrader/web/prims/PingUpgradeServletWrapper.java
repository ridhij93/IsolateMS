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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@WebServlet(name = "PingUpgradeServlet", urlPatterns = { "/servlet/PingUpgradeServlet" }, asyncSupported = true)
public class PingUpgradeServletWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "doget")
    protected @ResponseBody ResponseEntity<Void> doGet(@RequestParam int callerId, @RequestParam final int reqId, @RequestParam final int resId) {
        try {
            PingUpgradeServletServer callerObj = idObjMap.get(callerId);
            callerObj.doGet(HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(resId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "dopost")
    protected @ResponseBody ResponseEntity<Void> doPost(@RequestParam int callerId, @RequestParam final int reqId, @RequestParam final int resId) {
        try {
            PingUpgradeServletServer callerObj = idObjMap.get(callerId);
            callerObj.doPost(HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(resId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public static class Handler implements HttpUpgradeHandler {
    }

    private static class Listener implements ReadListener {

        private final WebConnection connection;

        private ServletInputStream input = null;

        private ServletOutputStream output = null;

        private Listener(final WebConnection connection) throws IOException {
            this.connection = connection;
            this.input = connection.getInputStream();
            this.output = connection.getOutputStream();
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, PingUpgradeServletServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "pingupgradeservlet")
    public  @ResponseBody int PingUpgradeServlet() {
        PingUpgradeServletServer newServerObj = new PingUpgradeServletServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

