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

/**
 * The type of a settings field whose value can be overridden at the tenant level. Useful for {@link
 * ExposedSettings} settings classes.
 *
 * @version $Id: ec1261fc58a486d390fc9167ac7634aa2eb0106e $
 */
public class ConfigurableServer<T> {

    @JsonProperty
    private T value;

    @JsonProperty("default")
    private T defaultValue;

    @JsonProperty
    private Boolean configurable = true;

    @JsonProperty
    private Boolean visible;

    public ConfigurableServer() {
    }

    public ConfigurableServer(T defaultValue) {
        this.defaultValue = defaultValue;
    }

    public ConfigurableServer(T defaultValue, boolean configurable) {
        this(defaultValue);
        this.configurable = configurable;
    }

    public ConfigurableServer(T defaultValue, boolean configurable, boolean visible) {
        this(defaultValue, configurable);
        this.visible = visible;
    }

    @JsonIgnore
    @ValidationMethod(message = "Configurable values cannot be invisible")
    public boolean isNotConfigurableAndInvisible() {
        return !(this.isConfigurable() && !this.isVisible());
    }

    public T getDefaultValue() {
        return defaultValue;
    }

    public boolean isConfigurable() {
        return configurable;
    }

    public boolean isVisible() {
        if (this.visible == null) {
            // If the field is configurable, it has to be visible
            // If not, it is invisible by default
            this.visible = configurable;
        }
        return visible;
    }

    @JsonIgnore
    public T getValue() {
        if (value == null) {
            return this.getDefaultValue();
        }
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setDefaultValue(T defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void setConfigurable(Boolean configurable) {
        this.configurable = configurable;
    }

    public Boolean getConfigurable() {
        return configurable;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getVisible() {
        return visible;
    }
}

