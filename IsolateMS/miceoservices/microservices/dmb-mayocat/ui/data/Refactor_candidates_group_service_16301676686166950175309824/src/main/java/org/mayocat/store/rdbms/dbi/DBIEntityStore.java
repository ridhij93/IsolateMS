/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi;

import java.util.UUID;
import javax.inject.Inject;
import org.mayocat.context.WebContext;
import org.mayocat.store.EntityStore;
import org.skife.jdbi.v2.DBI;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import org.xwiki.observation.ObservationManager;
import mayoapp.dao.EntityDAO;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Component(hints = { "jdbi", "default" })
public class DBIEntityStore implements EntityStore, Initializable {

    public DBIEntityStore() {
        String uri = MicroserviceApplication.projectUri + "/ms3/dbientitystore/dbientitystorecallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public DBI getDbi() {
        return (DBI) null;
    }

    protected UUID getTenant() {
        return (UUID) null;
    }

    @Override
    public void initialize() throws InitializationException {
        return;
    }

    protected ObservationManager getObservationManager() {
        return (ObservationManager) null;
    }

    public void setContext(WebContext context) {
        return;
    }

    public WebContext getContext() {
        return (WebContext) null;
    }

    public void setDbi(DBIProvider dbi) {
        return;
    }

    public void setObservationManager(ObservationManager observationManager) {
        return;
    }

    public void setDao(EntityDAO dao) {
        return;
    }

    public EntityDAO getDao() {
        return (EntityDAO) null;
    }

    public int id = 0;

    public static DBIEntityStore getObject(int id) {
        DBIEntityStore obj = (DBIEntityStore) new Object();
        obj.id = id;
        return obj;
    }
}

