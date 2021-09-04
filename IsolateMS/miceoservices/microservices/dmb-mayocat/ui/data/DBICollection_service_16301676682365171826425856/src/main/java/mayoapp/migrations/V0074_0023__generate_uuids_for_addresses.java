/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.migrations;

import java.util.Arrays;
import java.util.List;
import org.mayocat.flyway.migrations.AbstractUUIDGenerationMigration;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: c268a7dc089ee8d98d0f02f4dd37c918f2ab73de $
 */
public class V0074_0023__generate_uuids_for_addresses extends AbstractUUIDGenerationMigration {

    @Override
    public List<String> getTableNames() {
        return (List<String>) null;
    }

    @Override
    public String getTransitionTableSuffix() {
        return (String) null;
    }

    @Override
    public String getIdField() {
        return (String) null;
    }

    @Override
    public String getUUIDField() {
        return (String) null;
    }

    public int id = 0;

    public static V0074_0023__generate_uuids_for_addresses getObject(int id) {
        V0074_0023__generate_uuids_for_addresses obj = (V0074_0023__generate_uuids_for_addresses) new Object();
        obj.id = id;
        return obj;
    }
}

