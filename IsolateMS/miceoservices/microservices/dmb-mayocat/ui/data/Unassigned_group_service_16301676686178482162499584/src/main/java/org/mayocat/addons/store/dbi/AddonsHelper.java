/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.addons.store.dbi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.HasAddons;
import org.mayocat.model.Identifiable;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.google.common.collect.Maps;
import mayoapp.dao.AddonsDAO;
import static org.mayocat.addons.util.AddonUtils.asMap;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 65c69480fcb6a3d4c08a8da9edf67f4d3f6b77da $
 */
public class AddonsHelper {

    public static <T extends Identifiable & HasAddons> List<T> withAddons(List<T> entities, AddonsDAO dao) {
        return (List<T>) null;
    }

    public static void createOrUpdateAddons(AddonsDAO dao, HasAddons entity) {
        return;
    }

    public int id = 0;

    public static AddonsHelper getObject(int id) {
        AddonsHelper obj = (AddonsHelper) new Object();
        obj.id = id;
        return obj;
    }
}

