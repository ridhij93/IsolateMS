/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @version $Id: e606d73733c23cf3de01862a164a23d8a8f40655 $
 */
public interface ExposedSettings extends Serializable {

    @JsonIgnore
    String getKey();

    public int id = 0;

    public static ExposedSettings getObject(int id) {
        return null;
    }
}

