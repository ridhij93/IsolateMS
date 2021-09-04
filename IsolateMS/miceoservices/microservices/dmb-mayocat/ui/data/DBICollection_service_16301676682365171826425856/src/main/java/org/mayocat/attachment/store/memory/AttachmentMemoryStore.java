/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.attachment.store.memory;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.attachment.model.LoadedAttachment;
import org.mayocat.model.Entity;
import org.mayocat.attachment.store.AttachmentStore;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.memory.BaseEntityMemoryStore;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: bf6aaf4813214581b50c80642da4b8dafd1e2ab6 $
 */
@Component("memory")
public class AttachmentMemoryStore extends BaseEntityMemoryStore<Attachment> implements AttachmentStore {

    private Predicate<Attachment> withExtension(final String... extensions) {
        return (Predicate<Attachment>) null;
    }

    @Override
    public LoadedAttachment findAndLoadById(UUID id) {
        return (LoadedAttachment) null;
    }

    @Override
    public LoadedAttachment findAndLoadBySlug(final String slug) {
        return (LoadedAttachment) null;
    }

    @Override
    public LoadedAttachment findAndLoadBySlugAndExtension(final String fileName, final String extension) {
        return (LoadedAttachment) null;
    }

    @Override
    public LoadedAttachment findAndLoadByTenantAndSlugAndExtension(String tenantSlug, String fileName, String extension) {
        return (LoadedAttachment) null;
    }

    @Override
    public Attachment findBySlugAndExtension(String fileName, String extension) {
        return (Attachment) null;
    }

    @Override
    public Attachment findByTenantAndSlugAndExtension(String tenantSlug, String fileName, String extension) {
        return (Attachment) null;
    }

    @Override
    public List<Attachment> findAllChildrenOf(Entity parent) {
        return (List<Attachment>) null;
    }

    @Override
    public List<Attachment> findAllChildrenOf(Entity parent, List<String> extensions) {
        return (List<Attachment>) null;
    }

    @Override
    public List<Attachment> findAllChildrenOfParentIds(List<UUID> parents) {
        return (List<Attachment>) null;
    }

    @Override
    public List<Attachment> findAllChildrenOfParentIds(List<UUID> parents, List<String> extensions) {
        return (List<Attachment>) null;
    }

    @Override
    public void detach(Attachment attachment) throws EntityDoesNotExistException {
        return;
    }

    public static Function<Attachment, LoadedAttachment> getCAST_AS_LOADED_ATTACHMENT() {
        return (Function<Attachment, LoadedAttachment>) null;
    }

    public int id = 0;

    public static AttachmentMemoryStore getObject(int id) {
        AttachmentMemoryStore obj = (AttachmentMemoryStore) new Object();
        obj.id = id;
        return obj;
    }
}

