/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.files;

import java.nio.file.Path;
import org.xwiki.component.annotation.Role;

/**
 * @version $Id: d13defcde2daa8d6ffbed4e0ec6a350350f92b6c $
 */
@Role
public interface FileManager {

    Path resolvePermanentFilePath(Path path);

    public int id = 0;

    public static FileManager getObject(int id) {
        return null;
    }
}

