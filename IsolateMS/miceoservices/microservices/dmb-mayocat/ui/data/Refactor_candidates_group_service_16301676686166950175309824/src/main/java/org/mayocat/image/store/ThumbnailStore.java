/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image.store;

import java.util.List;
import java.util.UUID;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.image.model.Thumbnail;
import org.xwiki.component.annotation.Role;

/**
 * @version $Id: 01d85fd874134f58f85d82977179565ac3f17cf4 $
 */
@Role
public interface ThumbnailStore {

    void createOrUpdateThumbnail(Thumbnail thumbnail);

    List<Thumbnail> findAll(Attachment attachment);

    List<Thumbnail> findAllForIds(List<UUID> ids);

    public int id = 0;

    public static ThumbnailStore getObject(int id) {
        return null;
    }
}

