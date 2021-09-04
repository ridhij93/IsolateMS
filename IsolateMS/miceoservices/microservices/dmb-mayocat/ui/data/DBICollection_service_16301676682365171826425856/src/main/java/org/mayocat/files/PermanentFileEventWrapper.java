/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.files;

import java.nio.file.Path;
import java.nio.file.WatchEvent;
import org.xwiki.observation.event.AbstractFilterableEvent;
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
 * An event related to a permanent file or directory (a file or directory located under the permanent {@link
 * org.mayocat.configuration.general.FilesSettings#getPermanentDirectory()} directory.
 *
 * @version $Id: e6eab927f008be59137e4d9466b8e642411aa9bf $
 */
@Controller
@RequestMapping("/ms0/permanentfileevent/")
public class PermanentFileEventWrapper {

    /**
     * The event data memo that will be passed along such events (in {@link org.xwiki.observation.ObservationManager#notify(org.xwiki.observation.event.Event,
     * Object, Object)}
     */
    public static final class Data {

        private Path path;

        private WatchEvent.Kind kind;

        public Data(Path path, WatchEvent.Kind kind) {
            this.path = path;
            this.kind = kind;
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, PermanentFileEventServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "permanentfileevent")
    public  @ResponseBody int PermanentFileEvent() {
        PermanentFileEventServer newServerObj = new PermanentFileEventServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

