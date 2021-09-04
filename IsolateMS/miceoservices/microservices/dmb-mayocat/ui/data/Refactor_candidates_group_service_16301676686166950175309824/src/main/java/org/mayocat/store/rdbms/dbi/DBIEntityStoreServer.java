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

@Component(hints = { "jdbi", "default" })
public class DBIEntityStoreServer implements EntityStore, Initializable {

    @Inject
    private WebContext context;

    @Inject
    private DBIProvider dbi;

    @Inject
    private ObservationManager observationManager;

    private EntityDAO dao;

    public DBIEntityStoreServer() {
    }

    public DBI getDbi() {
        return dbi.get();
    }

    protected UUID getTenant() {
        if (this.context.getTenant() != null) {
            return this.context.getTenant().getId();
        }
        return null;
    }

    @Override
    public void initialize() throws InitializationException {
        this.dao = dbi.get().onDemand(EntityDAO.class);
    }

    protected ObservationManager getObservationManager() {
        return observationManager;
    }

    public void setContext(WebContext context) {
        this.context = context;
    }

    public WebContext getContext() {
        return context;
    }

    public void setDbi(DBIProvider dbi) {
        this.dbi = dbi;
    }

    public void setObservationManager(ObservationManager observationManager) {
        this.observationManager = observationManager;
    }

    public void setDao(EntityDAO dao) {
        this.dao = dao;
    }

    public EntityDAO getDao() {
        return dao;
    }
}

