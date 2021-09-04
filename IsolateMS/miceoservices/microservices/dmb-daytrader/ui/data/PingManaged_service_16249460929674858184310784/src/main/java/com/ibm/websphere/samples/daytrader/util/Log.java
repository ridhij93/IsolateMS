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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Log {

    // A general purpose, high performance logging, tracing, statistic service
    public static void log(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/log?message=message";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void log(String msg1, String msg2) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/log?msg1=msg1&msg2=msg2";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void log(String msg1, String msg2, String msg3) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/log?msg1=msg1&msg2=msg2&msg3=msg3";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void error(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/error?message=message";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void error(String message, Throwable e) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/error?message=message&eId=e.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void error(String msg1, String msg2, Throwable e) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/error?msg1=msg1&msg2=msg2&eId=e.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void error(String msg1, String msg2, String msg3, Throwable e) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/error?msg1=msg1&msg2=msg2&msg3=msg3&eId=e.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void error(Throwable e, String message) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/error?eId=e.id&message=message";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void error(Throwable e, String msg1, String msg2) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/error?eId=e.id&msg1=msg1&msg2=msg2";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void error(Throwable e, String msg1, String msg2, String msg3) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/error?eId=e.id&msg1=msg1&msg2=msg2&msg3=msg3";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void trace(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/trace?message=message";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void trace(String message, Object parm1) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/trace?message=message&parm1Id=parm1.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void trace(String message, Object parm1, Object parm2) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/trace?message=message&parm1Id=parm1.id&parm2Id=parm2.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void trace(String message, Object parm1, Object parm2, Object parm3) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/trace?message=message&parm1Id=parm1.id&parm2Id=parm2.id&parm3Id=parm3.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void trace(String message, Object parm1, Object parm2, Object parm3, Object parm4) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/trace?message=message&parm1Id=parm1.id&parm2Id=parm2.id&parm3Id=parm3.id&parm4Id=parm4.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void trace(String message, Object parm1, Object parm2, Object parm3, Object parm4, Object parm5) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/trace?message=message&parm1Id=parm1.id&parm2Id=parm2.id&parm3Id=parm3.id&parm4Id=parm4.id&parm5Id=parm5.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void trace(String message, Object parm1, Object parm2, Object parm3, Object parm4, Object parm5, Object parm6) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/trace?message=message&parm1Id=parm1.id&parm2Id=parm2.id&parm3Id=parm3.id&parm4Id=parm4.id&parm5Id=parm5.id&parm6Id=parm6.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void trace(String message, Object parm1, Object parm2, Object parm3, Object parm4, Object parm5, Object parm6, Object parm7) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/trace?message=message&parm1Id=parm1.id&parm2Id=parm2.id&parm3Id=parm3.id&parm4Id=parm4.id&parm5Id=parm5.id&parm6Id=parm6.id&parm7Id=parm7.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void traceEnter(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/traceenter?message=message";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void traceExit(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/traceexit?message=message";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void stat(String message) {
        return;
    }

    public static void debug(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/debug?message=message";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void print(String message) {
        return;
    }

    public static void printObject(Object o) {
        return;
    }

    public static void printCollection(Collection<?> c) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/printcollection?c=c";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static void printCollection(String message, Collection<?> c) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/printcollection?message=message&c=c";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static boolean doActionTrace() {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/doactiontrace";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    public static boolean doTrace() {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/dotrace";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    public static boolean doDebug() {
        return (Boolean) null;
    }

    public static boolean doStat() {
        return (Boolean) null;
    }

    /**
     * Gets the trace
     *
     * @return Returns a boolean
     */
    public static boolean getTrace() {
        return (Boolean) null;
    }

    /**
     * Gets the trace value for Trade actions only
     *
     * @return Returns a boolean
     */
    public static boolean getActionTrace() {
        return (Boolean) null;
    }

    /**
     * Sets the trace
     *
     * @param trace
     *            The trace to set
     */
    public static void setTrace(boolean traceValue) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/settrace?traceValue=traceValue";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * Sets the trace value for Trade actions only
     *
     * @param trace
     *            The trace to set
     */
    public static void setActionTrace(boolean traceValue) {
        String uri = MicroserviceApplication.projectUri + "/ms7/log/setactiontrace?traceValue=traceValue";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static Logger getLog() {
        return (Logger) null;
    }

    public int id = 0;

    public static Log getObject(int id) {
        Log obj = (Log) new Object();
        obj.id = id;
        return obj;
    }
}

