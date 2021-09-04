/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.internal;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.model.TenantConfiguration;
import org.mayocat.accounts.store.TenantStore;
import org.mayocat.configuration.ConfigurationService;
import org.mayocat.configuration.ExposedSettings;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.mayocat.configuration.NoSuchModuleException;
import org.mayocat.configuration.jackson.GestaltConfigurationModule;
import org.mayocat.configuration.jackson.TimeZoneModule;
import org.mayocat.context.WebContext;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Maps;
import io.dropwizard.jackson.GuavaExtrasModule;
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
 * @version $Id: f45dc71f51963b3075763ea25c278ebaea6d57c2 $
 */
@Component
public class DefaultConfigurationServiceWrapper {

    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static int maxId = 0;

    public static HashMap<Integer, DefaultConfigurationServiceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultconfigurationservice")
    public  @ResponseBody int DefaultConfigurationService() {
        DefaultConfigurationServiceServer newServerObj = new DefaultConfigurationServiceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

