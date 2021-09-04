/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi;

import java.util.List;
import org.mayocat.model.Entity;
import org.mayocat.store.HasOrderedCollections;
import org.mayocat.store.InvalidMoveOperation;
import org.mayocat.store.rdbms.dbi.dao.util.CollectionUtil;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MoveEntityInListOperation<E extends Entity> {

    public MoveEntityInListOperation(List<E> entities, String fromSlug, String toSlug, HasOrderedCollections.RelativePosition relativePosition) throws InvalidMoveOperation {
        String uri = MicroserviceApplication.projectUri + "/ms1/moveentityinlistoperation/moveentityinlistoperation?callerId=" + this.id + "&entitiesId=entities.id&fromSlug=fromSlug&toSlug=toSlug&relativePositionId=relativePosition.id";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        this.id = resultTemp;
    }

    public List<E> getEntities() {
        return (List<E>) null;
    }

    public List<Integer> getPositions() {
        return (List<Integer>) null;
    }

    public boolean hasMoved() {
        return (Boolean) null;
    }

    public void setEntities(List<E> entities) {
        return;
    }

    public void setPositions(List<Integer> positions) {
        return;
    }

    public void setHasMoved(boolean hasMoved) {
        return;
    }

    public boolean getHasMoved() {
        return (Boolean) null;
    }

    public int id = 0;

    public static MoveEntityInListOperation getObject(int id) {
        MoveEntityInListOperation obj = (MoveEntityInListOperation) new Object();
        obj.id = id;
        return obj;
    }
}

