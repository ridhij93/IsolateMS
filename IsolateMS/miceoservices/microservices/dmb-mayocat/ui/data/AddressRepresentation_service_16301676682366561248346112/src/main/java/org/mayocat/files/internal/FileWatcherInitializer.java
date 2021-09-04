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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Initializes the file watcher upon application startup.
 *
 * @version $Id: 14df76d29f1276703789079ac7c0e1e83c361a04 $
 */
@Component
@Named("fileWatcherInitializer")
public class FileWatcherInitializer implements EventListener {

    @Override
    public String getName() {
        return (String) null;
    }

    @Override
    public List<Event> getEvents() {
        return (List<Event>) null;
    }

    @Override
    public void onEvent(Event event, Object source, Object memo) {
        return;
    }

    public void setComponentManager(ComponentManager componentManager) {
        return;
    }

    public ComponentManager getComponentManager() {
        return (ComponentManager) null;
    }

    public int id = 0;

    public static FileWatcherInitializer getObject(int id) {
        FileWatcherInitializer obj = (FileWatcherInitializer) new Object();
        obj.id = id;
        return obj;
    }
}

