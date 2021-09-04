/**
 * ****************************************************************************
 *  Copyright (c) 2013 IBM Corp.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * *****************************************************************************
 */
package com.acmeair.web;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import com.acmeair.service.AuthService;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RESTCookieSessionFilter implements Filter {

    @Override
    public void destroy() {
        return;
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        return;
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        return;
    }

    public static String getLOGIN_USER() {
        return (String) null;
    }

    public static String getLOGIN_PATH() {
        return (String) null;
    }

    public static String getLOADDB_PATH() {
        return (String) null;
    }

    public static String getQUERY_PATH() {
        return (String) null;
    }

    public void setAuthService(AuthService authService) {
        return;
    }

    public AuthService getAuthService() {
        return (AuthService) null;
    }

    public int id = 0;

    public static RESTCookieSessionFilter getObject(int id) {
        RESTCookieSessionFilter obj = (RESTCookieSessionFilter) new Object();
        obj.id = id;
        return obj;
    }
}

