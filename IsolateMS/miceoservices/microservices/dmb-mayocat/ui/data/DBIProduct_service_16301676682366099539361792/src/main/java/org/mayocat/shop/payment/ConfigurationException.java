/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: dd2655dc4d707488fc7bf90289f11d67b02fdb0d $
 */
public class ConfigurationException extends PaymentException {

    public ConfigurationException() {
        String uri = MicroserviceApplication.projectUri + "/ms1/configurationexception/configurationexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public ConfigurationException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms1/configurationexception/configurationexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public ConfigurationException(String message, Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms1/configurationexception/configurationexception?callerId=" + this.id + "&message=message&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public ConfigurationException(Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms1/configurationexception/configurationexception?callerId=" + this.id + "&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static ConfigurationException getObject(int id) {
        ConfigurationException obj = (ConfigurationException) new Object();
        obj.id = id;
        return obj;
    }
}

