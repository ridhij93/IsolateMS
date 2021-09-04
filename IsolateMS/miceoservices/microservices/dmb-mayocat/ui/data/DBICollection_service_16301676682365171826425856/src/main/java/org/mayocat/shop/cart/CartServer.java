/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart;

import java.util.Currency;
import java.util.List;
import org.mayocat.shop.shipping.ShippingOption;
import org.mayocat.shop.taxes.PriceWithTaxes;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

/**
 * @version $Id: 0fdc9a4c789311b4b892cbb0d67cacf96873521f $
 */
public class CartServer {

    private final Currency currency;

    private final List<CartItem> items;

    private final PriceWithTaxes itemsTotal;

    private final Optional<ShippingOption> selectedShippingOption;

    private final Optional<PriceWithTaxes> shipping;

    private final PriceWithTaxes total;

    public CartServer(Currency currency, List<CartItem> items, PriceWithTaxes itemsTotal, Optional<ShippingOption> selectedShippingOption, Optional<PriceWithTaxes> shipping) {
        Preconditions.checkNotNull(currency);
        Preconditions.checkNotNull(items);
        Preconditions.checkNotNull(selectedShippingOption);
        Preconditions.checkNotNull(shipping);
        this.currency = currency;
        this.items = items;
        this.itemsTotal = itemsTotal;
        this.selectedShippingOption = selectedShippingOption;
        this.shipping = shipping;
        if (shipping.isPresent()) {
            total = new PriceWithTaxes(itemsTotal.incl().add(shipping.get().incl()), itemsTotal.excl().add(shipping.get().excl()), itemsTotal.vat().add(shipping.get().vat()));
        } else {
            total = itemsTotal;
        }
    }

    public Currency currency() {
        return currency;
    }

    public List<CartItem> items() {
        return items;
    }

    public PriceWithTaxes itemsTotal() {
        return itemsTotal;
    }

    public Optional<ShippingOption> selectedShippingOption() {
        return selectedShippingOption;
    }

    public Optional<PriceWithTaxes> shipping() {
        return shipping;
    }

    public PriceWithTaxes total() {
        return total;
    }

    public Boolean isEmpty() {
        return items.isEmpty();
    }

    public Currency getCurrency() {
        return currency;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public PriceWithTaxes getItemsTotal() {
        return itemsTotal;
    }

    public Optional<ShippingOption> getSelectedShippingOption() {
        return selectedShippingOption;
    }

    public Optional<PriceWithTaxes> getShipping() {
        return shipping;
    }

    public PriceWithTaxes getTotal() {
        return total;
    }
}

