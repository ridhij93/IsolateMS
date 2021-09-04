/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.jersey;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.mayocat.servlet.ServletFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xwiki.component.annotation.Component;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * A filter to work around JERSEY-920
 *
 * https://java.net/jira/browse/JERSEY-920 https://github.com/mayocat/mayocat-shop/issues/118
 *
 * We need to remove this when using Jersey 2.0 (or something other than jersey).
 *
 * @version $Id: e1a3f20f9c4a563f9f7381754a24c2e9bde6d2d3 $
 */
@Component
public class JERSEY920WorkaroundServletFilter implements Filter, ServletFilter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        return;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        return;
    }

    @Override
    public void destroy() {
        return;
    }

    @Override
    public String urlPattern() {
        return (String) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static JERSEY920WorkaroundServletFilter getObject(int id) {
        JERSEY920WorkaroundServletFilter obj = (JERSEY920WorkaroundServletFilter) new Object();
        obj.id = id;
        return obj;
    }
}

