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
 * @version $Id: 59db20100cf8ef909b31b2af4ade3a5399679274 $
 */
public class V0074_0002__generate_uuids extends AbstractUUIDGenerationMigration {

    @Override
    public List<String> getTableNames() {
        return (List<String>) null;
    }

    @Override
    public String getTransitionTableSuffix() {
        return (String) null;
    }

    public int id = 0;

    public static V0074_0002__generate_uuids getObject(int id) {
        V0074_0002__generate_uuids obj = (V0074_0002__generate_uuids) new Object();
        obj.id = id;
        return obj;
    }
}

