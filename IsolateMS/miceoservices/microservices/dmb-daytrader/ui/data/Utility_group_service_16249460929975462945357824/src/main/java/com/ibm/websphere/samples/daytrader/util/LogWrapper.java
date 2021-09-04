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
package com.ibm.websphere.samples.daytrader.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ms7/log/")
public class LogWrapper {

    // A general purpose, high performance logging, tracing, statistic service
    @RequestMapping(method = RequestMethod.GET, value = "log")
    public static @ResponseBody ResponseEntity<Void> log(@RequestParam String message) {
        LogServer.log(message);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "log")
    public static @ResponseBody ResponseEntity<Void> log(@RequestParam String msg1, @RequestParam String msg2) {
        LogServer.log(msg1, msg2);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "log")
    public static @ResponseBody ResponseEntity<Void> log(@RequestParam String msg1, @RequestParam String msg2, @RequestParam String msg3) {
        LogServer.log(msg1, msg2, msg3);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "error")
    public static @ResponseBody ResponseEntity<Void> error(@RequestParam String message) {
        LogServer.error(message);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "error")
    public static @ResponseBody ResponseEntity<Void> error(@RequestParam String message, @RequestParam int eId) {
        LogServer.error(message, Throwable.getObject(eId));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "error")
    public static @ResponseBody ResponseEntity<Void> error(@RequestParam String msg1, @RequestParam String msg2, @RequestParam int eId) {
        LogServer.error(msg1, msg2, Throwable.getObject(eId));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "error")
    public static @ResponseBody ResponseEntity<Void> error(@RequestParam String msg1, @RequestParam String msg2, @RequestParam String msg3, @RequestParam int eId) {
        LogServer.error(msg1, msg2, msg3, Throwable.getObject(eId));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "error")
    public static @ResponseBody ResponseEntity<Void> error(@RequestParam int eId, @RequestParam String message) {
        LogServer.error(Throwable.getObject(eId), message);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "error")
    public static @ResponseBody ResponseEntity<Void> error(@RequestParam int eId, @RequestParam String msg1, @RequestParam String msg2) {
        LogServer.error(Throwable.getObject(eId), msg1, msg2);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "error")
    public static @ResponseBody ResponseEntity<Void> error(@RequestParam int eId, @RequestParam String msg1, @RequestParam String msg2, @RequestParam String msg3) {
        LogServer.error(Throwable.getObject(eId), msg1, msg2, msg3);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "trace")
    public static @ResponseBody ResponseEntity<Void> trace(@RequestParam String message) {
        LogServer.trace(message);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "trace")
    public static @ResponseBody ResponseEntity<Void> trace(@RequestParam String message, @RequestParam int parm1Id) {
        LogServer.trace(message, Object.getObject(parm1Id));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "trace")
    public static @ResponseBody ResponseEntity<Void> trace(@RequestParam String message, @RequestParam int parm1Id, @RequestParam int parm2Id) {
        LogServer.trace(message, Object.getObject(parm1Id), Object.getObject(parm2Id));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "trace")
    public static @ResponseBody ResponseEntity<Void> trace(@RequestParam String message, @RequestParam int parm1Id, @RequestParam int parm2Id, @RequestParam int parm3Id) {
        LogServer.trace(message, Object.getObject(parm1Id), Object.getObject(parm2Id), Object.getObject(parm3Id));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "trace")
    public static @ResponseBody ResponseEntity<Void> trace(@RequestParam String message, @RequestParam int parm1Id, @RequestParam int parm2Id, @RequestParam int parm3Id, @RequestParam int parm4Id) {
        LogServer.trace(message, Object.getObject(parm1Id), Object.getObject(parm2Id), Object.getObject(parm3Id), Object.getObject(parm4Id));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "trace")
    public static @ResponseBody ResponseEntity<Void> trace(@RequestParam String message, @RequestParam int parm1Id, @RequestParam int parm2Id, @RequestParam int parm3Id, @RequestParam int parm4Id, @RequestParam int parm5Id) {
        LogServer.trace(message, Object.getObject(parm1Id), Object.getObject(parm2Id), Object.getObject(parm3Id), Object.getObject(parm4Id), Object.getObject(parm5Id));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "trace")
    public static @ResponseBody ResponseEntity<Void> trace(@RequestParam String message, @RequestParam int parm1Id, @RequestParam int parm2Id, @RequestParam int parm3Id, @RequestParam int parm4Id, @RequestParam int parm5Id, @RequestParam int parm6Id) {
        LogServer.trace(message, Object.getObject(parm1Id), Object.getObject(parm2Id), Object.getObject(parm3Id), Object.getObject(parm4Id), Object.getObject(parm5Id), Object.getObject(parm6Id));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "trace")
    public static @ResponseBody ResponseEntity<Void> trace(@RequestParam String message, @RequestParam int parm1Id, @RequestParam int parm2Id, @RequestParam int parm3Id, @RequestParam int parm4Id, @RequestParam int parm5Id, @RequestParam int parm6Id, @RequestParam int parm7Id) {
        LogServer.trace(message, Object.getObject(parm1Id), Object.getObject(parm2Id), Object.getObject(parm3Id), Object.getObject(parm4Id), Object.getObject(parm5Id), Object.getObject(parm6Id), Object.getObject(parm7Id));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "traceenter")
    public static @ResponseBody ResponseEntity<Void> traceEnter(@RequestParam String message) {
        LogServer.traceEnter(message);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "traceexit")
    public static @ResponseBody ResponseEntity<Void> traceExit(@RequestParam String message) {
        LogServer.traceExit(message);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "debug")
    public static @ResponseBody ResponseEntity<Void> debug(@RequestParam String message) {
        LogServer.debug(message);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "printcollection")
    public static @ResponseBody ResponseEntity<Void> printCollection(@RequestParam Collection<?> c) {
        LogServer.printCollection(c);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "printcollection")
    public static @ResponseBody ResponseEntity<Void> printCollection(@RequestParam String message, @RequestParam Collection<?> c) {
        LogServer.printCollection(message, c);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "doactiontrace")
    public static  @ResponseBody boolean doActionTrace() {
        boolean result = LogServer.doActionTrace();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "dotrace")
    public static  @ResponseBody boolean doTrace() {
        boolean result = LogServer.doTrace();
        return result;
    }

    /**
     * Sets the trace
     *
     * @param trace
     *            The trace to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "settrace")
    public static @ResponseBody ResponseEntity<Void> setTrace(@RequestParam boolean traceValue) {
        LogServer.setTrace(traceValue);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Sets the trace value for Trade actions only
     *
     * @param trace
     *            The trace to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setactiontrace")
    public static @ResponseBody ResponseEntity<Void> setActionTrace(@RequestParam boolean traceValue) {
        LogServer.setActionTrace(traceValue);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private static int maxId = 0;

    public static HashMap<Integer, LogServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "log")
    public  @ResponseBody int Log() {
        LogServer newServerObj = new LogServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

