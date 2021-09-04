/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.context;

import java.io.Serializable;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.model.User;
import org.mayocat.application.AbstractService;
import org.mayocat.authorization.Authenticator;
import org.mayocat.configuration.ConfigurationService;
import org.mayocat.configuration.general.GeneralSettings;
import org.mayocat.configuration.general.LocalesSettings;
import org.mayocat.context.internal.DefaultWebContext;
import org.mayocat.context.internal.ThreadLocalWebContext;
import org.mayocat.context.internal.request.DefaultWebRequest;
import org.mayocat.context.internal.request.DefaultWebRequestBuilder;
import org.mayocat.event.EventListener;
import org.mayocat.multitenancy.TenantResolver;
import org.mayocat.theme.Breakpoint;
import org.mayocat.theme.ThemeManager;
import org.mayocat.theme.UserAgentBreakpointDetector;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.google.common.base.CharMatcher;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Strings;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
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
 * @version $Id: 0e5468cafbdcfdfbfe37bc5fb4b84d348ddf6b2b $
 */
@Component
@Named("requestContextInitializer")
public class RequestContextInitializerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, RequestContextInitializerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "requestcontextinitializer")
    public  @ResponseBody int RequestContextInitializer() {
        RequestContextInitializerServer newServerObj = new RequestContextInitializerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

