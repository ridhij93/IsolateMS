/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.search.elasticsearch;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.elasticsearch.common.collect.Maps;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.context.WebContext;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.Association;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.model.Entity;
import org.mayocat.model.HasFeaturedImage;
import org.mayocat.model.Identifiable;
import org.mayocat.model.Slug;
import org.mayocat.model.annotation.DoNotIndex;
import org.mayocat.model.annotation.Index;
import org.mayocat.search.EntityIndexDocumentPurveyor;
import org.mayocat.attachment.store.AttachmentStore;
import org.mayocat.url.EntityURLFactory;
import org.mayocat.url.URLType;
import org.slf4j.Logger;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: c7e987371d8b31b8a2f009d98829baa73259609d $
 */
public abstract class AbstractGenericEntityIndexDocumentPurveyor<E extends Entity> implements EntityIndexDocumentPurveyor<E> {

    public AbstractGenericEntityIndexDocumentPurveyor() {
        String uri = MicroserviceApplication.projectUri + "/msnull/abstractgenericentityindexdocumentpurveyor/abstractgenericentityindexdocumentpurveyorcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public Map<String, Object> purveyDocument(E entity) {
        return (Map<String, Object>) null;
    }

    @Override
    public Map<String, Object> purveyDocument(E entity, Tenant tenant) {
        return (Map<String, Object>) null;
    }

    protected Map<String, Object> extractSourceFromEntity(Entity entity, Tenant tenant) {
        return (Map<String, Object>) null;
    }

    private Map<String, Object> extractAddons(Map<String, AddonGroup> addons) throws IOException {
        return (Map<String, Object>) null;
    }

    private boolean isAddonField(Class fieldClass, Field field) {
        return (Boolean) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public void setContext(WebContext context) {
        return;
    }

    public WebContext getContext() {
        return (WebContext) null;
    }

    public void setAttachmentStore(AttachmentStore attachmentStore) {
        return;
    }

    public AttachmentStore getAttachmentStore() {
        return (AttachmentStore) null;
    }

    public void setEntityURLFactory(EntityURLFactory entityURLFactory) {
        return;
    }

    public EntityURLFactory getEntityURLFactory() {
        return (EntityURLFactory) null;
    }

    public int id = 0;

    public static AbstractGenericEntityIndexDocumentPurveyor getObject(int id) {
        AbstractGenericEntityIndexDocumentPurveyor obj = (AbstractGenericEntityIndexDocumentPurveyor) new Object();
        obj.id = id;
        return obj;
    }
}

