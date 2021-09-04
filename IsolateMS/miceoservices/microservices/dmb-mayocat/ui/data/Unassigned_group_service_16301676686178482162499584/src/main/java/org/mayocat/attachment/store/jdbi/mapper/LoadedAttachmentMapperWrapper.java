/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.attachment.store.jdbi.mapper;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.lang3.LocaleUtils;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.attachment.model.AttachmentData;
import org.mayocat.attachment.model.LoadedAttachment;
import org.mayocat.store.rdbms.dbi.mapper.MapperUtils;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
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
 * @version $Id: 0a147fc8454564d1e855fe1523b8849d2403c6fc $
 */
@Controller
@RequestMapping("/ms5/loadedattachmentmapper/")
public class LoadedAttachmentMapperWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, LoadedAttachmentMapperServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "loadedattachmentmapper")
    public  @ResponseBody int LoadedAttachmentMapper() {
        LoadedAttachmentMapperServer newServerObj = new LoadedAttachmentMapperServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

