/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.templating.jtwig;

import com.lyncode.jtwig.exception.ResourceException;
import com.lyncode.jtwig.resource.JtwigResource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Stack;
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
 * @version $Id: cad90111ed1942a9fe5b9ae162229a5d79f25422 $
 */
@Controller
@RequestMapping("/ms2/jailedpathjtwigresource/")
public class JailedPathJtwigResourceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, JailedPathJtwigResourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "jailedpathjtwigresource")
    public  @ResponseBody int JailedPathJtwigResource(@RequestParam int jailId, @RequestParam int resourcePathId) {
        JailedPathJtwigResourceServer newServerObj = new JailedPathJtwigResourceServer(Path.getObject(jailId), Path.getObject(resourcePathId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

