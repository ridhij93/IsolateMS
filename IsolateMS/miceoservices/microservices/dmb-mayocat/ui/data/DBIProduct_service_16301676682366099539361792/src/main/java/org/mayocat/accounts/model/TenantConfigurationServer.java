/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

/**
 * @version $Id: 4c70951d3f15c43d6f0139ef32c04c9dd75ae313 $
 */
public class TenantConfigurationServer implements Map<String, Serializable> {

    private Map<String, Serializable> data;

    private final Integer version;

    public static final Integer CURRENT_VERSION = 0;

    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public TenantConfigurationServer() {
        this(CURRENT_VERSION);
    }

    public TenantConfigurationServer(final Integer version) {
        this(version, Maps.<String, Serializable>newHashMap());
    }

    public TenantConfigurationServer(final Integer version, final Map<String, Serializable> data) {
        this.version = version;
        this.data = data;
    }

    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Integer getVersion() {
        return this.version;
    }

    public Map<String, Serializable> getData() {
        return ImmutableMap.<String, Serializable>builder().putAll(data).build();
    }

    @Override
    public int size() {
        return this.data.size();
    }

    @Override
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    @Override
    public boolean containsKey(Object o) {
        return this.data.containsKey(o);
    }

    @Override
    public boolean containsValue(Object o) {
        return this.data.containsValue(o);
    }

    @Override
    public Serializable get(Object o) {
        return this.data.get(o);
    }

    @Override
    public Serializable put(String s, Serializable o) {
        return this.data.put(s, o);
    }

    @Override
    public Serializable remove(Object o) {
        return this.data.remove(o);
    }

    @Override
    public void putAll(Map<? extends String, ? extends Serializable> map) {
        this.data.putAll(map);
    }

    @Override
    public void clear() {
        this.data.clear();
    }

    @Override
    public Set<String> keySet() {
        return this.data.keySet();
    }

    @Override
    public Collection<Serializable> values() {
        return this.data.values();
    }

    @Override
    public Set<Entry<String, Serializable>> entrySet() {
        return this.data.entrySet();
    }

    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setData(Map<String, Serializable> data) {
        this.data = data;
    }

    public static Integer getCURRENT_VERSION() {
        return CURRENT_VERSION;
    }
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

