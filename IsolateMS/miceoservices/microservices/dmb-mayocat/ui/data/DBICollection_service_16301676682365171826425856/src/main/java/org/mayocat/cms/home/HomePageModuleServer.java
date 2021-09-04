/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.home;

import java.util.ArrayList;
import java.util.List;
import org.mayocat.Module;
import org.mayocat.cms.home.meta.HomePageEntity;
import org.mayocat.meta.EntityMeta;

/**
 * @version $Id: ac66a567ed1c69d2947881ba8a296bcc187fe443 $
 */
public class HomePageModuleServer implements Module {

    private static final List<EntityMeta> entities = new ArrayList<EntityMeta>();

    static {
        entities.add(new HomePageEntity());
    }

    @Override
    public String getName() {
        return "home";
    }

    @Override
    public List<EntityMeta> getEntities() {
        return entities;
    }
}

