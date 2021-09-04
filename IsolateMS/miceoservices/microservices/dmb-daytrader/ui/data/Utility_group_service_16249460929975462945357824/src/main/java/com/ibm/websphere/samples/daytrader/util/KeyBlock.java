/**
 * (C) Copyright IBM Corporation 2015.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.AbstractSequentialList;
import java.util.ListIterator;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class KeyBlock extends AbstractSequentialList<Object> {

    /**
     * Constructor for KeyBlock
     */
    public KeyBlock() {
        String uri = MicroserviceApplication.projectUri + "/ms7/keyblock/keyblockcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * Constructor for KeyBlock
     */
    public KeyBlock(int min, int max) {
        String uri = MicroserviceApplication.projectUri + "/ms7/keyblock/keyblock?callerId=" + this.id + "&min=min&max=max";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * @see AbstractCollection#size()
     */
    @Override
    public int size() {
        return (Integer) null;
    }

    /**
     * @see AbstractSequentialList#listIterator(int)
     */
    @Override
    public ListIterator<Object> listIterator(int arg0) {
        return (ListIterator<Object>) null;
    }

    class KeyBlockIterator implements ListIterator<Object> {

        /**
         * @see ListIterator#hasNext()
         */
        @Override
        public boolean hasNext() {
            return (Boolean) null;
        }

        /**
         * @see ListIterator#next()
         */
        @Override
        public synchronized Object next() {
            return (Object) null;
        }

        /**
         * @see ListIterator#hasPrevious()
         */
        @Override
        public boolean hasPrevious() {
            return (Boolean) null;
        }

        /**
         * @see ListIterator#previous()
         */
        @Override
        public Object previous() {
            return (Object) null;
        }

        /**
         * @see ListIterator#nextIndex()
         */
        @Override
        public int nextIndex() {
            return (Integer) null;
        }

        /**
         * @see ListIterator#previousIndex()
         */
        @Override
        public int previousIndex() {
            return (Integer) null;
        }

        /**
         * @see ListIterator#add()
         */
        @Override
        public void add(Object o) {
            return;
        }

        /**
         * @see ListIterator#remove()
         */
        @Override
        public void remove() {
            return;
        }

        /**
         * @see ListIterator#set(Object)
         */
        @Override
        public void set(Object arg0) {
            return;
        }
    }

    public void setMin(int min) {
        return;
    }

    public int getMin() {
        return (Integer) null;
    }

    public void setMax(int max) {
        return;
    }

    public int getMax() {
        return (Integer) null;
    }

    public void setIndex(int index) {
        return;
    }

    public int getIndex() {
        return (Integer) null;
    }

    public int id = 0;

    public static KeyBlock getObject(int id) {
        KeyBlock obj = (KeyBlock) new Object();
        obj.id = id;
        return obj;
    }
}

