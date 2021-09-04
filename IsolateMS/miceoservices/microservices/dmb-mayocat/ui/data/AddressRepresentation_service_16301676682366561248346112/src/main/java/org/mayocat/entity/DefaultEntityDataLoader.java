/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.entity;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import org.mayocat.localization.EntityLocalizationService;
import org.mayocat.model.Entity;
import org.mayocat.model.Localized;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 72b43e1cf80333325085b6842f74e830408309db $
 */
@Component
public class DefaultEntityDataLoader implements EntityDataLoader, Initializable {

    public <E extends Entity> EntityData<E> load(E entity, LoadingOption... options) {
        return (EntityData<E>) null;
    }

    public <E extends Entity> List<EntityData<E>> load(List<E> entities, LoadingOption... options) {
        return (List<EntityData<E>>) null;
    }

    public void initialize() throws InitializationException {
        return;
    }

    public void setAssistants(List<DataLoaderAssistant> assistants) {
        return;
    }

    public List<DataLoaderAssistant> getAssistants() {
        return (List<DataLoaderAssistant>) null;
    }

    public void setLocalizationService(EntityLocalizationService localizationService) {
        return;
    }

    public EntityLocalizationService getLocalizationService() {
        return (EntityLocalizationService) null;
    }

    public int id = 0;

    public static DefaultEntityDataLoader getObject(int id) {
        DefaultEntityDataLoader obj = (DefaultEntityDataLoader) new Object();
        obj.id = id;
        return obj;
    }
}

