/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.jointype;

import java.util.Map;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 68cfd204fc13bb419a87b4bed28c6b2c746fe9b1 $
 */
public class EntityAndCountsJoinRow {

    public Map<String, Long> getCounts() {
        return (Map<String, Long>) null;
    }

    public void setCounts(Map<String, Long> counts) {
        return;
    }

    public Map<String, Object> getEntityData() {
        return (Map<String, Object>) null;
    }

    public void setEntityData(Map<String, Object> entityData) {
        return;
    }

    public int id = 0;

    public static EntityAndCountsJoinRow getObject(int id) {
        EntityAndCountsJoinRow obj = (EntityAndCountsJoinRow) new Object();
        obj.id = id;
        return obj;
    }
}

