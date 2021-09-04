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

/**
 * Thread that watches some folders in the permanent directory, and fires {@link PermanentFileEvent} events when file-
 * system events (creation, deletion, modification) occur on files and directories that are watched.
 *
 * @version $Id: ab62cc121daecb6a2709b975aa935a2f1bd144ed $
 */
public class FileWatcherServer extends Thread {

    static final WatchEvent.Kind[] EVENT_KINDS_WATCHED = new WatchEvent.Kind[] { ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY };

    private volatile boolean shouldStop;

    private Path permanentDirectory;

    private WatchService watchService;

    private ObservationManager observationManager;

    private Logger logger = LoggerFactory.getLogger(FileWatcher.class);

    public FileWatcherServer(ComponentManager componentManager) throws InitializationException {
        Preconditions.checkNotNull(componentManager);
        try {
            FilesSettings filesSettings = componentManager.getInstance(FilesSettings.class);
            this.observationManager = componentManager.getInstance(ObservationManager.class);
            this.permanentDirectory = filesSettings.getPermanentDirectory();
            watchService = FileSystems.getDefault().newWatchService();
        } catch (ComponentLookupException | IOException e) {
            throw new InitializationException("Failed to initialize the file watcher.", e);
        }
    }

    @Override
    public void run() {
        for (String root : Arrays.asList("tenants", "themes", "payments")) {
            Path rootToWatch = permanentDirectory.resolve(root);
            if (rootToWatch.toFile().isDirectory()) {
                try {
                    Files.walkFileTree(rootToWatch, new SimpleFileVisitor<Path>() {

                        @Override
                        public FileVisitResult preVisitDirectory(Path directory, BasicFileAttributes attrs) throws IOException {
                            directory.register(watchService, EVENT_KINDS_WATCHED);
                            return FileVisitResult.CONTINUE;
                        }
                    });
                } catch (IOException e) {
                    this.logger.error("Failed to initialize file watcher", e);
                }
            }
        }
        while (!this.shouldStop) {
            try {
                WatchKey watchKey = watchService.poll();
                if (watchKey != null) {
                    List<WatchEvent<?>> events = watchKey.pollEvents();
                    Path watched = (Path) watchKey.watchable();
                    for (WatchEvent event : events) {
                        PermanentFileEvent permanentFileEvent = new PermanentFileEvent();
                        Path context = watched.resolve((Path) event.context());
                        WatchEvent.Kind eventKind = event.kind();
                        PermanentFileEvent.Data memo = new PermanentFileEvent.Data(context, eventKind);
                        observationManager.notify(permanentFileEvent, this, memo);
                        if (eventKind.equals(StandardWatchEventKinds.ENTRY_CREATE) && context.toFile().isDirectory()) {
                            // New directory created : register it against the watch service
                            try {
                                context.register(watchService, EVENT_KINDS_WATCHED);
                            } catch (IOException e) {
                                this.logger.error("Failed to register new directory against watch service", e);
                            }
                        }
                    }
                    watchKey.reset();
                }
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public static WatchEvent.Kind[] getEVENT_KINDS_WATCHED() {
        return EVENT_KINDS_WATCHED;
    }

    public void setShouldStop(boolean shouldStop) {
        this.shouldStop = shouldStop;
    }

    public boolean getShouldStop() {
        return shouldStop;
    }

    public void setPermanentDirectory(Path permanentDirectory) {
        this.permanentDirectory = permanentDirectory;
    }

    public Path getPermanentDirectory() {
        return permanentDirectory;
    }

    public void setWatchService(WatchService watchService) {
        this.watchService = watchService;
    }

    public WatchService getWatchService() {
        return watchService;
    }

    public void setObservationManager(ObservationManager observationManager) {
        this.observationManager = observationManager;
    }

    public ObservationManager getObservationManager() {
        return observationManager;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public Logger getLogger() {
        return logger;
    }
}

