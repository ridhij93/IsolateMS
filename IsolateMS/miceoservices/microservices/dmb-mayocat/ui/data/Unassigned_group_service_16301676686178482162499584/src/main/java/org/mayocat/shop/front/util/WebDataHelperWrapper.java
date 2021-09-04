/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.util;

import java.util.UUID;
import javax.annotation.Nullable;
import org.mayocat.image.model.Thumbnail;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.model.HasFeaturedImage;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
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
 * Helper for front context builders.
 *
 * @version $Id: 58ba02d166798d06d71756387b696aadb662e70e $
 */
@Controller
@RequestMapping("/ms5/webdatahelper/")
public class WebDataHelperWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, WebDataHelperServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "webdatahelper")
    public  @ResponseBody int WebDataHelper() {
        WebDataHelperServer newServerObj = new WebDataHelperServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

