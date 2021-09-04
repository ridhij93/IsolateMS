/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.invoicing;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.mayocat.configuration.Configurable;
import org.mayocat.configuration.ExposedSettings;

/**
 * @version $Id: a862cf46025a0b13f0934cc92227fa98f1e3e41f $
 */
public class InvoicingSettingsServer implements ExposedSettings {

    @JsonProperty
    private Configurable<Boolean> enabled = new Configurable<>(Boolean.FALSE);

    @JsonProperty
    public Configurable<String> contentBefore = new Configurable<>();

    @JsonProperty
    public Configurable<String> contentAfter = new Configurable<>();

    @JsonProperty
    public Configurable<String> footerLegalNotice = new Configurable<>();

    public Configurable<Boolean> getEnabled() {
        return enabled;
    }

    public Configurable<String> getContentBefore() {
        return contentBefore;
    }

    public Configurable<String> getContentAfter() {
        return contentAfter;
    }

    public Configurable<String> getFooterLegalNotice() {
        return footerLegalNotice;
    }

    @Override
    public String getKey() {
        return "invoicing";
    }

    public void setEnabled(Configurable<Boolean> enabled) {
        this.enabled = enabled;
    }

    public void setContentBefore(Configurable<String> contentBefore) {
        this.contentBefore = contentBefore;
    }

    public void setContentAfter(Configurable<String> contentAfter) {
        this.contentAfter = contentAfter;
    }

    public void setFooterLegalNotice(Configurable<String> footerLegalNotice) {
        this.footerLegalNotice = footerLegalNotice;
    }
}

