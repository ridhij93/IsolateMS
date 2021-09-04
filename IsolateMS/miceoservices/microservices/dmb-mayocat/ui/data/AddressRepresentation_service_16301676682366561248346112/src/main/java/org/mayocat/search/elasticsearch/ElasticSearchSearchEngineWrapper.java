/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.search.elasticsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.action.ActionListener;
import org.elasticsearch.action.ListenableActionFuture;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequest;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsResponse;
import org.elasticsearch.action.admin.indices.mapping.put.PutMappingResponse;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.ImmutableSettings.Builder;
import org.elasticsearch.node.Node;
import org.elasticsearch.node.NodeBuilder;
import org.elasticsearch.search.SearchHit;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.configuration.general.FilesSettings;
import org.mayocat.context.WebContext;
import org.mayocat.model.Entity;
import org.mayocat.model.event.EntityCreatedEvent;
import org.mayocat.model.event.EntityUpdatedEvent;
import org.mayocat.search.EntityIndexDocumentPurveyor;
import org.mayocat.search.SearchEngine;
import org.mayocat.search.SearchEngineException;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import org.xwiki.observation.EventListener;
import org.xwiki.observation.ObservationManager;
import org.xwiki.observation.event.Event;
import io.dropwizard.lifecycle.Managed;
import static org.elasticsearch.index.query.QueryBuilders.queryString;
import static org.elasticsearch.node.NodeBuilder.nodeBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Component("elasticsearch")
@Singleton
public class ElasticSearchSearchEngineWrapper {

    private class SearchEngineEventListener implements EventListener {
    }

    // //////////////////////////////////////////////////////////////////////////////////
    private static int maxId = 0;

    public static HashMap<Integer, ElasticSearchSearchEngineServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "elasticsearchsearchengine")
    public  @ResponseBody int ElasticSearchSearchEngine() {
        ElasticSearchSearchEngineServer newServerObj = new ElasticSearchSearchEngineServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // //////////////////////////////////////////////////////////////////////////////////
}

