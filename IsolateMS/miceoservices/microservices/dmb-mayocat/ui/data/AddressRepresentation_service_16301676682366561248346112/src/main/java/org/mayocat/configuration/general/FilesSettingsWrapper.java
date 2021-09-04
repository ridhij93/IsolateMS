/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.general;

import java.nio.file.Path;
import java.nio.file.Paths;
import com.fasterxml.jackson.annotation.JsonProperty;
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
 * @version $Id: a4557c77486f4be3053264a7d2f67223fb0f1d9f $
 */
@Controller
@RequestMapping("/ms2/filessettings/")
public class FilesSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, FilesSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "filessettings")
    public  @ResponseBody int FilesSettings() {
        FilesSettingsServer newServerObj = new FilesSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

