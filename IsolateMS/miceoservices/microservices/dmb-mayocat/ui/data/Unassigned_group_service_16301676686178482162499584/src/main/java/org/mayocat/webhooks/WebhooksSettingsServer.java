/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.webhooks;

import java.util.Collections;
import java.util.List;
import org.mayocat.configuration.Configurable;
import org.mayocat.configuration.ExposedSettings;
import org.xwiki.component.annotation.Component;

/**
 * @version $Id: 64467b54dc77fd3fb10bfda00202567aa206637b $
 */
@Component("webhooks")
public class WebhooksSettingsServer implements ExposedSettings {

    @Override
    public String getKey() {
        return "webhooks";
    }

    private Configurable<List<Hook>> hooks = new Configurable<>(Collections.<Hook>emptyList());

    public Configurable<List<Hook>> getHooks() {
        return hooks;
    }

    public void setHooks(Configurable<List<Hook>> hooks) {
        this.hooks = hooks;
    }
}

