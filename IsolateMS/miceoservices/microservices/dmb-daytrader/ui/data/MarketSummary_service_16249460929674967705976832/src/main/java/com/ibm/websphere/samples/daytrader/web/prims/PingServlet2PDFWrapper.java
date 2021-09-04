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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
 * PingServlet2PDF tests a call to a servlet which then loads a PDF document.
 */
@WebServlet(name = "PingServlet2PDF", urlPatterns = { "/servlet/PingServlet2PDF" })
public class PingServlet2PDFWrapper {

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
            PingServlet2PDFServer callerObj = idObjMap.get(callerId);
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
    public @ResponseBody ResponseEntity<Void> doGet(@RequestParam int callerId, @RequestParam int reqId, @RequestParam int resId) {
        try {
            PingServlet2PDFServer callerObj = idObjMap.get(callerId);
            callerObj.doGet(HttpServletRequest.getObject(reqId), HttpServletResponse.getObject(resId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, PingServlet2PDFServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "pingservlet2pdf")
    public  @ResponseBody int PingServlet2PDF() {
        PingServlet2PDFServer newServerObj = new PingServlet2PDFServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

