/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.localization;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Strings;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.mayocat.application.AbstractService;
import org.mayocat.configuration.ConfigurationService;
import org.mayocat.configuration.LocalizationFilterSettings;
import org.mayocat.configuration.general.GeneralSettings;
import org.mayocat.configuration.general.LocalesSettings;
import org.mayocat.context.WebContext;
import org.mayocat.servlet.ServletFilter;
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
 * Servlet filter for web requests that checks if the language cookie has been set. If it has not been set, tries to
 * find the best locale we can serve according to user agent and available locales for the web site.
 *
 * Future possible improvement: iterate over each locale in ServletRequest#getLocales instead of the first one from
 * ServletRequest#getLocale
 *
 * FIXME: this should be in the localization module but there's a dependency on AbstractService that would introduce
 * a cyclic dependency chain. The proper way to resolve this would be to introduce a component that can resolves if a
 * certain path is an static path, or API path or Web path...
 *
 * @version $Id: ecf4e394691b790c9bedc604046674891df79795 $
 */
@Component("requestLocalizationFilter")
public class RequestLocalizationFilterWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, RequestLocalizationFilterServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "requestlocalizationfilter")
    public  @ResponseBody int RequestLocalizationFilter() {
        RequestLocalizationFilterServer newServerObj = new RequestLocalizationFilterServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

