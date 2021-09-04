/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart.internal;

import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.mayocat.context.WebContext;
import org.mayocat.shop.billing.event.OrderPaidEvent;
import org.mayocat.shop.cart.CartManager;
import org.mayocat.shop.payment.event.ExternalPaymentInitialized;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import org.xwiki.observation.EventListener;
import org.xwiki.observation.ObservationManager;
import org.xwiki.observation.event.Event;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: a0c8cb8d91190be3eb54eeb7ad2183a6f947bf0b $
 */
@Component
@Named("cartPaymentEventListener")
public class CartPaymentEventListener implements Initializable, org.mayocat.event.EventListener {

    @Override
    public void initialize() throws InitializationException {
        return;
    }

    private class Listener implements EventListener {

        @Override
        public String getName() {
            return (String) null;
        }

        @Override
        public List<Event> getEvents() {
            return (List<Event>) null;
        }

        @Override
        public void onEvent(Event event, Object source, Object data) {
            return;
        }
    }

    public void setCartManager(CartManager cartManager) {
        return;
    }

    public CartManager getCartManager() {
        return (CartManager) null;
    }

    public void setWebContext(WebContext webContext) {
        return;
    }

    public WebContext getWebContext() {
        return (WebContext) null;
    }

    public void setObservationManager(ObservationManager observationManager) {
        return;
    }

    public ObservationManager getObservationManager() {
        return (ObservationManager) null;
    }

    public int id = 0;

    public static CartPaymentEventListener getObject(int id) {
        CartPaymentEventListener obj = (CartPaymentEventListener) new Object();
        obj.id = id;
        return obj;
    }
}

