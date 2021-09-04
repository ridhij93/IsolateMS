/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.memory;

import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.validation.Valid;
import org.mayocat.model.Identifiable;
import org.mayocat.model.Slug;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.Store;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Ordering;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Abstract memory store for entities that maintain a relative order in between their instances.
 *
 * @version $Id: 2dd3877b3a05467951d0752a6ffa328dace56829 $
 */
public abstract class AbstractPositionedEntityMemoryStore<T extends Identifiable, P extends PositionedEntity<T>> implements Store<T, UUID> {

    protected abstract P createForEntity(T entity, Integer position) {
        return (P) null;
    }

    protected Predicate<T> withSlug(final String slug) {
        return (Predicate<T>) null;
    }

    protected List<P> allPositioned() {
        return (List<P>) null;
    }

    protected List<T> all() {
        return (List<T>) null;
    }

    public T findBySlug(String slug) {
        return (T) null;
    }

    public T create(@Valid T entity) throws EntityAlreadyExistsException, InvalidEntityException {
        return (T) null;
    }

    private Integer nextPosition() {
        return (Integer) null;
    }

    public void update(@Valid T entity) throws EntityDoesNotExistException, InvalidEntityException {
        return;
    }

    private P forEntity(T entity) {
        return (P) null;
    }

    public void delete(@Valid T entity) throws EntityDoesNotExistException {
        return;
    }

    public Integer countAll() {
        return (Integer) null;
    }

    public List<T> findAll(Integer number, Integer offset) {
        return (List<T>) null;
    }

    public List<T> findByIds(List<UUID> ids) {
        return (List<T>) null;
    }

    public P findPositionedById(UUID id) {
        return (P) null;
    }

    public T findById(UUID id) {
        return (T) null;
    }

    public void setPositionedToEntity(Function<P, T> positionedToEntity) {
        return;
    }

    public Function<P, T> getPositionedToEntity() {
        return (Function<P, T>) null;
    }

    public void setLock(Object lock) {
        return;
    }

    public Object getLock() {
        return (Object) null;
    }

    public void setPositionOrdering(Function<P, Integer> positionOrdering) {
        return;
    }

    public Function<P, Integer> getPositionOrdering() {
        return (Function<P, Integer>) null;
    }

    public void setStore(BaseEntityMemoryStore<P> store) {
        return;
    }

    public BaseEntityMemoryStore<P> getStore() {
        return (BaseEntityMemoryStore<P>) null;
    }

    public int id = 0;

    public static AbstractPositionedEntityMemoryStore getObject(int id) {
        AbstractPositionedEntityMemoryStore obj = (AbstractPositionedEntityMemoryStore) new Object();
        obj.id = id;
        return obj;
    }
}

