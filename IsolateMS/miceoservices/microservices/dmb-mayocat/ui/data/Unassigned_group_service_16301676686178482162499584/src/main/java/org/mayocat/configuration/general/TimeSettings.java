/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.general;

import java.util.TimeZone;
import javax.validation.Valid;
import org.mayocat.configuration.Configurable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 3bea06081c2f5fdc2503d61fb1ac4f53cdbc92fb $
 */
public class TimeSettings {

    public Configurable<TimeZone> getTimeZone() {
        return (Configurable<TimeZone>) null;
    }

    public void setTimeZone(Configurable<TimeZone> timeZone) {
        return;
    }

    public int id = 0;

    public static TimeSettings getObject(int id) {
        TimeSettings obj = (TimeSettings) new Object();
        obj.id = id;
        return obj;
    }
}

