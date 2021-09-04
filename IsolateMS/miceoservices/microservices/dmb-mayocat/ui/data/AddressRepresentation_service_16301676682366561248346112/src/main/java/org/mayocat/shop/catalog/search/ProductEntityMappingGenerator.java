/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.search;

import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import org.mayocat.search.elasticsearch.AbstractGenericEntityMappingGenerator;
import org.mayocat.search.elasticsearch.EntityMappingGenerator;
import org.mayocat.shop.catalog.model.Product;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 0bfb22f0c5051b48aaf1a05f4016872aef1716cb $
 */
@Component("product")
public class ProductEntityMappingGenerator extends AbstractGenericEntityMappingGenerator {

    @Override
    public Class forClass() {
        return (Class) null;
    }

    @Override
    public Map<String, Object> generateMapping() {
        return (Map<String, Object>) null;
    }

    public void setTenantGenerator(EntityMappingGenerator tenantGenerator) {
        return;
    }

    public EntityMappingGenerator getTenantGenerator() {
        return (EntityMappingGenerator) null;
    }

    public int id = 0;

    public static ProductEntityMappingGenerator getObject(int id) {
        ProductEntityMappingGenerator obj = (ProductEntityMappingGenerator) new Object();
        obj.id = id;
        return obj;
    }
}

