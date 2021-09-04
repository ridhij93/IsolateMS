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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: ab8db0a375971ede7cc6635d6451b48027b14e85 $
 */
@Component("theme")
@InstantiationStrategy(ComponentInstantiationStrategy.getPER_LOOKUP())
public class ThemeGestaltConfigurationSource implements GestaltConfigurationSource {

    @Override
    public Object get() {
        return (Object) null;
    }

    public void setThemeSettings(ThemeSettings themeSettings) {
        return;
    }

    public ThemeSettings getThemeSettings() {
        return (ThemeSettings) null;
    }

    public int id = 0;

    public static ThemeGestaltConfigurationSource getObject(int id) {
        ThemeGestaltConfigurationSource obj = (ThemeGestaltConfigurationSource) new Object();
        obj.id = id;
        return obj;
    }
}

