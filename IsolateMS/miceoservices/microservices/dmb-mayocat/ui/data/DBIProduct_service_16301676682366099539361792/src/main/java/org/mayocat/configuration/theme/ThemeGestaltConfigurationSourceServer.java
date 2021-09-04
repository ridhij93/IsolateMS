/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.theme;

import java.util.List;
import javax.inject.Inject;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.mayocat.theme.ThemeDefinition;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.annotation.InstantiationStrategy;
import org.xwiki.component.descriptor.ComponentInstantiationStrategy;

/**
 * @version $Id: ab8db0a375971ede7cc6635d6451b48027b14e85 $
 */
@Component("theme")
@InstantiationStrategy(ComponentInstantiationStrategy.getPER_LOOKUP())
public class ThemeGestaltConfigurationSourceServer implements GestaltConfigurationSource {

    @Inject
    private ThemeSettings themeSettings;

    @Override
    public Object get() {
        return themeSettings;
    }

    public void setThemeSettings(ThemeSettings themeSettings) {
        this.themeSettings = themeSettings;
    }

    public ThemeSettings getThemeSettings() {
        return themeSettings;
    }
}

