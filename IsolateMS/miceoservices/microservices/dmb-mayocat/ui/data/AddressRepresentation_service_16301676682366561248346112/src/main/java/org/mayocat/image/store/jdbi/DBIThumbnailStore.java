/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image.store.jdbi;

import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import org.mayocat.image.store.ThumbnailStore;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.image.model.Thumbnail;
import mayoapp.dao.ThumbnailDAO;
import org.mayocat.store.rdbms.dbi.DBIProvider;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 34783fe2bccbd15b1797da499e548dbc6e1ec3c6 $
 */
@Component(hints = { "default", "jdbi" })
public class DBIThumbnailStore implements ThumbnailStore, Initializable {

    @Override
    public void createOrUpdateThumbnail(Thumbnail thumbnail) {
        return;
    }

    @Override
    public List<Thumbnail> findAll(Attachment attachment) {
        return (List<Thumbnail>) null;
    }

    @Override
    public List<Thumbnail> findAllForIds(List<UUID> ids) {
        return (List<Thumbnail>) null;
    }

    @Override
    public void initialize() throws InitializationException {
        return;
    }

    public void setDbi(DBIProvider dbi) {
        return;
    }

    public DBIProvider getDbi() {
        return (DBIProvider) null;
    }

    public void setDao(ThumbnailDAO dao) {
        return;
    }

    public ThumbnailDAO getDao() {
        return (ThumbnailDAO) null;
    }

    public int id = 0;

    public static DBIThumbnailStore getObject(int id) {
        DBIThumbnailStore obj = (DBIThumbnailStore) new Object();
        obj.id = id;
        return obj;
    }
}

