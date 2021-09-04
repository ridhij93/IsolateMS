/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.files.internal;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.mayocat.configuration.general.FilesSettings;
import org.mayocat.files.PermanentFileEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.component.phase.InitializationException;
import org.xwiki.observation.ObservationManager;
import com.google.common.base.Preconditions;
import static java.nio.file.StandardWatchEventKinds.*;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Thread that watches some folders in the permanent directory, and fires {@link PermanentFileEvent} events when file-
 * system events (creation, deletion, modification) occur on files and directories that are watched.
 *
 * @version $Id: ab62cc121daecb6a2709b975aa935a2f1bd144ed $
 */
public class FileWatcher extends Thread {

    public FileWatcher(ComponentManager componentManager) throws InitializationException {
        String uri = MicroserviceApplication.projectUri + "/ms1/filewatcher/filewatcher?callerId=" + this.id + "&componentManagerId=componentManager.id";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public void run() {
        return;
    }

    public static WatchEvent.Kind[] getEVENT_KINDS_WATCHED() {
        return (Kind[]) null;
    }

    public void setShouldStop(boolean shouldStop) {
        return;
    }

    public boolean getShouldStop() {
        return (Boolean) null;
    }

    public void setPermanentDirectory(Path permanentDirectory) {
        return;
    }

    public Path getPermanentDirectory() {
        return (Path) null;
    }

    public void setWatchService(WatchService watchService) {
        return;
    }

    public WatchService getWatchService() {
        return (WatchService) null;
    }

    public void setObservationManager(ObservationManager observationManager) {
        return;
    }

    public ObservationManager getObservationManager() {
        return (ObservationManager) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static FileWatcher getObject(int id) {
        FileWatcher obj = (FileWatcher) new Object();
        obj.id = id;
        return obj;
    }
}

