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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: e1c4089af2f8bd83065ee5c81cbff343c1498fed $
 */
@Controller
@RequestMapping("/ms1/v0300_1005__extract_image_metadata_retroactively/")
public class V0300_1005__extract_image_metadata_retroactivelyWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, V0300_1005__extract_image_metadata_retroactivelyServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "v0300_1005__extract_image_metadata_retroactively")
    public  @ResponseBody int V0300_1005__extract_image_metadata_retroactively() {
        V0300_1005__extract_image_metadata_retroactivelyServer newServerObj = new V0300_1005__extract_image_metadata_retroactivelyServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

