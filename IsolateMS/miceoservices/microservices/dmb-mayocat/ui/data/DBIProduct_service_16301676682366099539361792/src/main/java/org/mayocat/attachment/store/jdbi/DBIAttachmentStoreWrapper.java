/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.attachment.store.jdbi;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.inject.Inject;
import javax.validation.Valid;
import org.apache.commons.io.IOUtils;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.attachment.model.LoadedAttachment;
import org.mayocat.model.Entity;
import org.mayocat.attachment.store.AttachmentStore;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.StoreException;
import mayoapp.dao.AttachmentDAO;
import org.mayocat.store.rdbms.dbi.DBIEntityStore;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import com.google.common.base.Optional;
import com.google.common.base.Strings;
import net.sf.jmimemagic.Magic;
import net.sf.jmimemagic.MagicMatch;
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
 * @version $Id: 5fbaf3b867e8c1f871248b1247ea65bcd45cbbf6 $
 */
@Component(hints = { "jdbi", "default" })
public class DBIAttachmentStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DBIAttachmentStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "dbiattachmentstore")
    public  @ResponseBody int DBIAttachmentStore() {
        DBIAttachmentStoreServer newServerObj = new DBIAttachmentStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

