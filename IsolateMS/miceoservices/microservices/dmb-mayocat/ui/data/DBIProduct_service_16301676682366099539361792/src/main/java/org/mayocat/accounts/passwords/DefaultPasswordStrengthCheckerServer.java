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

/**
 * zxcvbn.js based password strength checker.
 *
 * See https://tech.dropbox.com/2012/04/zxcvbn-realistic-password-strength-estimation/ and
 * https://github.com/dropbox/zxcvbn
 *
 * @version $Id: 0b9364e6ae56b2f9e919c7283ddba06d50e4430a $
 */
@Component
public class DefaultPasswordStrengthCheckerServer implements PasswordStrengthChecker {

    @Inject
    private AccountsSettings accountsSettings;

    private ZxcvbnPasswordMeter meter = new ZxcvbnPasswordMeter().inputs("Mayocat", "MayocatShop");

    @Override
    public boolean checkLength(String password) {
        return password.length() >= accountsSettings.getPasswordRequirements().getMinimalLength();
    }

    @Override
    public boolean checkEntropy(String password) {
        if (!accountsSettings.getPasswordRequirements().getMinimalEntropyBits().isPresent()) {
            return true;
        }
        return meter.getStrength(password).getEntropy() >= accountsSettings.getPasswordRequirements().getMinimalEntropyBits().get();
    }

    public void setAccountsSettings(AccountsSettings accountsSettings) {
        this.accountsSettings = accountsSettings;
    }

    public AccountsSettings getAccountsSettings() {
        return accountsSettings;
    }

    public void setMeter(ZxcvbnPasswordMeter meter) {
        this.meter = meter;
    }

    public ZxcvbnPasswordMeter getMeter() {
        return meter;
    }
}

