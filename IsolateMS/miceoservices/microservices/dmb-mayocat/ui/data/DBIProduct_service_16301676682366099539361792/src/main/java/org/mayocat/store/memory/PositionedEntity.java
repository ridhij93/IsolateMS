/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.memory;

import org.mayocat.model.Identifiable;

/**
 * Helper interface for memory stores dealing with entities that have a position.
 *
 * @version $Id: f377a024e9c03d9dbc6ef0afb0933947b3879aff $
 */
public interface PositionedEntity<T> extends Identifiable {

    Integer getPosition();

    T getEntity();

    void setEntity(T entity);

    public int id = 0;

    public static PositionedEntity getObject(int id) {
        return null;
    }
}

