/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.views;

import java.nio.file.Paths;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Web views for errors. Templates names correspond to the HTTP status code for that error, example : 500.html for
 * 500 errors, 404.html for 400 errors, etc.
 *
 * @version $Id: b21cdbe8135bd266f4051cae03ebaa9c94cd4aca $
 */
public class ErrorWebView extends WebView {

    public ErrorWebView() {
        String uri = MicroserviceApplication.projectUri + "/ms0/errorwebview/errorwebviewcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public ErrorWebView status(int status) {
        return (ErrorWebView) null;
    }

    public int id = 0;

    public static ErrorWebView getObject(int id) {
        ErrorWebView obj = (ErrorWebView) new Object();
        obj.id = id;
        return obj;
    }
}

