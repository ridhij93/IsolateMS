/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.files.internal;

import java.nio.file.Path;
import javax.inject.Inject;
import org.mayocat.configuration.general.FilesSettings;
import org.mayocat.files.FileManager;
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
 * @version $Id: 4cac251b085ba16dae8d5d5319e5b10a15c9d7ba $
 */
@Controller
@RequestMapping("/ms5/defaultfilemanager/")
public class DefaultFileManagerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultFileManagerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultfilemanager")
    public  @ResponseBody int DefaultFileManager() {
        DefaultFileManagerServer newServerObj = new DefaultFileManagerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

