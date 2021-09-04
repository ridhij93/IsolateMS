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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * PingHTTPSession1 - SessionID tests fundamental HTTP session functionality by
 * creating a unique session ID for each individual user. The ID is stored in
 * the users session and is accessed and displayed on each user request.
 */
@WebServlet(name = "PingSession1", urlPatterns = { "/servlet/PingSession1" })
public class PingSession1Wrapper {

    // For each new session created, add a session ID of the form "sessionID:" +
    /**
     * forwards post requests to the doGet method Creation date: (11/6/2000
     * 10:52:39 AM)
     *
     * @param res
     *            javax.servlet.http.HttpServletRequest
     * @param res2
     *            javax.servlet.http.HttpServletResponse
     */
    @RequestMapping(method = RequestMethod.GET, value = "dopost")
    public @ResponseBody ResponseEntity<Void> doPost(@RequestParam int callerId, @RequestParam int reqId, @RequestParam int resId) {
        try {
            PingSession1Server callerObj = idObjMap.get(callerId);
            callerObj.doPost(HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(resId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
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
    @RequestMapping(method = RequestMethod.GET, value = "doget")
    public @ResponseBody ResponseEntity<Void> doGet(@RequestParam int callerId, @RequestParam int requestId, @RequestParam int responseId) {
        try {
            PingSession1Server callerObj = idObjMap.get(callerId);
            callerObj.doGet(HttpServletRequest.getObject(requestId), HttpServletResponse.getObject(responseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * returns a string of information about the servlet
     *
     * @return info String: contains info about the servlet
     */
    /**
     * called when the class is loaded to initialize the servlet
     *
     * @param config
     *            ServletConfig:
     */
    @RequestMapping(method = RequestMethod.GET, value = "init")
    public @ResponseBody ResponseEntity<Void> init(@RequestParam int callerId, @RequestParam int configId) {
        try {
            PingSession1Server callerObj = idObjMap.get(callerId);
            callerObj.init(ServletConfig.getObject(configId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, PingSession1Server> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "pingsession1")
    public  @ResponseBody int PingSession1() {
        PingSession1Server newServerObj = new PingSession1Server();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

