/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.validation.ValidationMethod;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * The type of a settings field whose value can be overridden at the tenant level. Useful for {@link
 * ExposedSettings} settings classes.
 *
 * @version $Id: ec1261fc58a486d390fc9167ac7634aa2eb0106e $
 */
public class Configurable<T> {

    public Configurable() {
        String uri = MicroserviceApplication.projectUri + "/ms2/configurable/configurablecallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Configurable(T defaultValue) {
        String uri = MicroserviceApplication.projectUri + "/ms2/configurable/configurable?callerId=" + this.id + "&defaultValueId=defaultValue.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Configurable(T defaultValue, boolean configurable) {
        String uri = MicroserviceApplication.projectUri + "/ms2/configurable/configurable?callerId=" + this.id + "&defaultValueId=defaultValue.id&configurable=configurable";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Configurable(T defaultValue, boolean configurable, boolean visible) {
        String uri = MicroserviceApplication.projectUri + "/ms2/configurable/configurable?callerId=" + this.id + "&defaultValueId=defaultValue.id&configurable=configurable&visible=visible";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @JsonIgnore
    @ValidationMethod(message = "Configurable values cannot be invisible")
    public boolean isNotConfigurableAndInvisible() {
        return (Boolean) null;
    }

    public T getDefaultValue() {
        return (T) null;
    }

    public boolean isConfigurable() {
        return (Boolean) null;
    }

    public boolean isVisible() {
        return (Boolean) null;
    }

    @JsonIgnore
    public T getValue() {
        return (T) null;
    }

    public void setValue(T value) {
        return;
    }

    public void setDefaultValue(T defaultValue) {
        return;
    }

    public void setConfigurable(Boolean configurable) {
        return;
    }

    public Boolean getConfigurable() {
        return (Boolean) null;
    }

    public void setVisible(Boolean visible) {
        return;
    }

    public Boolean getVisible() {
        return (Boolean) null;
    }

    public int id = 0;

    public static Configurable getObject(int id) {
        Configurable obj = (Configurable) new Object();
        obj.id = id;
        return obj;
    }
}

