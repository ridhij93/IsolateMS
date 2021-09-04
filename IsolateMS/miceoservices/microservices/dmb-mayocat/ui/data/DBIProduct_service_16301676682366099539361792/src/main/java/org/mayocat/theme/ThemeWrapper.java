/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.theme;

import java.nio.file.Path;
import com.google.common.base.Objects;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ms1/theme/")
public class ThemeWrapper {

    public enum Type {

        FILE_SYSTEM, CLASSPATH
    }

    // The path of the theme, relative to the root of the "permanent directory" (a.k.a. data dir).
    // For example:
    // * themes/globalTheme/theTheme
    @RequestMapping(method = RequestMethod.GET, value = "getpath")
    public @ResponseBody Integer getPath(@RequestParam int callerId) {
        ThemeServer callerObj = idObjMap.get(callerId);
        Path result = callerObj.getPath();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getparent")
    public @ResponseBody Integer getParent(@RequestParam int callerId) {
        ThemeServer callerObj = idObjMap.get(callerId);
        Theme result = callerObj.getParent();
        return result.id;
    }

    private static int maxId = 0;

    public static HashMap<Integer, ThemeServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "theme")
    public  @ResponseBody int Theme(@RequestParam int pathId, @RequestParam int definitionId) {
        ThemeServer newServerObj = new ThemeServer(Path.getObject(pathId), ThemeDefinition.getObject(definitionId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "theme")
    public  @ResponseBody int Theme(@RequestParam int pathId, @RequestParam int definitionId, @RequestParam int typeId) {
        ThemeServer newServerObj = new ThemeServer(Path.getObject(pathId), ThemeDefinition.getObject(definitionId), Type.getObject(typeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "theme")
    public  @ResponseBody int Theme(@RequestParam int pathId, @RequestParam int definitionId, @RequestParam int parentId) {
        ThemeServer newServerObj = new ThemeServer(Path.getObject(pathId), ThemeDefinition.getObject(definitionId), Theme.getObject(parentId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "theme")
    public  @ResponseBody int Theme(@RequestParam int pathId, @RequestParam int definitionId, @RequestParam int parentId, @RequestParam int typeId) {
        ThemeServer newServerObj = new ThemeServer(Path.getObject(pathId), ThemeDefinition.getObject(definitionId), Theme.getObject(parentId), Type.getObject(typeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "theme")
    public  @ResponseBody int Theme(@RequestParam int pathId, @RequestParam int definitionId, @RequestParam int parentId, @RequestParam int typeId, @RequestParam boolean isValidDefinition) {
        ThemeServer newServerObj = new ThemeServer(Path.getObject(pathId), ThemeDefinition.getObject(definitionId), Theme.getObject(parentId), Type.getObject(typeId), isValidDefinition);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

