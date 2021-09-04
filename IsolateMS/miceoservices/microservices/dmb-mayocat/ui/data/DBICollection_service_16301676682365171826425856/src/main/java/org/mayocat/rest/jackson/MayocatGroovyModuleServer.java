/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.jackson;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;
import groovy.lang.GString;

/**
 * Jackson module for the groovy language.
 *
 * @version $Id: 24dec349b2441b5ed1904794a52eee128fd07556 $
 */
public class MayocatGroovyModuleServer extends SimpleModule {

    public MayocatGroovyModuleServer() {
        super(Version.unknownVersion());
        addSerializer(GString.class, new MayocatGroovyGStringSerializer());
    }
}

