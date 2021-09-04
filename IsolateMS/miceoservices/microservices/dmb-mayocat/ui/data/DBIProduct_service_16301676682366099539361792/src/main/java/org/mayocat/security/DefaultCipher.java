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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Component
public class DefaultCipher implements Cipher {

    private enum Mode {

        CRYPT, DECRYPT
    }

    public String encrypt(String clearText) throws EncryptionException {
        return (String) null;
    }

    public String decrypt(String secret) throws EncryptionException {
        return (String) null;
    }

    private String crypt(String input, Mode mode) throws EncryptionException {
        return (String) null;
    }

    public void setConfiguration(SecuritySettings configuration) {
        return;
    }

    public SecuritySettings getConfiguration() {
        return (SecuritySettings) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static DefaultCipher getObject(int id) {
        DefaultCipher obj = (DefaultCipher) new Object();
        obj.id = id;
        return obj;
    }
}

