/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.files.internal;

import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.mayocat.event.ApplicationStartedEvent;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.component.phase.InitializationException;
import org.xwiki.observation.EventListener;
import org.xwiki.observation.event.Event;
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
 * Initializes the file watcher upon application startup.
 *
 * @version $Id: 14df76d29f1276703789079ac7c0e1e83c361a04 $
 */
@Component
@Named("fileWatcherInitializer")
public class FileWatcherInitializerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, FileWatcherInitializerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "filewatcherinitializer")
    public  @ResponseBody int FileWatcherInitializer() {
        FileWatcherInitializerServer newServerObj = new FileWatcherInitializerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

