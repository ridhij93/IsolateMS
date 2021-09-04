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
 * A filter to work around JERSEY-920
 *
 * https://java.net/jira/browse/JERSEY-920 https://github.com/mayocat/mayocat-shop/issues/118
 *
 * We need to remove this when using Jersey 2.0 (or something other than jersey).
 *
 * @version $Id: e1a3f20f9c4a563f9f7381754a24c2e9bde6d2d3 $
 */
@Component
public class JERSEY920WorkaroundServletFilterWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, JERSEY920WorkaroundServletFilterServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "jersey920workaroundservletfilter")
    public  @ResponseBody int JERSEY920WorkaroundServletFilter() {
        JERSEY920WorkaroundServletFilterServer newServerObj = new JERSEY920WorkaroundServletFilterServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

