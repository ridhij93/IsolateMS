/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.passwords.zxcvbn;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Set;
import javax.annotation.Nullable;
import javax.inject.Inject;
import org.mayocat.configuration.SecuritySettings;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Sets;
import com.google.common.io.Resources;
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
 * zxcvbn.js based password strength checker.
 *
 * See https://tech.dropbox.com/2012/04/zxcvbn-realistic-password-strength-estimation/ and
 * https://github.com/dropbox/zxcvbn
 *
 * @version $Id: 8ef19b8f0737cdda9798cb16e32dce2663e49fc5 $
 */
@Controller
@RequestMapping("/ms1/zxcvbnpasswordmeter/")
public class ZxcvbnPasswordMeterWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ZxcvbnPasswordMeterServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "zxcvbnpasswordmeter")
    public  @ResponseBody int ZxcvbnPasswordMeter() {
        ZxcvbnPasswordMeterServer newServerObj = new ZxcvbnPasswordMeterServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

