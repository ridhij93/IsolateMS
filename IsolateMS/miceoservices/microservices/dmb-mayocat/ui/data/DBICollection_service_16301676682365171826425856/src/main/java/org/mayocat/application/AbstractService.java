/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.application;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import org.mayocat.Module;
import org.mayocat.accounts.AccountsModule;
import org.mayocat.configuration.AbstractSettings;
import org.mayocat.configuration.ExposedSettings;
import org.mayocat.configuration.jackson.NIOModule;
import org.mayocat.configuration.jackson.TimeZoneModule;
import org.mayocat.context.FlashScopeCookieContainerFilter;
import org.mayocat.context.SessionScopeCookieContainerFilter;
import org.mayocat.event.ApplicationStartedEvent;
import org.mayocat.event.EventListener;
import org.mayocat.health.HealthCheck;
import org.mayocat.internal.meta.DefaultEntityMetaRegistry;
import org.mayocat.jackson.PermissiveFuzzyEnumModule;
import org.mayocat.jersey.MayocatFullContextRequestFilter;
import org.mayocat.lifecycle.Managed;
import org.mayocat.localization.LocalizationContainerFilter;
import org.mayocat.meta.EntityMeta;
import org.mayocat.meta.EntityMetaRegistry;
import org.mayocat.multitenancy.MultitenancyContainerFilter;
import org.mayocat.rest.Provider;
import org.mayocat.rest.Resource;
import org.mayocat.rest.jackson.MayocatGroovyModule;
import org.mayocat.rest.jackson.MayocatJodaModule;
import org.mayocat.rest.jackson.MayocatLocaleBCP47LanguageTagModule;
import org.mayocat.rest.jersey.CorsResponseFilter;
import org.mayocat.servlet.ServletFilter;
import org.mayocat.task.Task;
import org.mayocat.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xwiki.component.descriptor.DefaultComponentDescriptor;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.observation.ObservationManager;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.core.ResourceConfig;
import io.dropwizard.Application;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.jackson.GuavaExtrasModule;
import io.dropwizard.jackson.LogbackModule;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 8e7aa259e34077ade733c679d0af55ee6e49cd2c $
 */
public abstract class AbstractService<C extends AbstractSettings> extends Application<C> {

    protected abstract void registerComponents(C configuration, Environment environment) {
        return;
    }

    public static Set<String> getStaticPaths() {
        return (Set<String>) null;
    }

    @Override
    public void initialize(Bootstrap<C> bootstrap) {
        return;
    }

    @Override
    public void run(C configuration, Environment environment) throws Exception {
        return;
    }

    public final void addRequestFilter(Class clazz) {
        return;
    }

    public final void addResponseFilter(Class clazz) {
        return;
    }

    protected void configureObjectMapper() {
        return;
    }

    protected void addModule(Module module) {
        return;
    }

    protected ComponentManager getComponentManager() {
        return (ComponentManager) null;
    }

    protected void initializeComponentManager(C configuration, Environment environment) {
        return;
    }

    private void registerServletFilters(Environment environment) throws ComponentLookupException {
        return;
    }

    private void registerManagedServices(Environment environment) throws ComponentLookupException {
        return;
    }

    private void registerTasks(Environment environment) throws ComponentLookupException {
        return;
    }

    private void registerHealthChecks(Environment environment) throws ComponentLookupException {
        return;
    }

    private void registerEventListeners(Environment environment) throws ComponentLookupException {
        return;
    }

    private void registerResources(Environment environment) throws ComponentLookupException {
        return;
    }

    private void registerProviders(Environment environment) throws ComponentLookupException {
        return;
    }

    private void registerEntityMetaRegistryAsComponent() {
        return;
    }

    private void registerJerseyClient(AbstractSettings settings, Environment environment) {
        return;
    }

    private void registerObjectMapper(ObjectMapper mapper) {
        return;
    }

    private void registerSettingsAsComponents(C settings) {
        return;
    }

    private static List<Field> getAllFields(Class<?> type) {
        return (List<Field>) null;
    }

    public static void setStaticPaths(Set<String> staticPaths) {
        return;
    }

    public static Logger getLOGGER() {
        return (Logger) null;
    }

    public void setComponentManager(EmbeddableComponentManager componentManager) {
        return;
    }

    public void setModules(Map<String, Module> modules) {
        return;
    }

    public Map<String, Module> getModules() {
        return (Map<String, Module>) null;
    }

    public void setRequestFilters(List<Class> requestFilters) {
        return;
    }

    public List<Class> getRequestFilters() {
        return (List<Class>) null;
    }

    public void setResponseFilters(List<Class> responseFilters) {
        return;
    }

    public List<Class> getResponseFilters() {
        return (List<Class>) null;
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        return;
    }

    public ObjectMapper getObjectMapper() {
        return (ObjectMapper) null;
    }

    public int id = 0;

    public static AbstractService getObject(int id) {
        AbstractService obj = (AbstractService) new Object();
        obj.id = id;
        return obj;
    }
}

