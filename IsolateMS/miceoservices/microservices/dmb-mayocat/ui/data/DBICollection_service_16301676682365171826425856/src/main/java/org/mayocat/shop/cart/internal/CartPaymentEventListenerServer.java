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

/**
 * @version $Id: a0c8cb8d91190be3eb54eeb7ad2183a6f947bf0b $
 */
@Component
@Named("cartPaymentEventListener")
public class CartPaymentEventListenerServer implements Initializable, org.mayocat.event.EventListener {

    @Inject
    private CartManager cartManager;

    @Inject
    private WebContext webContext;

    @Inject
    private ObservationManager observationManager;

    @Override
    public void initialize() throws InitializationException {
        observationManager.addListener(new Listener());
    }

    private class Listener implements EventListener {

        @Override
        public String getName() {
            return "cartPaymentEventListener";
        }

        @Override
        public List<Event> getEvents() {
            return Arrays.<Event>asList(new ExternalPaymentInitialized(), new OrderPaidEvent());
        }

        @Override
        public void onEvent(Event event, Object source, Object data) {
            if (ExternalPaymentInitialized.class.isAssignableFrom(event.getClass())) {
                cartManager.discardCart();
            } else {
                if (webContext.isAvailable() && !webContext.getSession().isEmpty()) {
                    cartManager.discardCart();
                }
            }
        }
    }

    public void setCartManager(CartManager cartManager) {
        this.cartManager = cartManager;
    }

    public CartManager getCartManager() {
        return cartManager;
    }

    public void setWebContext(WebContext webContext) {
        this.webContext = webContext;
    }

    public WebContext getWebContext() {
        return webContext;
    }

    public void setObservationManager(ObservationManager observationManager) {
        this.observationManager = observationManager;
    }

    public ObservationManager getObservationManager() {
        return observationManager;
    }
}

