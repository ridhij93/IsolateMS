/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.localization.internal;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import org.mayocat.configuration.general.GeneralSettings;
import org.mayocat.context.WebContext;
import org.mayocat.files.PermanentFileEvent;
import org.mayocat.theme.Theme;
import org.mayocat.localization.ThemeLocalizationService;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import org.xwiki.observation.EventListener;
import org.xwiki.observation.ObservationManager;
import org.xwiki.observation.event.Event;
import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.ibm.icu.text.MessageFormat;
import asia.redact.bracket.properties.Properties;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 130ed07d1da318d29ba30f5a679b4414d66a234c $
 */
@Component
public class DefaultThemeLocalizationServiceWrapper {

    private class FileEventListener implements EventListener {
    }

    private static int maxId = 0;

    public static HashMap<Integer, DefaultThemeLocalizationServiceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultthemelocalizationservice")
    public  @ResponseBody int DefaultThemeLocalizationService() {
        DefaultThemeLocalizationServiceServer newServerObj = new DefaultThemeLocalizationServiceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

