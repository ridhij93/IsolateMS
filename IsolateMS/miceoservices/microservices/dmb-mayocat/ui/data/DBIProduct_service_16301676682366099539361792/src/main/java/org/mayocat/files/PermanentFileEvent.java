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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * An event related to a permanent file or directory (a file or directory located under the permanent {@link
 * org.mayocat.configuration.general.FilesSettings#getPermanentDirectory()} directory.
 *
 * @version $Id: e6eab927f008be59137e4d9466b8e642411aa9bf $
 */
public class PermanentFileEvent extends AbstractFilterableEvent implements Event {

    /**
     * The event data memo that will be passed along such events (in {@link org.xwiki.observation.ObservationManager#notify(org.xwiki.observation.event.Event,
     * Object, Object)}
     */
    public static final class Data {

        private Path path;

        private WatchEvent.Kind kind;

        public Data(Path path, WatchEvent.Kind kind) {
            String uri = MicroserviceApplication.projectUri + "/msnull/data/data?callerId=" + this.id + "&pathId=path.id&kindId=kind.id";
            int resultTemp = new RestTemplate().getForObject(uri, int.class);
            this.id = resultTemp;
        }

        public Path getPath() {
            return (Path) null;
        }

        public WatchEvent.Kind getKind() {
            return (Kind) null;
        }
    }

    public int id = 0;

    public static PermanentFileEvent getObject(int id) {
        PermanentFileEvent obj = (PermanentFileEvent) new Object();
        obj.id = id;
        return obj;
    }
}

