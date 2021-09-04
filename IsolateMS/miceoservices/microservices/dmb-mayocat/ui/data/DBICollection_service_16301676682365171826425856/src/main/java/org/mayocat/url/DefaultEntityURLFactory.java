/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.url;

import java.net.URL;
import javax.inject.Inject;
import org.apache.commons.lang3.StringUtils;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.model.Entity;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
import com.google.common.base.Preconditions;
import com.google.common.reflect.TypeParameter;
import com.google.common.reflect.TypeToken;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 9405aadc5a34312d76e7f4df5a241bae914fa229 $
 */
@Component
public class DefaultEntityURLFactory extends AbstractGenericEntityURLFactory implements EntityURLFactory {

    @Override
    public URL create(Entity entity, Tenant tenant, URLType type) {
        return (URL) null;
    }

    @Override
    protected String getEntityName(Entity entity) {
        return (String) null;
    }

    static <T extends Entity> TypeToken<EntityURLFactory<T>> entityURLFactoryOf(Class<T> entityType) {
        return (TypeToken<EntityURLFactory<T>>) null;
    }

    public void setComponentManager(ComponentManager componentManager) {
        return;
    }

    public ComponentManager getComponentManager() {
        return (ComponentManager) null;
    }

    public int id = 0;

    public static DefaultEntityURLFactory getObject(int id) {
        DefaultEntityURLFactory obj = (DefaultEntityURLFactory) new Object();
        obj.id = id;
        return obj;
    }
}

