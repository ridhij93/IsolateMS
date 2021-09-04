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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 34783fe2bccbd15b1797da499e548dbc6e1ec3c6 $
 */
@Component(hints = { "default", "jdbi" })
public class DBIThumbnailStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DBIThumbnailStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "dbithumbnailstore")
    public  @ResponseBody int DBIThumbnailStore() {
        DBIThumbnailStoreServer newServerObj = new DBIThumbnailStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

