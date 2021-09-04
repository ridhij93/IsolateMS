/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.search.elasticsearch.internal;

import java.util.Map;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.model.Entity;
import org.mayocat.search.EntityIndexDocumentPurveyor;
import org.mayocat.search.elasticsearch.AbstractGenericEntityIndexDocumentPurveyor;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
import com.google.common.reflect.TypeParameter;
import com.google.common.reflect.TypeToken;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 58900237be0edced16dc9fe5090a5daff8e03d3e $
 */
@Component
public class DefaultEntityIndexDocumentPurveyor extends AbstractGenericEntityIndexDocumentPurveyor implements EntityIndexDocumentPurveyor {

    @Override
    public Map<String, Object> purveyDocument(Entity entity, Tenant tenant) {
        return (Map<String, Object>) null;
    }

    static <T extends Entity> TypeToken<EntityIndexDocumentPurveyor<T>> indexDocumentPurveyorOf(Class<T> entityType) {
        return (TypeToken<EntityIndexDocumentPurveyor<T>>) null;
    }

    public void setComponentManager(ComponentManager componentManager) {
        return;
    }

    public ComponentManager getComponentManager() {
        return (ComponentManager) null;
    }

    public int id = 0;

    public static DefaultEntityIndexDocumentPurveyor getObject(int id) {
        DefaultEntityIndexDocumentPurveyor obj = (DefaultEntityIndexDocumentPurveyor) new Object();
        obj.id = id;
        return obj;
    }
}

