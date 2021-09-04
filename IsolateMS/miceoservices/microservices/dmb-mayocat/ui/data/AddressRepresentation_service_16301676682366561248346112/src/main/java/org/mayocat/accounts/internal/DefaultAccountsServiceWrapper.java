/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.internal;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.validation.Valid;
import org.mayocat.accounts.AccountsService;
import org.mayocat.accounts.AccountsSettings;
import org.mayocat.accounts.IncompatibleConnectedUserException;
import org.mayocat.accounts.NoSuchPasswordResetKeyException;
import org.mayocat.accounts.NoSuchValidationKeyException;
import org.mayocat.accounts.PasswordDoesNotMeetRequirementsException;
import org.mayocat.accounts.UserAlreadyValidatedException;
import org.mayocat.accounts.UserDataSupplier;
import org.mayocat.accounts.UserNotFoundException;
import org.mayocat.accounts.WrongPasswordException;
import org.mayocat.accounts.model.Role;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.model.TenantConfiguration;
import org.mayocat.accounts.model.User;
import org.mayocat.accounts.passwords.PasswordStrengthChecker;
import org.mayocat.accounts.store.TenantStore;
import org.mayocat.accounts.store.UserStore;
import org.mayocat.configuration.ConfigurationService;
import org.mayocat.configuration.MultitenancySettings;
import org.mayocat.configuration.SiteSettings;
import org.mayocat.configuration.general.GeneralSettings;
import org.mayocat.context.WebContext;
import org.mayocat.mail.MailException;
import org.mayocat.mail.MailTemplate;
import org.mayocat.mail.MailTemplateService;
import org.mayocat.security.PasswordManager;
import org.mayocat.shop.front.WebDataSupplier;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.url.URLHelper;
import org.mayocat.views.Template;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import com.google.common.io.BaseEncoding;
import groovy.text.SimpleTemplateEngine;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class DefaultAccountsServiceWrapper {

    // 
    // Injections
    // -----------------------------------------------------------------------------------------------------------------
    // 
    // Implemented methods
    // -----------------------------------------------------------------------------------------------------------------
    // 
    // Private helpers
    // -----------------------------------------------------------------------------------------------------------------
    private static int maxId = 0;

    public static HashMap<Integer, DefaultAccountsServiceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultaccountsservice")
    public  @ResponseBody int DefaultAccountsService() {
        DefaultAccountsServiceServer newServerObj = new DefaultAccountsServiceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // 
    // Injections
    // -----------------------------------------------------------------------------------------------------------------
    // 
    // Implemented methods
    // -----------------------------------------------------------------------------------------------------------------
    // 
    // Private helpers
    // -----------------------------------------------------------------------------------------------------------------
}

