/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.theme;

import javax.validation.Valid;
import org.mayocat.configuration.ExposedSettings;
import org.mayocat.configuration.Configurable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @verison $Id: 8f53d87885e0a90487ec481d6d0064a94b53d79a $
 */
public class ThemeSettingsServer implements ExposedSettings {

    @Valid
    @JsonProperty
    private Configurable<String> active = new Configurable("minimal");

    public Configurable<String> getActive() {
        return active;
    }

    @JsonIgnore
    @Override
    public String getKey() {
        return "theme";
    }

    public void setActive(Configurable<String> active) {
        this.active = active;
    }
}

