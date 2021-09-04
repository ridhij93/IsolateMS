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
 * Thread that watches some folders in the permanent directory, and fires {@link PermanentFileEvent} events when file-
 * system events (creation, deletion, modification) occur on files and directories that are watched.
 *
 * @version $Id: ab62cc121daecb6a2709b975aa935a2f1bd144ed $
 */
@Controller
@RequestMapping("/ms1/filewatcher/")
public class FileWatcherWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, FileWatcherServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "filewatcher")
    public  @ResponseBody int FileWatcher(@RequestParam int componentManagerId) {
        FileWatcherServer newServerObj = new FileWatcherServer(ComponentManager.getObject(componentManagerId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

