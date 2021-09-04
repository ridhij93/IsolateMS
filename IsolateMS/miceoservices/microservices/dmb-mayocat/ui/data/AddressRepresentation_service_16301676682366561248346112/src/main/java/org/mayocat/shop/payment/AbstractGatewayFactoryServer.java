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

/**
 * @version $Id: db3a364a1976cd413adc903862851be623fc8d0c $
 */
public abstract class AbstractGatewayFactoryServer implements GatewayFactory {

    private static final String PAYMENTS_DIRECTORY = "payments";

    private static final String TENANTS_DIRECTORY = "tenants";

    @Inject
    private FilesSettings filesSettings;

    @Inject
    private WebContext context;

    /**
     * @return this gateway global (server-level) configuration file
     *
     * @param fileName the name of the file to retrieve
     */
    protected File getGlobalConfigurationFile(String fileName) {
        return filesSettings.getPermanentDirectory().resolve(PAYMENTS_DIRECTORY).resolve(this.getId()).resolve(fileName).toFile();
    }

    /**
     * @return this gateway global (server-level) configuration file
     *
     * @param fileName the name of the file to retrieve
     */
    protected Optional<File> getTenantConfigurationFile(String fileName) {
        if (this.context.getTenant() == null) {
            return Optional.absent();
        }
        return Optional.of(filesSettings.getPermanentDirectory().resolve(TENANTS_DIRECTORY).resolve(this.context.getTenant().getSlug()).resolve(PAYMENTS_DIRECTORY).resolve(this.getId()).resolve(fileName).toFile());
    }

    public static String getPAYMENTS_DIRECTORY() {
        return PAYMENTS_DIRECTORY;
    }

    public static String getTENANTS_DIRECTORY() {
        return TENANTS_DIRECTORY;
    }

    public void setFilesSettings(FilesSettings filesSettings) {
        this.filesSettings = filesSettings;
    }

    public FilesSettings getFilesSettings() {
        return filesSettings;
    }

    public void setContext(WebContext context) {
        this.context = context;
    }

    public WebContext getContext() {
        return context;
    }
}

