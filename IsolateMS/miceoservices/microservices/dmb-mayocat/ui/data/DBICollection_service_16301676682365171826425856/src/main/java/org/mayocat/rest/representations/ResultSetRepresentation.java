/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.representations;

import java.util.List;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 5ae083376ebaf2e57f8603ba682ff07983113d11 $
 */
public class ResultSetRepresentation<E> extends LinkRepresentation {

    public ResultSetRepresentation(String href, Integer number, Integer offset, List<E> items, Integer total) {
        String uri = MicroserviceApplication.projectUri + "/msnull/resultsetrepresentation/resultsetrepresentation?callerId=" + this.id + "&href=href&number=number&offset=offset&itemsId=items.id&total=total";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Integer getOffset() {
        return (Integer) null;
    }

    public Integer getNumber() {
        return (Integer) null;
    }

    public List<E> getItems() {
        return (List<E>) null;
    }

    public Integer getTotal() {
        return (Integer) null;
    }

    public void setTotal(Integer total) {
        return;
    }

    public LinkRepresentation getFirst() {
        return (LinkRepresentation) null;
    }

    public void setFirst(LinkRepresentation first) {
        return;
    }

    public LinkRepresentation getLast() {
        return (LinkRepresentation) null;
    }

    public void setLast(LinkRepresentation last) {
        return;
    }

    public LinkRepresentation getPrevious() {
        return (LinkRepresentation) null;
    }

    public void setPrevious(LinkRepresentation previous) {
        return;
    }

    public LinkRepresentation getNext() {
        return (LinkRepresentation) null;
    }

    public void setNext(LinkRepresentation next) {
        return;
    }

    public void setOffset(Integer offset) {
        return;
    }

    public void setNumber(Integer number) {
        return;
    }

    public void setItems(List<E> items) {
        return;
    }

    public int id = 0;

    public static ResultSetRepresentation getObject(int id) {
        ResultSetRepresentation obj = (ResultSetRepresentation) new Object();
        obj.id = id;
        return obj;
    }
}

