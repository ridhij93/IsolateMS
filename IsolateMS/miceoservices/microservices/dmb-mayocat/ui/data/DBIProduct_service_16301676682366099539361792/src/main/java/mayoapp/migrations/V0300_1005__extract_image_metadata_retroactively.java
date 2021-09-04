/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.migrations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.mayocat.attachment.model.LoadedAttachment;
import org.mayocat.attachment.store.jdbi.mapper.AttachmentMapper;
import org.mayocat.attachment.store.jdbi.mapper.LoadedAttachmentMapper;
import org.mayocat.flyway.migrations.PG_UUID;
import org.mayocat.image.DefaultImageProcessor;
import org.mayocat.image.ImageDimensionsMetadataExtractor;
import org.mayocat.image.ImageProcessor;
import org.mayocat.jdbi.StatementContextStub;
import org.mayocat.attachment.model.Attachment;
import org.skife.jdbi.v2.StatementContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.googlecode.flyway.core.api.migration.jdbc.JdbcMigration;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: e1c4089af2f8bd83065ee5c81cbff343c1498fed $
 */
public class V0300_1005__extract_image_metadata_retroactively implements JdbcMigration {

    @Override
    public void migrate(Connection connection) throws Exception {
        return;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static V0300_1005__extract_image_metadata_retroactively getObject(int id) {
        V0300_1005__extract_image_metadata_retroactively obj = (V0300_1005__extract_image_metadata_retroactively) new Object();
        obj.id = id;
        return obj;
    }
}

