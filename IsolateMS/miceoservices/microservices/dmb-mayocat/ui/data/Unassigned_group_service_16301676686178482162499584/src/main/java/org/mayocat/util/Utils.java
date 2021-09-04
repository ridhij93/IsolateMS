/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.util;

import java.lang.reflect.Type;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 43c2dda627949e0c3d64b375f5a56e1e6d245ccc $
 */
public class Utils {

    /**
     * @param componentManager the component manager used by {@link #getComponent(Type)} and {@link #getComponent(Type,
     * String)}
     */
    public static void setComponentManager(ComponentManager componentManager) {
        String uri = MicroserviceApplication.projectUri + "/ms0/utils/setcomponentmanager?componentManagerId=componentManager.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    /**
     * @return the component manager used by {@link #getComponent(Type)} and {@link #getComponent(Type, String)}
     * @deprecated starting with 4.1M2 use the Component Script Service instead
     */
    public static ComponentManager getComponentManager() {
        return (ComponentManager) null;
    }

    /**
     * Lookup a component by role and hint. ·
     *
     * @param roleType the class (aka role) that the component implements
     * @param roleHint a value to differentiate different component implementations for the same role
     * @return the component's instance
     * @throws RuntimeException if the component cannot be found/initialized, or if the component manager is not
     * initialized
     */
    public static <T> T getComponent(Type roleType, String roleHint) {
        return (T) null;
    }

    /**
     * Lookup a component by role (uses the default hint). ·
     *
     * @param roleType the class (aka role) that the component implements
     * @return the component's instance
     * @throws RuntimeException if the component cannot be found/initialized, or if the component manager is not
     * initialized
     */
    public static <T> T getComponent(Type roleType) {
        return (T) null;
    }

    /**
     * Lookup a XWiki component by role and hint.
     *
     * @param role the class (aka role) that the component implements
     * @param hint a value to differentiate different component implementations for the same role
     * @return the component's instance
     * @throws RuntimeException if the component cannot be found/initialized, or if the component manager is not
     * initialized
     */
    public static <T> T getComponent(Class<T> role, String hint) {
        return (T) null;
    }

    /**
     * Lookup a XWiki component by role (uses the default hint).
     *
     * @param role the class (aka role) that the component implements
     * @return the component's instance
     * @throws RuntimeException if the component cannot be found/initialized, or if the component manager is not
     * initialized
     */
    public static <T> T getComponent(Class<T> role) {
        return (T) null;
    }

    public int id = 0;

    public static Utils getObject(int id) {
        Utils obj = (Utils) new Object();
        obj.id = id;
        return obj;
    }
}

