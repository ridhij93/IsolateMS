/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.search.elasticsearch;

import javax.inject.Inject;
import javax.inject.Named;
import org.mayocat.lifecycle.Managed;
import org.mayocat.search.SearchEngine;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Component("elasticsearch")
public class ElasticSearchManaged implements Managed {

    @Override
    public void start() throws Exception {
        return;
    }

    @Override
    public void stop() throws Exception {
        return;
    }

    public void setSearchEngine(SearchEngine searchEngine) {
        return;
    }

    public SearchEngine getSearchEngine() {
        return (SearchEngine) null;
    }

    public int id = 0;

    public static ElasticSearchManaged getObject(int id) {
        ElasticSearchManaged obj = (ElasticSearchManaged) new Object();
        obj.id = id;
        return obj;
    }
}

