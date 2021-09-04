/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.security;

import javax.crypto.BadPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.inject.Inject;
import org.apache.commons.codec.binary.Base64;
import org.mayocat.configuration.SecuritySettings;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Strings;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class DefaultCipherWrapper {

    private enum Mode {

        CRYPT, DECRYPT
    }

    private static int maxId = 0;

    public static HashMap<Integer, DefaultCipherServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultcipher")
    public  @ResponseBody int DefaultCipher() {
        DefaultCipherServer newServerObj = new DefaultCipherServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

