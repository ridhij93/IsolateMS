/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import java.io.File;
import javax.inject.Inject;
import org.mayocat.configuration.general.FilesSettings;
import org.mayocat.context.WebContext;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: db3a364a1976cd413adc903862851be623fc8d0c $
 */
public abstract class AbstractGatewayFactory implements GatewayFactory {

    /**
     * @return this gateway global (server-level) configuration file
     *
     * @param fileName the name of the file to retrieve
     */
    protected File getGlobalConfigurationFile(String fileName) {
        return (File) null;
    }

    /**
     * @return this gateway global (server-level) configuration file
     *
     * @param fileName the name of the file to retrieve
     */
    protected Optional<File> getTenantConfigurationFile(String fileName) {
        return (Optional<File>) null;
    }

    public static String getPAYMENTS_DIRECTORY() {
        return (String) null;
    }

    public static String getTENANTS_DIRECTORY() {
        return (String) null;
    }

    public void setFilesSettings(FilesSettings filesSettings) {
        return;
    }

    public FilesSettings getFilesSettings() {
        return (FilesSettings) null;
    }

    public void setContext(WebContext context) {
        return;
    }

    public WebContext getContext() {
        return (WebContext) null;
    }

    public int id = 0;

    public static AbstractGatewayFactory getObject(int id) {
        AbstractGatewayFactory obj = (AbstractGatewayFactory) new Object();
        obj.id = id;
        return obj;
    }
}

