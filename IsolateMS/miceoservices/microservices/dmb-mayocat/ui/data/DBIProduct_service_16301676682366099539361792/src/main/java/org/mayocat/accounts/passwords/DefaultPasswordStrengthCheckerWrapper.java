/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.passwords;

import javax.inject.Inject;
import org.mayocat.accounts.AccountsSettings;
import org.mayocat.accounts.passwords.PasswordStrengthChecker;
import org.mayocat.accounts.passwords.zxcvbn.ZxcvbnPasswordMeter;
import org.mayocat.configuration.SecuritySettings;
import org.xwiki.component.annotation.Component;
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
 * @version $Id: 0b9364e6ae56b2f9e919c7283ddba06d50e4430a $
 */
@Component
public class DefaultPasswordStrengthCheckerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultPasswordStrengthCheckerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultpasswordstrengthchecker")
    public  @ResponseBody int DefaultPasswordStrengthChecker() {
        DefaultPasswordStrengthCheckerServer newServerObj = new DefaultPasswordStrengthCheckerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

