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
 * @version $Id: c4e87dfcd2ff4773f795ded900712a5398b6a8a6 $
 */
public class V0074_0024__generate_uuids_for_payments extends AbstractUUIDGenerationMigration {

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

    public static V0074_0024__generate_uuids_for_payments getObject(int id) {
        V0074_0024__generate_uuids_for_payments obj = (V0074_0024__generate_uuids_for_payments) new Object();
        obj.id = id;
        return obj;
    }
}

