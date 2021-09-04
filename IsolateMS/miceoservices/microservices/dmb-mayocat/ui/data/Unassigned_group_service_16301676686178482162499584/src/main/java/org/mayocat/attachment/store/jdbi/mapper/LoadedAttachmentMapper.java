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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 0a147fc8454564d1e855fe1523b8849d2403c6fc $
 */
public class LoadedAttachmentMapper implements ResultSetMapper<LoadedAttachment> {

    @Override
    public LoadedAttachment map(int index, ResultSet resultSet, StatementContext ctx) throws SQLException {
        return (LoadedAttachment) null;
    }

    public int id = 0;

    public static LoadedAttachmentMapper getObject(int id) {
        LoadedAttachmentMapper obj = (LoadedAttachmentMapper) new Object();
        obj.id = id;
        return obj;
    }
}

